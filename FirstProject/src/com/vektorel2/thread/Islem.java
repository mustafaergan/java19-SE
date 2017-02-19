package com.vektorel2.thread;

public class Islem {
	
	public static void main(String[] args) {
		
		deneme as = new deneme();
		deneme2 as2 = new deneme2();
		
		Thread isBir = new Thread(as);
		Thread isIki = new Thread(as2);
		
		isBir.start();
		isIki.start();
	
	}

}
