package com.vektorel.kurs;

public class Kisi {
	
	String adi;
	String soyadi;
	String mevki;
	boolean hoca = false;
	
	
	public Kisi(String adi, 
			String soyadi, String mevki, boolean hoca) {
		
		this.adi = adi;
		this.soyadi = soyadi;
		this.mevki = mevki;
		this.hoca = hoca;
		
	}
	
	public Kisi(String adi, 
			String soyadi, String mevki) {
		
		this.adi = adi;
		this.soyadi = soyadi;
		this.mevki = mevki;
		
	}
	
	public String getAdi() {
		return adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public String getMevki() {
		return mevki;
	}
	public boolean isHoca() {
		return hoca;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public void setMevki(String mevki) {
		this.mevki = mevki;
	}
	public void setHoca(boolean hoca) {
		this.hoca = hoca;
	}
	
	
	
	

}
