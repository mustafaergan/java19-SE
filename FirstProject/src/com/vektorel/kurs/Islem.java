package com.vektorel.kurs;

public class Islem {
	
	public static void main(String[] args) {
		Kisi hoca = new Kisi("mustafa","ergan"
								,"ogrenci",true);
		
		Kisi musteri = new Kisi("ahmet","....."
				,"ogrenci");
		
		Kisi musteriNormal = new Kisi("ahmet","....."
				,"normal");
		
		
		OyaSurucuKursu oya = new OyaSurucuKursu();
		
		oya.hosgeldin(hoca);
		
		oya.hosgeldin(musteri);
		
		
		System.out.println(oya.fiyatHesapla(musteriNormal));
		
		
		System.out.println(oya.fiyatHesapla(musteri));
		
		
	}

}
