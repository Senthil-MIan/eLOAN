package com.iiht.evaluation.eloan.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.iiht.evaluation.eloan.dto.UserDto;
import com.iiht.evaluation.eloan.model.User;

public class UserDao {
	public UserDto getUser(ConnectionDao connection, User user) throws SQLException {
		UserDto userDto = null;
	        try {
	            Statement stmt = connection.connect().createStatement();
	            	//	createStatement();
	            String query = "SELECT * FROM eloan.users WHERE username='"+user.getUsername()+"' AND password='"+user.getPassword()+"';";
	            ResultSet rs = stmt.executeQuery(query);

	            {
	            	if(rs.next())
	            	userDto = new UserDto(rs.getInt("userid"),rs.getString("username"),rs.getString("password"),rs.getString("role"));
	            }

	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }finally {
	        	connection.disconnect();
	        }

	    return userDto;
	}
	public boolean registerUser(ConnectionDao connection, User user) throws SQLException {
		UserDto userDto = null;
	        try {
	            //Statement stmt = connection.connect().createStatement();
	            	//	createStatement();
	            PreparedStatement ps = connection.connect().prepareStatement("INSERT INTO eloan.users VALUES (NULL, ?, ?, ?, ?)");
	            ps.setString(1, user.getUsername());
	            ps.setString(2, user.getPassword());
	            ps.setString(3, "user");
	            ps.setString(4, user.getFullName());
	            int i = ps.executeUpdate();

	          if(i == 1) {
	            return true;
	          }

	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }finally {
	        	connection.disconnect();
	        }

	    return false;
	}
}
