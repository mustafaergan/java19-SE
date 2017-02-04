package com.vektorel.firstpackage;

import java.util.Scanner;

public class HesapMakinesi {
	
	int sayi1 = 5;

	public int topla(int deger1, int deger2) {
		return deger1 + deger2;
	}
	
	public int cikar(int deger1, int deger2) {
		return deger1 - deger2;
	}
	
	public int carp(int deger1, int deger2) {
		return deger1 * deger2;
	}
	
	public double bol(int deger1, int deger2) {
		return deger1 / deger2;
	}
	
	public static void main(String[] args) {
		
		HesapMakinesi hesapMakinesi = new HesapMakinesi();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ne işlem yapmak istersiniz?");
		System.out.println("1-Toplama");
		System.out.println("2-Çıkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");
		
		int islemKodu = scanner.nextInt();
		
		System.out.println("1. rakamı giriniz : ");
		int rakam1 = scanner.nextInt();
		System.out.println("2. rakamı giriniz : ");
		int rakam2 = scanner.nextInt();
		
		int sonuc = 0;
		
		switch (islemKodu) {
		case 1:
			sonuc = hesapMakinesi.topla(rakam1, rakam2);
			break;
		case 2:
			sonuc = hesapMakinesi.cikar(rakam1, rakam2);
			break;
		case 3:
			sonuc = hesapMakinesi.carp(rakam1, rakam2);
			break;
		case 4:
			sonuc = (int) hesapMakinesi.bol(rakam1, rakam2);
			break;
		default:
			System.out.println("Yanlış işlem kodu girdiniz!");
			break;
		}
		
		System.out.println("Sonuç = " + sonuc);
	}
	
}