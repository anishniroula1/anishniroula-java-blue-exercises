package com.techelevator.image;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JDBCImageDAO implements ImageDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCImageDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void saveImage(Image saveImage) {
		String sql = "INSERT INTO image (name, imagename) VALUES (?, ?);";
		jdbcTemplate.update(sql, saveImage.getName(), saveImage.getImageName());	
	}

}
