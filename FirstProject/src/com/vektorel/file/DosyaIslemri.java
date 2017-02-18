package com.vektorel.file;

import java.io.File;
import java.io.IOException;

public class DosyaIslemri {
	
	public DosyaIslemri(String path) {
		File file = new File(path);
		if(file.exists()){
			if(file.isDirectory()){
				File[] files = file.listFiles();
				
				for(int i = 0 ; i<files.length;i++){
					if(files[i].isFile()){
						System.out.println(files[i].getName());
					}
				}
				
			}else if(file.isFile()){
				System.out.println(file.getName());
				file.delete();
			}
		}else{
			String[] array = path.split("\\.");
			if(array.length >1){
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				file.mkdir();
			}
		}
		
	}
	
}
