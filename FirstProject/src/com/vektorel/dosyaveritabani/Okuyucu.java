package com.vektorel.dosyaveritabani;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Okuyucu {

	public void oku(File file){
		Scanner okuyucu = null;
		try {
			okuyucu = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(okuyucu.hasNextLine()){
			System.out.println(okuyucu.nextLine());
		}
	}
}
