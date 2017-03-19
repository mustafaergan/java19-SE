package com.jdbc.hastane;

public class Saglik {
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.getBilgileri("select * from hastane");
		
		dao.getBilgileri("select * from doktor");
		
		dao.getBilgileri("select * from hemsire");
		
		String SQL = "create table "
				+ "deneme(id int,name varchar(30))";
		
		
		
	}
}
