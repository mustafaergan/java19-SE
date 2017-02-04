package com.vektorel.poly;

public class Islem {
	
	public static void main(String[] args) {
		Sekil sekil = new Sekil();
		Sekil daire = new Daire();
		Sekil kare = new Kare();
		Sekil ucgen = new Ucgen();
		
		alanDegerleriniVer(sekil);
		alanDegerleriniVer(daire);
		alanDegerleriniVer(kare);
		alanDegerleriniVer(ucgen);
	}

	private static void alanDegerleriniVer(Sekil sekil) {
		System.out.println(sekil.alanHesaplama());
	}



}
