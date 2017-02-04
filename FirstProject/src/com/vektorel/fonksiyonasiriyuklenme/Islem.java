package com.vektorel.fonksiyonasiriyuklenme;

public class Islem {
	
	public static void main(String[] args) {

		Hal hal = new Hal();
		
		hal.fiyatHesaplaElma();
		
		hal.fiyatHesaplaElma(2.0);
		
		hal.fiyatHesaplaElma(2.0, 4.0);
		
		Manav kucukManav = new Manav();
		
		Manav buyukManav = new Manav();
		
		buyukManav.setBuyuk(true);
		
		hal.fiyatHesaplaElma(100.0,kucukManav);
		
		hal.fiyatHesaplaElma(200.0,buyukManav);
		
		
		kucukManav.setBuyuk(true);
		buyukManav.setBuyuk(false);
		
		hal.fiyatHesaplaElma(100.0,kucukManav);
		
		hal.fiyatHesaplaElma(200.0,buyukManav);
		
		
		
		
	
	}

}
