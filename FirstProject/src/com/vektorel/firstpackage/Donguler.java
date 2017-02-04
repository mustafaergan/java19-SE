package com.vektorel.firstpackage;

import java.util.Scanner;

//isimler dizisini doldurulmasi
public class Donguler {
	
	 public static void main(String[] args) {
		
		 String[] isimler = new String[2];
		 String isim = "";
		 
		 
		 for(int i = 0 ; i < 2 ; i++){
			 isim = Oku("Deger Giriniz");
			 isimler[i] = isim;
		 }
		 
		 for (int i = 0 ; i < isimler.length ; i++){
			 System.out.println(isimler[i]);
		 }
		 
	}
	 
	 static String Oku(String value){
		 
		 System.out.println(value);
		 
		 Scanner scan = new Scanner(System.in);
		 
		 String deger = scan.nextLine();
		 
		 return deger;
	 }
	 


}
