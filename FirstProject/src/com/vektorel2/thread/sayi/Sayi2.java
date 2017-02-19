package com.vektorel2.thread.sayi;

public class Sayi2 implements Runnable{

	@Override
	public void run() {
		int sayac = 0;
		while(sayac<100){
			System.out.println("**"+sayac);
			sayac++;
		}
		
	}

}
