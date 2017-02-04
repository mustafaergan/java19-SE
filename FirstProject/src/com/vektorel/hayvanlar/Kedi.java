package com.vektorel.hayvanlar;

/**
 * 
 * @author vektorel
 *
 */

public abstract class Kedi implements Hayvan {
	/**
	 * 
	 */
	public void takipEt(){
		System.out.println("takip ediyorum");
	}
	
	/**
	 * kedinin takip etme özelliði
	 * @param s isim yazdýrma için
	 */
	public void takipEt(String s){
		System.out.println("takip ediyorum");
	}

}
