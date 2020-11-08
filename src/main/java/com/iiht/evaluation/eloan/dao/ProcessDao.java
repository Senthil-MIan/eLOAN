package com.iiht.evaluation.eloan.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.iiht.evaluation.eloan.dto.ProcessDto;
import com.iiht.evaluation.eloan.dto.UserDto;
import com.iiht.evaluation.eloan.model.Process;

public class ProcessDao {
	public ProcessDto getLoan(ConnectionDao connection, int ApplicationNumber) throws SQLException {
		ProcessDto processDto = null;
	        try {
	            Statement stmt = connection.connect().createStatement();
	            	//	createStatement();
	            String query = "SELECT * FROM eloan.loan WHERE app_num="+ApplicationNumber+";";
	            ResultSet rs = stmt.executeQuery(query);

	            
	            	if(rs.next())
	            	processDto = new ProcessDto(rs.getInt("app_num"), rs.getString("loan_name"),rs.getFloat("loan_amount"),rs.getDate("application_date"),rs.getString("business"),rs.getString("billing_indicator"),rs.getString("tax_indicator"),rs.getString("address"),rs.getString("mobile"),rs.getString("email"),rs.getString("status"));
	            			

	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }finally {
	        	connection.disconnect();
	        }

	    return processDto;
	}
	
}
