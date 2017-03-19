package com.jdbc.hastane;

public class Saglik {
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.getBilgileri("select * from hastane");
		
	}
}
