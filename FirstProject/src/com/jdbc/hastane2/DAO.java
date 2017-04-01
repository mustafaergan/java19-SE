package com.jdbc.hastane2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.entity.Hastane;

public class DAO {

	Connection connection;
	Statement statement;
	PreparedStatement preparedStatement;
	
	
	public DAO(){
		 try {
			connection = DriverManager
					.getConnection(
							ConnectionEnum.dbConnection()
							,ConnectionEnum.USERNAME.getValue()
							,ConnectionEnum.PASSWORD.getValue());
		} catch (SQLException e) {
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
	
	
	public Hastane getHastane(int id){
		Hastane hastane = new Hastane();
		String SQL = "Select * from HASTANE where id = ?";
		try {
//			statement =  connection.createStatement();
			preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, id);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				int idSQL = rs.getInt("id");
				String isimSQL = rs.getString("isim");
				hastane.setId(idSQL);
				hastane.setIsim(isimSQL);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return hastane;
	}
	
	
	
	
	
	
}