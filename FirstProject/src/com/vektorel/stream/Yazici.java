package com.vektorel.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Yazici {
	
	public void yaz(File file,String yazi){
		try {
			
			FileOutputStream stream = 
					new FileOutputStream(file,true);
			
			stream.write(yazi.getBytes());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
