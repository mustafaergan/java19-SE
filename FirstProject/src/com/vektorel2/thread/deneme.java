package com.vektorel2.thread;

public class deneme implements Runnable{

	@Override
	public void run() {
		int sayac = 0; 
		while(1==1){
			sayac++;
			System.out.println("***"+sayac);
		}
		
	}

}
