package com.vektorel.sinif;

public class SinifDeneme {
	
	public static void main(String[] args) {
		
		Person p = new Person(1, "Mustafa", "Vektorel");
		Person p2 = p;
		
		p2.tc = 2;
		
		System.out.println(p.tc);
		System.out.println(p2.tc);
		
	}

}
