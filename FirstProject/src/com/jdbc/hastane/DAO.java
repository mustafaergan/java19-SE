package com.jdbc.hastane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	Connection connection;
	Statement statement;
	
	
	public DAO(){
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
	
	
	public void getBilgileri(String SQL){
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(SQL);
			
			while(rs.next()){
				System.out.println(rs.getString("isim"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void calistir(String SQL){
		try {
			statement = connection.createStatement();
			if(!statement.execute(SQL)){
				System.out.println("iþlemi yaptým");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
