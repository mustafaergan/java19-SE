package com.vektorel.fonksiyonasiriyuklenme;

public class Hal {
	
	private double kdv;
	private double miktar;
	private double fiyat;
	
	final private double elmaFiyati = 5.0;
	
	public void fiyatHesaplaElma(){
		
		System.out.println("Hal giriþ ücreti 10Tl");
	}
	
	public void fiyatHesaplaElma(double miktar){
		double sonuc = miktar * elmaFiyati;
		System.out.println("Aldýðýnýz elma fiyatý:"+sonuc);
		
	}
	
	public void fiyatHesaplaElma(double miktar, double fiyat){
		double sonuc = miktar * fiyat;
		System.out.println("Aldýðýnýz elma fiyatý"+sonuc);
		
	}
	
	public void fiyatHesaplaElma(double miktar, Manav manav) {
		double sonuc = 0.0;
		
		if(manav.getBuyuk()){
			sonuc = miktar * (elmaFiyati - 2.0);
		}else
			sonuc = miktar * (elmaFiyati - 1.0);
	
		System.out.println("Aldýðýnýz elma fiyatý"+sonuc);
	}

	public double getKdv() {
		return kdv;
	}

	public void setKdv(double kdv) {
		this.kdv = kdv;
	}

	public double getMiktar() {
		return miktar;
	}

	public void setMiktar(double miktar) {
		this.miktar = miktar;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}



}
