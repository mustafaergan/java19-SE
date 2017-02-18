package com.vektorel.dosya;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Yazici {
	PrintWriter pW;
	
	public void dosyaAc(){
		try {
			this.pW = new PrintWriter("yazici.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void veriEkle(Person person){
		this.pW.println(person.getId() +"-"+person.getName());
	}
	
	public void close() {
		this.pW.close();
	}
	
	

}
