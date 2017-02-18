package com.vektorel.vergilendirme;

import java.util.Scanner;

public class Islem {
	
	public static void main(String[] args) {
		 
		System.out.println(!false);
		
		Scanner scan = new Scanner(System.in);
		
		String isim = scan.nextLine();
		try{
			if(!(isim.equals("ahmet") 
					||isim.equals("mehmet")
					||isim.equals("hasan"))){
				
				throw new VerigiHalari(0);
			}
			
			int kar = scan.nextInt();
			
			if(kar < 0)
				throw new VerigiHalari(1);
			
			double vergi = (kar/100)*40;
			
			System.out.println("vergi" + vergi);
			
		}catch (VerigiHalari e) {
			e.myMessage();
		}
	}

}
