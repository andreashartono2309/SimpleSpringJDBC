package com.icecube.springmvc.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.icecube.springmvc.model.User;

@Service
public class UserDAO extends JdbcDaoSupport {

	
	@Autowired
    public UserDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
 

	public boolean validateUser(String username,String password) {
		String SQL = "select count(*) from User where username = ? and password= ?";
		int rowCount = this.getJdbcTemplate().queryForObject(SQL, Integer.class, username, password);
		boolean found = (rowCount > 0) ? true:false;
		return found;
	}

	public void insert(User user) {

		String SQL = "insert into user (username, password) values (?, ?)";
		this.getJdbcTemplate().update(SQL, user.getUsername(), user.getPassword());
		return;

	}

}
