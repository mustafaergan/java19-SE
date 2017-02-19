package com.vektorel2.thread;

public class deneme2 implements Runnable{

	@Override
	public void run() {
		int sayac = 0; 
		while(1==1){
			sayac++;
			System.out.println(sayac);
			if(sayac == 10){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
