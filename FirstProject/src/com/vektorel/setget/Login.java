package com.vektorel.setget;

public class Login {
	
	Veritabani veritabani = new Veritabani();
	
	public void kontrolEt(String kul, String sifre) {
		
		Veritabani veritabani = new Veritabani();
		
		System.out.println(veritabani.getUserName());
		System.out.println(veritabani.getPassword());
		
		veritabani.setUserName("mustafa");
		veritabani.setPassword("***");
		
		System.out.println(veritabani.getUserName());
		System.out.println(veritabani.getPassword());
		
		if(veritabani.getUserName() == null 
				|| veritabani.getPassword() == null ){
			System.out.println("Degerler null");
			return;
		}
		
		if(veritabani.getUserName().equals(kul)
		&& veritabani.getPassword().equals(sifre)){
			System.out.println("Giriþ Baþarili");
			
		}else{
			System.out.println("basarisiz giris");
		}
		
	}
}
