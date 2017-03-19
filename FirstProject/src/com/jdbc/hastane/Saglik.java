package com.jdbc.hastane;

public class Saglik {
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.getBilgileri("select * from hastane");
		
		dao.getBilgileri("select * from doktor");
		
		dao.getBilgileri("select * from hemsire");
//		
//		String SQL = "create table "
//				+ "deneme3(id serial, name varchar(30))";
//		
//		dao.calistir("insert into deneme (id,name) values (1,'adana')");
//		dao.calistir("insert into deneme (id,name) values (2,'hatay')");
//		dao.calistir("insert into deneme (id,name) values (3,'malatya')");

		
		dao.calistir("drop table deneme3");
//		dao.calistir("drop table deneme2");

		
	}
}
