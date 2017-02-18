package com.vektorel.dosyaveritabani;

import java.io.File;

public class Dosya {

	public File dosyaBulucu(String path,String dosyaIsmi){
		File file = new File(path);
		
		if(file.exists()){
			if(file.isDirectory()){
				
				File[] files = file.listFiles();
				
				for(int i = 0 ; i<files.length ; i++){
					if(files[i].isFile()){
						if(files[i].getName().equals(dosyaIsmi)){
							return files[i];
						}
					}
				}
				
			}
		}
		return null;
	}



}
