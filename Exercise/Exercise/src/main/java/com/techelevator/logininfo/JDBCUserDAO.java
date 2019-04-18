package com.techelevator.logininfo;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.bouncycastle.util.encoders.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class JDBCUserDAO implements UserDAO {

	private JdbcTemplate jdbcTemplate;
	private PasswordHasher passwordHasher;

	@Autowired
	public JDBCUserDAO(DataSource dataSource, PasswordHasher passwordHasher) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.passwordHasher = passwordHasher;
	}

	/*
	 * @param user - its calling an user object to send the data to db
	 * return type is void
	 * In this method, password hashing happen here before send to databse
	 * after saving all the user, it will also create the user authority (not yet Completed)
	 */
	@Override
	public void createUser(User user) {
		byte[] salt = passwordHasher.generateRandomSalt();
		String hashedPassword = passwordHasher.computeHash(user.getPassword(), salt);
		String saltString = new String(Base64.encode(salt));
		
		LocalDateTime a = LocalDateTime.now();
		user.setDateTime(a);
		
		user.setUserRole("USER");
		String sql = "INSERT INTO users (name,username,email,password,salt,location,gender,fromdate, userrole) " + "VALUES(?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, user.getName(), user.getUserName(), user.getEmail(), hashedPassword, saltString,
				user.getLocation(), user.getGender(), user.getDateTime(),user.getUserRole());
	}

	/*
	 * @Param - call the user object
	 * insert the loging log by creating it inside the database
	 */
	@Override
	public void createLoginRecord(User saveLoginLog) {
		String sql = "INSERT INTO loginlog (username,date_time) " + "VALUES(?,?)";
		jdbcTemplate.update(sql, saveLoginLog.getUserName(), saveLoginLog.getDateTime());
	}
	
	/*
	 * @Param {username, email, password) - takes three argument to check the right user from login
	 * @Return boolean - true if the user information match in the record, else false
	 */
	@Override
	public boolean isUsernameAndPasswordValid(String userName, String email, String password) {
		String sqlSearchForUser = "SELECT * FROM users WHERE UPPER(username) = ? OR UPPER(email)=?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchForUser, userName.toUpperCase(), email.toUpperCase());
		if (results.next()) {
			String storedSalt = results.getString("salt");
			String storedPassword = results.getString("password");
			String hashedPassword = passwordHasher.computeHash(password, Base64.decode(storedSalt));		
			return storedPassword.equals(hashedPassword);
		} else {
			return false;
		}
	}

	/*
	 * Simply look of the information inside the database to check if user input username is exist or not
	 */
	@Override
	public User findUserByUsername(String userName) {
		User user = null;
		String userSql = "SELECT username FROM users WHERE username=?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(userSql, userName);
		if (result.next()) {
			user = maptoUserRowSet(result);
		}
		return user;

	}
	
	private User maptoUserRowSet(SqlRowSet result) {
		User user = new User();
		user.setUserName(result.getString("username"));
		return user;

	}
	
	/*
	 * might get delete
	 */
	@Override
	public User findNameByUserName(String userName) {
		User user = null;
		String userSql = "SELECT name FROM users WHERE username=?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(userSql, userName);
		if (result.next()) {
			user = mapToNameRowSet(result);
		}
		return user;
	}
	
	private User mapToNameRowSet(SqlRowSet result) {
		User user = new User();
		user.setName(result.getString("name"));
		return user;

	}

	/*
	 * Simply look of the information inside the database to check if user input email is exist or not
	 */
	@Override
	public User findUserByEmail(String email) {
		User user = null;
		String userSql = "SELECT email FROM users WHERE email=?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(userSql, email);
		if (result.next()) {
			user = mapUserEmailRowSet(result);
		}
		return user;

	}

	private User mapUserEmailRowSet(SqlRowSet result) {
		User user = new User();
		user.setEmail(result.getString("email"));
		return user;

	}
	
	@Override
	public User findUserRoleByUserName(User userRole) {
		User user = null;
		String userName = userRole.getUserName();
		String userRoleSql = "SELECT userrole FROM users WHERE username=?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(userRoleSql, userName);
		if (result.next()) {
			user = mapUserRoleFromUserRowSet(result);
		}
		return user;

	}
	
	private User mapUserRoleFromUserRowSet(SqlRowSet result) {
		User user = new User();
		user.setUserRole(result.getString("userrole"));
		return user;

	}

	

	

}
