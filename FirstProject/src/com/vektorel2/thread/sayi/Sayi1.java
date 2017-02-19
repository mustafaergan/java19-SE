package com.vektorel2.thread.sayi;

public class Sayi1 implements Runnable {

	@Override
	public void run() {
		don1();
		don2();
	}

	private void don2() {
		int sayac = 0;
		while(sayac<100){
			System.out.println("##2-"+sayac);
			sayac++;
		}		
	}

	private void don1() {
		int sayac = 0;
		while(sayac<100){
			System.out.println("##1-"+sayac);
			sayac++;
			if(sayac == 50){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		}		
	}

}
