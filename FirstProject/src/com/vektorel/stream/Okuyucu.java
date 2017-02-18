package com.vektorel.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Okuyucu {
	
	public void oku(File file){
		
		try {
			FileInputStream stream =new FileInputStream(file);
//				for(int i = 0 ; i<10; i++){
//						System.out.print((char)stream.read());
//				}
				
			byte[] byteArray = new byte[(int)file.length()];
			
			stream.read(byteArray);
			
			String text = new String(byteArray);
			
			System.out.println("***Text Veri***");
			System.out.println(text);
			
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
		
	}

}
