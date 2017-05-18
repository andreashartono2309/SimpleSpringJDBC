package com.icecube.springmvc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;

import com.icecube.springmvc.model.User;
 
public class UserMapper implements RowMapper<User> {
 
    public static final String BASE_SQL = //
            "Select u.username,u.password,u.description,u.usergroup "//
                    + " from User u ";
 
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
    	String username = rs.getString("username");
        String password = rs.getString("password");
        String description = rs.getString("description");
        String usergroup = rs.getString("usergroup");
 
        return new User(username,password,description,usergroup);
    }
 
}
