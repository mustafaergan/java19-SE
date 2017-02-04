package com.vektorel.banka;

public class Islem {
	
	public static void main(String[] args) {
		
		TL tl = new TL();
		Dolar dolar = new Dolar();
		
		tl.setSeriNo("A100");
		tl.setFolyoBarkod("ABCX");
		tl.setMiktar(100.0);
		
		dolar.setSeriNo("A200");
		dolar.setCipNo("ABCW");
		dolar.setMiktar(200.0);
		
		Banka banka = new Banka(tl,dolar);
		
		System.out.println("Dolar Seri No:");
		System.out.println(banka.getDolar().getSeriNo());
		
		System.out.println("Tl Seri No:");
		System.out.println(banka.getTl().getSeriNo());
		
		dolar.setSeriNo("G700 - YENI SERI NO");
		
		System.out.println("Dolar Seri No:");
		System.out.println(banka.getDolar().getSeriNo());
		
		
		
	}

}
