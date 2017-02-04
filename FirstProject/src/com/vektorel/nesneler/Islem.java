package com.vektorel.nesneler;

public class Islem {
	
	public static void main(String[] args) {
		
		Object tahta = new Tahta();
		
//		System.out.println(tahta.toString());
		
		Object ates = new Ates();
//		System.out.println(ates.toString());
		
		Object toprak = new Toprak();
//		System.out.println(toprak.toString());
		
		tipiSoyle(tahta);
	}
	
	private static void tipiSoyle(Object obj) {
		if(obj instanceof Tahta){
			((Tahta)obj).cinsiSoyle();
		}else if(obj instanceof Ates){
			Ates ates = (Ates)obj;
			ates.cinsiSoyle();
		}
	}

}
