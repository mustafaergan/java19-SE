package com.vektorel.dosyaveritabani;

import java.io.File;


public class Islem {
	public static void main(String[] args) {
		Dosya dosya = new Dosya();
		File file =dosya.dosyaBulucu(args[0], args[1]);
		if(file != null){
			Okuyucu oku = new Okuyucu();
			oku.oku(file);
		}
		
	}
}
