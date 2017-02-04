package com.vektorel.donerci;

public class Islem {
	
	public static void main(String[] args) {
		MutluDoner mutlu = new MutluDoner();
		
		mutlu.donerKesme();
		mutlu.paketleme();
		double fiyat = mutlu.fiyatHesapla(1, 10);
		
		System.out.println("Hesap Tutarý:" 
		+ fiyat);
		
		
	}

}
