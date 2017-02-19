package com.vektorel2.koleksiyon.dosyaveritabani;

public class Person {
	int TC;
	String isim;
	String soyad;
	String dogumYeri;
	
	public Person(int tC, String isim, String soyad, String dogumYeri) {
		TC = tC;
		this.isim = isim;
		this.soyad = soyad;
		this.dogumYeri = dogumYeri;
	}
	
	public String getDogumYeri() {
		return dogumYeri;
	}
	
	

}
