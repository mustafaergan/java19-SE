package com.vektorel.donerci;

public abstract class ADoner {
	
	int kdv = 8;
	
	public void paketleme(){
		System.out.println("paketleme");
	}
	
	public void donerKesme(){
		System.out.println("doner kesme");
	}
	
	public double fiyatHesapla(int urunAdedi,int fiyat){
		double hesap = urunAdedi * fiyat;
		hesap = ((hesap /100)*this.kdv)+hesap;
		return hesap;
	}
}
