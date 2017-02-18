package com.vektorel2.koleksiyon.vektor;

import java.sql.Date;
import java.util.List;
import java.util.Vector;

import com.vektorel.poly.Daire;

public class Vektor {
	
	public static void main(String[] args) {
		List<String> vektor = new Vector<String>();
		
		vektor.add("ahmet");
		vektor.add("mehmet");
		vektor.add("mustafa");
		
		for(int i = 0 ; i < vektor.size() ;i++){
			System.out.println(vektor.get(i));
		}
		
		vektor.remove("mehmet");
		
		for(int i = 0 ; i < vektor.size() ;i++){
			System.out.println(vektor.get(i));
		}
	}

}
