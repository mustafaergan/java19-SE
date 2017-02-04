package com.vektorel.sinif2;

public class Islem {
	
	public static void main(String[] args) {
		
		GeometrikSekiller geo = new GeometrikSekiller();
		
		geo.geo();
		
		GeometrikSekiller.Daire daire = geo. new Daire();
		
		daire.alanHesapla(10.0);
		
		/*
			Daire daireTipi = new Daire();
			double sonuc = daireTipi.yariCapHesapla(5.0);
			System.out.println(sonuc);
		*/
	}

}
