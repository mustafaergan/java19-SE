package com.jdbc.hastane2;

import com.jdbc.entity.Hastane;

public class Islem {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		Hastane hastane = dao.getHastane(8);
		
		
	}

}
