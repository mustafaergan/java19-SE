package com.vektorel.hayvanlar;

public class Islem {
	
	public static void main(String[] args) {
		
		Kaplan kaplan = new Kaplan();
		kaplan.avlan();
		kaplan.takipEt();
		
		Hayvan iKaplan = new Kaplan();
		
		iKaplan.avlan();
		
		Kedi aKaplan = new Kaplan();
		
		aKaplan.avlan();
		
		Hayvan hay = new Hayvan() {
			
			@Override
			public void avlan() {
				System.out.println("islem icindeyim");
				
			}
		};
		
		hay.avlan();
	}
	

}
