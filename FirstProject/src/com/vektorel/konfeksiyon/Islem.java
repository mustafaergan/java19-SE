package com.vektorel.konfeksiyon;

public class Islem {

	public static void main(String[] args) {
		KozaKonfeksiyon koza = new KozaKonfeksiyon();

		double hesap = koza.satinAlma(10, 5,10);
		
//		System.out.println(hesap);
		
		
		MarkaKonfeksiyon marka = new MarkaKonfeksiyon();
		
		hesap = marka.satinAlma(10, 5);
		
		System.out.println(hesap);
		
	}
}
