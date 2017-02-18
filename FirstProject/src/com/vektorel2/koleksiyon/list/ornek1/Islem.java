package com.vektorel2.koleksiyon.list.ornek1;

import java.util.List;

public class Islem {

	public static void main(String[] args) {
		Okuyucu okuyucu = new Okuyucu();
		
		List<String> alisverisList = 
				okuyucu.dosyaoku("C:/kisi/mylist.txt");
		
		List<String> alisverisLinkList = 
				okuyucu.dosyaoku("C:/kisi/mylist.txt");
		
		for(String s : alisverisList)
			System.out.println(s);
	} 
	
}
