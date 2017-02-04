package com.vektorel.cons;

public class KitapEvi {
		
	private Kitap kitap;
	private String isim;
	private String adresi;
	
	public KitapEvi(Kitap kitap,String isim,String adresi){
		this.kitap = kitap;
		this.isim =isim;
		this.adresi = adresi;
	}
	
	
	public Kitap getKitap() {
		return kitap;
	}
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getAdresi() {
		return adresi;
	}
	public void setAdresi(String adresi) {
		this.adresi = adresi;
	}
	
	

}
