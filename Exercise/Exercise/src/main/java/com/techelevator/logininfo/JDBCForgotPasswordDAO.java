package com.techelevator.logininfo;

import javax.sql.DataSource;

import org.bouncycastle.util.encoders.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCForgotPasswordDAO implements ForgotPasswordDAO {
	private JdbcTemplate jdbcTemplate;
	private PasswordHasher passwordHasher;

	@Autowired
	public JDBCForgotPasswordDAO(DataSource dataSource, PasswordHasher passwordHasher) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.passwordHasher = passwordHasher;
	}

	@Override
	public ForgotPassword findUserByUsername(String userName) {
		ForgotPassword user = null;
		String userSql = "SELECT username FROM users WHERE username=?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(userSql, userName);
		if (result.next()) {
			user = maptoUserRowSet(result);
		}
		return user;

	}
	
	private ForgotPassword maptoUserRowSet(SqlRowSet result) {
		ForgotPassword user = new ForgotPassword();
		user.setUserName(result.getString("username"));
		return user;

	}

	@Override
	public void updatePaswordByUserName(String password, String userName) {
		ForgotPassword user=new ForgotPassword();
		user.setPassword(password);
		byte[] salt = passwordHasher.generateRandomSalt();
		String hashedPassword = passwordHasher.computeHash(user.getPassword(), salt);
		String saltString = new String(Base64.encode(salt));
		
		String sql = "UPDATE users SET password = ?, salt = ? WHERE username = ?";
		jdbcTemplate.update(sql,hashedPassword,saltString,userName);
		
	}
}
