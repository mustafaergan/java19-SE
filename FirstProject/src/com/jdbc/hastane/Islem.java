package com.jdbc.hastane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Islem {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager
					.getConnection(
							ConnectionEnum.DBNAME.dbConnection()
							,ConnectionEnum.USERNAME.getValue()
							,ConnectionEnum.PASSWORD.getValue());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				   


	}

}
