package com.vektorel.stream;

import java.io.File;

public class Dosya {
	public File getBenimDosyam(String path){
		File file = new File(path);
		if(file.exists()){
			if(file.isFile()){
				return file;
			}
		}
		return null;
	}
}
