package com.vektorel.sinif;

public class Person {
	
	long tc;
	String ad;
	String soyad;
	int yas;
	String meslek;
	
	public Person(long tc, String ad, String soyad) {
		this.tc = tc;
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public Person(long tc, String ad, String soyad, int yas) {
		this(tc, ad, soyad);
		this.yas = yas;
	}
	
	public Person(long tc, String ad, String soyad, int yas, String meslek) {
		this(tc, ad, soyad, yas);
		this.meslek = meslek;
	}

}
