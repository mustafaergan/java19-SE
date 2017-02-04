package com.vektorel.arraypoly;

public class Islem {

	public static void main(String[] args) {
		String[] aralar = new String[6];
		int[] intdiziler = new int[6];
		Integer[] intAtaClasslar = {10,25,30};
		
//		MuzikAletleri muzAlet = new VurmaliCalgilar();
//		
//		muzAlet.sesVer();
//		
//		MuzikAletleri muz = new MuzikAletleri();
//
//		muz.sesVer();
		
		MuzikAletleri[] aletList 
			= new MuzikAletleri[3];
		
		aletList[0] = new MuzikAletleri();
		
		aletList[1] = new VurmaliCalgilar();
		
		aletList[2] = new YayliCalgilar();
		
		
		aletlerdenSesVer(aletList);


	}

	private static void aletlerdenSesVer(MuzikAletleri[] aletler) {
		
		MuzikAletleri alet;
		for(int i = 0; i<aletler.length ; i++){
			alet = aletler[i];
			alet.sesVer();
		}
		
	}

}
