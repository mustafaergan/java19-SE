package com.vektorel2.koleksiyon.dosyaveritabani;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Veritabani {

	Scanner scan;
	
	public Map<String, Person> dosyalariCek(String path){
		Map<String, Person> myMap = new LinkedHashMap<>(); 
		File dFile = new File(path);
		if(dFile.exists()){
			if(dFile.isDirectory()){
				File[] fileList =dFile.listFiles();
				Person person;
				for(int i = 0; i<fileList.length ; i++){
					File ff = fileList[i];
					person = dosyadakiVerileriOku(ff);
					myMap.put(ff.getName(), person);
				}
			}
		}
		
		return myMap;
		
	}

	private Person dosyadakiVerileriOku(File ff) {
		try {
			scan = new Scanner(ff);
//			List<String> myList = new ArrayList<>();
			String[] myList = new String[4];
			int sayac = 0;
			while(scan.hasNextLine()){
				myList[sayac] = scan.nextLine();
				sayac++;
			}
			
			return new Person(Integer.parseInt(myList[0]),
					myList[1], myList[2], myList[3]);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
