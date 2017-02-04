package com.vektorel.overloading;

public class Islem {
	
	
	public static void main(String[] args) {
//		Araba araba = new Araba();
//		
//		Araba  arabaIntId = new Araba(101);
//		
//		Araba  arabaDoubleId = new Araba(101.0);
//		
//		Araba  arabaStringId = new Araba("101");
//		
//		Araba arabaIkiParametreliInt = new Araba(100,"fiat");
//		
//		Araba arabaIkiParametreliString = new Araba("100","fiat");
//
//		/*fiat*/
//		Fiat fiat = new Fiat();
//		
//		fiat.setId(100);
//		
//		Araba arabaFiat = new Araba(fiat);
//		
//		/*Volvo*/
//		Araba arabaVolvo = new Araba(new Volvo());
//		
//		Araba arabaVolvo2 = new Araba(new Volvo(100));

		
		/*Toyota*/
//		Toyota toyota = new Toyota();
//		
//		Araba arabaToyota = new Araba(toyota);
		
		
//		Araba arabaToyotaBeraberDegiskenler = 
//				new Araba(new Toyota(100,"corola"));
//		
		
		Fiat isimliFiatNesnesi = new Fiat();
		isimliFiatNesnesi.setId(100);
		isimliFiatNesnesi.setName("500");
		
		Volvo volvoRefDenemesi = new Volvo();
		
		volvoRefDenemesi.setId(100);
		
		volvoRefDenemesi.setName("S60");
		
		volvoRefDenemesi.setModel(2015);
		
		
		
		Araba arabaVolvoFiat = new Araba(
				isimliFiatNesnesi,new Volvo(100,"S60",2015));
		
		System.out.println("**********************");
		
		Araba arabaVolvoFiat2 = new Araba(
				isimliFiatNesnesi,volvoRefDenemesi);
		
		int deneme1 = arabaVolvoFiat2.getVolvo().getId();
		
		
		System.out.println("**** deneme 1 "+deneme1);
		
		volvoRefDenemesi.setId(200);
		
		int deneme2 = arabaVolvoFiat2.getVolvo().getId();
		
		System.out.println("**** deneme 2 "+deneme2);

		
		System.out.println("**********************");

		
		
//		Araba arabaVolvoFiat2 = new Araba(
//				new Fiat(100,"500"),new Volvo(100,"S60",2015));
		
		
		
		
	}

}
