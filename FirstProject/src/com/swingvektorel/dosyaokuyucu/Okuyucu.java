package com.swingvektorel.dosyaokuyucu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Okuyucu {

	Scanner scanner;
	
	public String dosyaOku(File file){
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		StringBuilder doldur = new StringBuilder();
		
		while(scanner.hasNextLine()){
			doldur.append(scanner.nextLine());
			doldur.append("\n");
		}
		return doldur.toString();
	}
	
}
