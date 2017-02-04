package com.vektorel.konfeksiyon;

public abstract class AKonfeksiyon {
	
	private int kdv = 18;
	
	abstract void kumasturu();
	abstract double kumasturu(int deger);
	abstract float kumasturu(int deger,double deger1);
	
	double satinAlma(int fiyat,int miktar){
		double hesap = fiyat * miktar;
		hesap = hesap+((hesap/100)*kdv);
		return hesap;
	}
	
	double toptancidenAlma(int fiyat,int miktar,int komisyon){
		double hesap = fiyat * miktar;
		hesap = hesap+((hesap/100)*kdv);
		return hesap+komisyon ;
	}
	
	void kumasKesme(){
		System.out.println("Kumas kestik");
	}
	
	public void setKdv(int kdv) {
		this.kdv = kdv;
	}
	
	public int getKdv() {
		return kdv;
	}
	
	

}
