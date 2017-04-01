package com.jdbc.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.entity.User;

public class UserDAO {

	Connection connection;
	PreparedStatement statement;
	
	
	public UserDAO(){
		 try {
			connection = DriverManager
					.getConnection(
							ConnectionEnum.dbConnection()
							,ConnectionEnum.USERNAME.getValue()
							,ConnectionEnum.PASSWORD.getValue());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public boolean isUserControl(String username, String password) {
		User user = null;
		String SQL = "Select * from login where user_name = ? and password = ?";
		
		try {
			statement = connection.prepareStatement(SQL);
			
			statement.setString(1, username);
			statement.setString(2, password);
			
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				user = new User(rs.getInt("id"),
						rs.getString("user_name"), rs.getString("password"));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return (user != null);
	}
	
	
	
	
}
