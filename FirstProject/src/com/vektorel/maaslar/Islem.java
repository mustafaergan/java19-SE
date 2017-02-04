package com.vektorel.maaslar;

public class Islem {
	public static void main(String[] args) {
		Calisan genelMudur = new GenelMudur(6);
		Calisan mudur = new Mudur(5);
		Calisan yazilimci = new Yazilimci(5);
		
		maasYazdir(genelMudur);
		maasYazdir(mudur);
		maasYazdir(yazilimci);
	}

	private static void maasYazdir(Calisan obj) {
		System.out.println(obj.maasAl());
		System.out.println(obj.kimsin());
		System.out.println("************");
	}

}
