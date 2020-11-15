package com.iiht.evaluation.eloan.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iiht.evaluation.eloan.dto.LoanDto;
import com.iiht.evaluation.eloan.dto.ProcessDto;
import com.iiht.evaluation.eloan.dto.UserDto;
import com.iiht.evaluation.eloan.model.Process;
import com.iiht.evaluation.eloan.model.User;

public class ProcessDao {
	public ProcessDto getLoan(ConnectionDao connection, int ApplicationNumber) throws SQLException {
		ProcessDto processDto = null;
	        try {
	            Statement stmt = connection.connect().createStatement();
	            	//	createStatement();
	            String query = "SELECT * FROM eloan.loan WHERE app_num="+ApplicationNumber+";";
	            ResultSet rs = stmt.executeQuery(query);

	            
	            	if(rs.next())
	            	//processDto = new ProcessDto(rs.getInt("app_num"), rs.getString("loan_name"),rs.getFloat("loan_amount"),rs.getDate("application_date"),rs.getString("business"),rs.getString("billing_indicator"),rs.getString("tax_indicator"),rs.getString("address"),rs.getString("mobile"),rs.getString("email"),rs.getString("status"),rs.getString("customer_name"));
	            		processDto = new ProcessDto(rs.getInt("app_num"), 
	            				rs.getString("loan_name"),
	            				rs.getFloat("loan_amount"),
	            				rs.getString("application_date"),
	            				rs.getString("business"),
	            				rs.getString("billing_indicator"),
	            				rs.getString("tax_indicator"),
	            				rs.getString("address"),
	            				rs.getString("mobile"),
	            				rs.getString("email"),
	            				rs.getString("status"),
	            				rs.getFloat("amount_sanctioned"),
	            				rs.getFloat("term"),
	            				rs.getString("payment_start_date"),
	            				rs.getString("closure_date"),
	            				rs.getFloat("monthly_payment"),
	            				rs.getFloat("interest_rate"),
	            				rs.getString("customer_name"));		

	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }finally {
	        	connection.disconnect();
	        }

	    return processDto;
	}
	
	
	public List<ProcessDto> getAllLoan(ConnectionDao connection) throws SQLException {
		List<ProcessDto>  processDtoList  = new ArrayList<>();
	        try {
	            Statement stmt = connection.connect().createStatement();
	            	//	createStatement();
	            String query = "SELECT * FROM eloan.loan";
	            ResultSet rs = stmt.executeQuery(query);

	            
	            while (rs.next()) {
	       ProcessDto PDto= new ProcessDto(rs.getInt("app_num"), 
            				rs.getString("loan_name"),
            				rs.getFloat("loan_amount"),
            				rs.getString("application_date"),
            				rs.getString("business"),
            				rs.getString("billing_indicator"),
            				rs.getString("tax_indicator"),
            				rs.getString("address"),
            				rs.getString("mobile"),
            				rs.getString("email"),
            				rs.getString("status"),
            				rs.getFloat("amount_sanctioned"),
            				rs.getFloat("term"),
            				rs.getString("payment_start_date"),
            				rs.getString("closure_date"),
            				rs.getFloat("monthly_payment"),
            				rs.getFloat("interest_rate"),
            				rs.getString("customer_name"));	
					
	            	processDtoList.add(PDto);
				}

	        } 
	        catch (SQLException ex) {
	            ex.printStackTrace();
	        }finally {
	        	connection.disconnect();
	        }

	    return processDtoList;
	}
	public boolean updateLoan(ConnectionDao connection,  Process process) throws SQLException {
		ProcessDto processDto = null;
	        try {
	            Statement stmt = connection.connect().createStatement();
	            	//	createStatement();
	           // PreparedStatement ps = connection.connect().prepareStatement("INSERT INTO eloan.users VALUES (NULL, ?, ?, ?, ?)");
	           // ps.setString(1, user.getUsername());
	           // ps.setString(2, user.getPassword());
	            //String query = "update eloan.loan set status="+process.getLoanStatus()+" WHERE app_num="+process.getApplicationNumber()+";";
	            //ResultSet rs = stmt.executeQuery(query);
	            
	            PreparedStatement ps;
	            String sql="Update eloan.loan set status=?,monthly_payment=?,interest_rate=?,term=?,payment_start_date=?,closure_date=?,amount_sanctioned=? where app_num="+process.getApplicationNumber()+";";
	            ps = connection.connect().prepareStatement(sql);
	            ps.setString(1,process.getLoanStatus());
	            ps.setFloat(2,process.getEmi());
	            ps.setFloat(3,process.getInterestRate());
	            ps.setInt(4,process.getTerm());
				/* java.util.Date utilDate = new java.util.Date(); */
				/*
				 * java.sql.Date sqlDate = new
				 * java.sql.Date(process.getPayStartDate().getTime()); ps.setDate(4,sqlDate);
				 * java.sql.Date sqlDate1 = new
				 * java.sql.Date(process.getClosureDate().getTime()); ps.setDate(5,sqlDate1);
				 * ps.setObject(6,process.getAmountSanctioned());
				 */
	            ps.setString(5, process.getPayStartDate());
	            ps.setString(6,process.getClosureDate());
	            ps.setObject(7,process.getAmountSanctioned());
	            
	            
	            
				/*
				 * ps.setString(2, first_name); ps.setString(3, last_name); ps.setString(4,
				 * city_name); ps.setString(5, email);
				 */
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

	public ProcessDto getProcess(ConnectionDao connDao, Process process) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean applyLoan(ConnectionDao connection, Process process) throws SQLException {
		//ProcessDto pDto = null;
	        try {
	            //Statement stmt = connection.connect().createStatement();
	            	//	createStatement();
	            PreparedStatement ps = connection.connect().prepareStatement("INSERT INTO eloan.loan (loan_name,customer_name,loan_amount,application_date,business,billing_indicator,address,mobile,email) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				/* ps.setString(1, process.getUserid()); */
	            ps.setString(1, process.getLoanName());
	            ps.setString(2, process.getCustomerName());
	            ps.setFloat(3, process.getLoanAmount());
	            ps.setString(4, process.getApplicationDate());
	            ps.setString(5, process.getBusinessStructure());
	            ps.setString(6, process.getBillingIndicator());
	            ps.setString(7, process.getAddress());
	            ps.setString(8, process.getMobile());
	            ps.setString(9, process.getEmail());
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
	
	public String getLoanStatus(ConnectionDao connection, int ApplicationNumber) throws SQLException {
		//ProcessDto processDto = null;
		String status=null;
	        try {
	            Statement stmt = connection.connect().createStatement();
	            	//	createStatement();
	            String query = "SELECT status FROM eloan.loan ="+ApplicationNumber+";";
	            ResultSet rs = stmt.executeQuery(query);
	            if(rs.next()) {
	            	status=rs.getString("status");
	            }

	            
				/*
				 * if(rs.next()) 
				 * processDto = new ProcessDto(rs.getString("status"));
				 */
	            			

	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }finally {
	        	connection.disconnect();
	        }

	    return status;
	}
	
	public boolean loanUpdate(ConnectionDao connection, Process process) throws SQLException {
		//ProcessDto processDto = null;
		ProcessDto processDto = null;
        try {
            Statement stmt = connection.connect().createStatement();
            	//	createStatement();
           // PreparedStatement ps = connection.connect().prepareStatement("INSERT INTO eloan.users VALUES (NULL, ?, ?, ?, ?)");
           // ps.setString(1, user.getUsername());
           // ps.setString(2, user.getPassword());
            //String query = "update eloan.loan set status="+process.getLoanStatus()+" WHERE app_num="+process.getApplicationNumber()+";";
            //ResultSet rs = stmt.executeQuery(query);
            
            PreparedStatement ps;
            String sql="Update eloan.loan set loan_name=?, customer_name=?, loan_amount=?, application_date=?,business=?,billing_indicator=?, tax_indicator=?,address=?, email=?, mobile=? where app_num="+process.getApplicationNumber()+";";
            ps = connection.connect().prepareStatement(sql);
            ps.setString(1,process.getLoanName());
            ps.setString(2,process.getCustomerName());
            ps.setFloat(3,process.getLoanAmount());
            ps.setString(4,process.getApplicationDate());
            ps.setString(5,process.getBusinessStructure());
            ps.setString(6,process.getBillingIndicator());
            ps.setString(7,process.getTaxIndicator());
            
			/* java.util.Date utilDate = new java.util.Date(); */
			/*
			 * java.sql.Date sqlDate = new
			 * java.sql.Date(process.getPayStartDate().getTime()); ps.setDate(4,sqlDate);
			 * java.sql.Date sqlDate1 = new
			 * java.sql.Date(process.getClosureDate().getTime()); ps.setDate(5,sqlDate1);
			 * ps.setObject(6,process.getAmountSanctioned());
			 */
            ps.setString(8, process.getAddress());
            ps.setString(9,process.getEmail());
            ps.setObject(10,process.getMobile());
            
            
            
			/*
			 * ps.setString(2, first_name); ps.setString(3, last_name); ps.setString(4,
			 * city_name); ps.setString(5, email);
			 */
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
	
	

