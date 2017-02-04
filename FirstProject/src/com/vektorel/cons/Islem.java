package com.vektorel.cons;

public class Islem {
	
	public static void main(String[] args) {
		Kitap kitap1 = new Kitap();
		
		kitap1.setBarkod("Edfg-dfhr");
		
		kitap1.setIsim("Zambak");
		
		kitap1.setId(0);
		
//		Kitap kitap2  = new Kitap("Edfg-dfhr");
//		
//		Kitap kitap3 = new Kitap("Edfg-dfhr", "Zambak");
//		
//		System.out.println(kitap3.getIsim());
		
		Kitap kitap4 = new Kitap("Edfg-dfhr","Zambak",0);
		
		Kitap kitap5 = new Kitap();
		
		
		
		KitapEvi kitapEvi1 = 
				new KitapEvi(new Kitap("Edfg-dfhr","Zambak",0)
								,"KVektörel","Kýzýlay");
		
		KitapEvi kitapEvi2 = 
				new KitapEvi(kitap5,"KVektörel","Kýzýlay");
		
	}

}
