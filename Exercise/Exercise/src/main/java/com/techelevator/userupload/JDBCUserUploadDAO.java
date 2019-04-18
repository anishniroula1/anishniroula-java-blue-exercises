package com.techelevator.userupload;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCUserUploadDAO implements UserUploadDAO {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCUserUploadDAO(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Override
	public List<UserUpload> getAllList() {
		List<UserUpload> user = new ArrayList<UserUpload>();
		String sql = "SELECT * FROm userupload";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		while (result.next()) {
			UserUpload u = mapRowToUserUpload(result);
			user.add(u);
		}
		return user;
	}
	
	@Override
	public UserUpload readyById(long id) {
		UserUpload user = null;
		String sql = "SELECT * FROM userupload WHERE id=?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql,id);
		if(result.next()) {
			user = mapRowToUserUpload(result);
		}
		return user;
	}
	
	@Override
	public void saveUserUpload(UserUpload user) {
		String sql = "INSERT INTO userupload (id,username, profilepicture, regularupload, filelocation, "
				+ "userpost, date_time) VALUES (DEFAULT,?, ?, ?, ?, ?, ?)";
		LocalDateTime a = LocalDateTime.now();
		user.setDateTime(a);
		jdbcTemplate.update(sql,user.getUserName(),user.getProfilePicture(),user.getRegularUpload(),
				user.getFileLocation(),user.getUserPost(),user.getDateTime());	
	}
	
	@Override
	public void updateById(UserUpload user, long id) {
		String sql = "UPDATE userupload SET username = ?, profilepicture = ?, regularupload = ?, "
				+ "filelocation = ?, userpost = ?, date_time = ? WHERE id = ?"; 
		LocalDateTime a = LocalDateTime.now();
		user.setDateTime(a);
		
		jdbcTemplate.update(sql,user.getUserName(),user.getProfilePicture(),user.getRegularUpload(),
		user.getFileLocation(),user.getUserPost(),user.getDateTime(),id);
		
	}
	
	@Override
	public void deleteById(long id) {
		String sql = "DELETE FROM userupload WHERE id=?";
		jdbcTemplate.update(sql,id);	
	}

	/*
	 * id username profilepicture regularupload filelocation userpost date_time
	 */

	private UserUpload mapRowToUserUpload(SqlRowSet result) {
		UserUpload u = new UserUpload();
		u.setId(result.getLong("id"));
		u.setUserName(result.getString("username"));
		u.setProfilePicture(result.getString("profilepicture"));
		u.setRegularUpload(result.getString("regularupload"));
		u.setFileLocation(result.getString("filelocation"));
		u.setUserPost(result.getString("userpost"));
		if (result.getDate("date_time") != null) {
			u.setDateTime(result.getTimestamp("date_time").toLocalDateTime());
		}

		return u;

	}




}
