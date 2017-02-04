package com.vektorel.firstpackage;

import java.util.Scanner;

public class SiralamaOdevi {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç rakam girmek istiyorsunuz?");
		
		int count = scanner.nextInt();
		
		System.out.println("1. rakamý giriniz.");
		int value = scanner.nextInt();
		int min = value;
		int max = value;
		
		for (int i=1; i < count; i++) {
			System.out.println((i + 1) + ". rakamý giriniz.");
			
			value = scanner.nextInt();

			if (value < min) {
				min = value;
			} else if (value > max) {
				max = value;
			}
		}
		System.out.println("Minimum deðer = " + min);
		System.out.println("Maksimum deðer = " + max);
	}

}
