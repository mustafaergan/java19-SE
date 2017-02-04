package com.vektorel.kurs;

public abstract class AKurs {
	
	abstract void egitimVer();
	
	double fiyatHesapla(Kisi kisi){
		double fiyat = 6000;
		
		if(kisi.mevki.equalsIgnoreCase("ogrenci"))
			fiyat = 5000;
		
		return fiyat;
		
	}
	
	void hosgeldin(Kisi kisi){
		if(kisi.isHoca()){
			System.out.println("hosgeldin hoca");
		}else{
			System.out.println("hosgeldiniz oturmazmýsýnýz "+
								"çay alýr mýsýnýz");
		}
		
	}

}
