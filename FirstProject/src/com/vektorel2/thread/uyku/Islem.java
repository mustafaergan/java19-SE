package com.vektorel2.thread.uyku;

public class Islem {

	
	public static void main(String[] args) {
		
		Sekil sekil = new Sekil();
		
		Thread is1 = new Thread(sekil);
		
		Thread is2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int sayac = 0;
				while(sayac < 200){
					sayac++;
					if(sayac % 50 == 0){
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("##");
				}
			}
		});
		
		is1.start();
		is2.start();
		
		System.out.println("------");
		
	}
}
