package com.vektorel2.thread.sayi;

public class Islem {
	
	public static void main(String[] args) {
		Sayi1 sayi1 = new Sayi1();
		Sayi2 sayi2 = new Sayi2();
		Thread isParcacigi1 = new Thread(sayi1);
		Thread isParcacigi2 = new Thread(sayi2);
		
		Thread isParcacigi3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
			}
		});
		
		isParcacigi1.start();
		isParcacigi2.start();
		
		synchronized (isParcacigi1) {
			
			try {
				isParcacigi1.wait();
				System.out.println("*-----*");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("-----");
	}

}
