package com.vektorel.firstpackage;

import java.util.Scanner;

public class Insan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Deger giriniz 1 2 3 4");
		
		while(true){
			int deger = scan.nextInt();

			if(deger == 1){
				akciger("oksijen al");
			}else if(deger == 2){
				bobrek("üre");
			}else if(deger == 3){
				karaciger("toksit");
			}else if(deger ==4){
				if(cikis()){
					break;
				}
			}else{
				calismiyor("yasam belirtisi yok");
			}
		}
		
	}

	private static boolean cikis() {
		return true;
	}

	private static void calismiyor(String string) {
		System.out.println(string);
		
	}

	private static void karaciger(String string) {
		System.out.println(string);
	}

	private static void bobrek(String string) {
		System.out.println(string);
	}

	private static void akciger(String string) {
		System.out.println(string);
	}
}
