package com.jdbc.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		return false;
	}
	
	
	
	
}
