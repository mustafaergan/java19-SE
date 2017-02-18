package com.vektorel.stream;

import java.io.File;
import java.io.FileInputStream;

public class Islem {

	public static void main(String[] args) {
		
		Dosya dosya = new Dosya();
		
		File file = dosya.getBenimDosyam("C:/kisi/mustafaergan.txt");
		
		Okuyucu okuyucu = new Okuyucu();
		
		okuyucu.oku(file);
		
		Yazici yazici = new Yazici();
		
		yazici.yaz(file,"yazilacak veri");
		
		okuyucu.oku(file);

	}

}
