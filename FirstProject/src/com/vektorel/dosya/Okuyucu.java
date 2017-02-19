package com.vektorel.dosya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Okuyucu {
	Scanner oku;
	public void dosyaAc(){
		try {
			File file = new File("c:/kisi/mmyazici.txt");
//			file.isDirectory()
//			file.listFiles()
			this.oku = new Scanner
			(file);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(this.oku.hasNextLine()){
			System.out.println(this.oku.nextLine());
		}
	}
}
