package com.vektorel.hatalar;

import java.util.Scanner;

public class ArrayIslemString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] array = new String[3];
		
		int sayac = 0;
		
		try{
			while(true){
				array[sayac] =scan.nextLine();
				sayac ++ ;
			}
		}catch (Exception e) {
			System.out.println("Hata Var");
			e.printStackTrace();
		}

		
	}

}
