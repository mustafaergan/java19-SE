package com.vektorel.benimhatam;

public class Islem {
	public static void main(String[] args) {
		
//		try{
//			throw new NullPointerException("NullPointerException");
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		try{
			hata();
		}catch (Exception e) {
			System.out.println("hata var");
		}
		
		Veritabani ver = new Veritabani();
		
		ver.islemYap();
		
		
		
	}
	
	
	public static void hata() throws NullPointerException{
		throw new NullPointerException();
	}
	

}
