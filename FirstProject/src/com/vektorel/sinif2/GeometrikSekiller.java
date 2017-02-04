package com.vektorel.sinif2;

public class GeometrikSekiller {
	String value = "geometrik þekil";
	private double h = 50;
	
	public void geo(){
		System.out.println("GeometrikSekiller içindeyim");
	}
	
	public class Daire {
		
		private final Double PI = 3.0;
		
		public void alanHesapla(Double yaricap){
			System.out.println(value);
			double kare = yaricap * yaricap;
			double sonuc = kare* PI;
			sonuc = sonuc * h;
			System.out.println(sonuc);
		}
		
	}
	
	public class Kare{
		
	}
	
	class Ucgen{
		
	}

}
