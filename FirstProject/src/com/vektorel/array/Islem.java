package com.vektorel.array;

import java.util.Calendar;
import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		
		String ver = "15";
		
		int verStringTipi = Integer.parseInt(ver);
		
		int [] myArrray = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		try{
			for(int i = 0 ; i < 3 ; i++){
				myArrray[i] = scan.nextInt();
			}
			int value = 5/0;
		}catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Array hata oluþtu");
			System.out.println("Efendi fazla deger girdin");
			int value = 5/0;
		}catch (Exception e) {
			System.out.println("Ata Expection");
		}finally {
			System.out.println("finally");
			scan.close();
		}
		
		IArray array = new Array(myArrray);
		IArrayMaks arraymak = new Array(myArrray);
		
		System.out.println("****Tekler");
		array.tekBul();

		System.out.println("****Çifler");
		array.ciftBul();
		
		arraymak.makBul();
	}

}
