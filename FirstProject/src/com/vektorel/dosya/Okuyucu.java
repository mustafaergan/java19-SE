package com.vektorel.dosya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Okuyucu {
	Scanner oku;
	public void dosyaAc(){
		try {
			this.oku = new Scanner
			(new File("c:/kisi/mmyazici.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(this.oku.hasNextLine()){
			System.out.println(this.oku.nextLine());
		}
	}
}
