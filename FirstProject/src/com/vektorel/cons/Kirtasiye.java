package com.vektorel.cons;

import com.vektorel.cons.pro.Fotokopi;
import com.vektorel.publicdenemee.Kagit;

public class Kirtasiye {
		
	public static void main(String[] args) {
//		Cetvel cetvel = new Cetvel();
//		Kalem kalem = new Kalem();
//		Defter defter = new Defter();
		
//		Cetvel cetvel = new Cetvel(0,"CetvelfaberCastle");
//		Kalem kalem = new Kalem(0,"KalemfaberCastle");
//		Defter defter = new Defter(0,"DefterfaberCastle");
//		
//		cetvelOku(cetvel);
//		
//		kalemOku(kalem);
//		
//		cetvel.oku();
//		
//		kalem.oku();
//		
//		System.out.println("benim adým foksiyonu: "+cetvel.isimSoyle());
//		
		Fotokopi fotokopi = new Fotokopi();
		
		int fotokopiId = fotokopi.id;
		String fotokopiName = fotokopi.name;
		
		Kagit kagit= new Kagit();
		
		int kagitId = kagit.getId();
		
		System.out.println(kagitId);
		
		System.out.println(kagit.getName());
		
		Canta canta = new Canta();
		
		int cantaId = canta.getId();
		
		System.out.println(cantaId);
		
		String cantaName = canta.getName();
		
		System.out.println(cantaName);
		
		
	}

	private static void kalemOku(Kalem kalem) {
		System.out.println("Benim Id:" + kalem.getId());
		
		System.out.println("Benim Adým:" + kalem.getName());
		
		System.out.println("**************");
		
	}

	private static void cetvelOku(Cetvel cetvel) {
		
		System.out.println("Benim Id:" + cetvel.getId());
		
		System.out.println("Benim Adým:" + cetvel.getName());
		
		System.out.println("**************");

	}
	

}
