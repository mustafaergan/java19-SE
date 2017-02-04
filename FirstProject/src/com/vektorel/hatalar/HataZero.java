package com.vektorel.hatalar;

import java.util.Scanner;

public class HataZero {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		try{
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int sonuc = a/b;
		}catch (ArithmeticException e) {
			System.out.println("***Hata Var");
			e.printStackTrace();
		}
		
		System.out.println("Hayatina Devam Etti");
		
	}

}
