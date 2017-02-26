package com.vektorel2.thread.sayi;

public class Sayi1 implements Runnable {

	@Override
	public void run() {
		don1();
	}

	private void don1() {
		int sayac = 0;
		while(sayac<100){
			System.out.println("##-"+sayac);
			sayac++;
		}		
	}

}
