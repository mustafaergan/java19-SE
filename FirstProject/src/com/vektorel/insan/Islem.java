package com.vektorel.insan;

public class Islem {
	
	public static void main(String[] args) {
		
		IInsan insan2 = new Insan();
		
		Insan insan3 = new Insan();
		
		insan3.karaciger();
		
		//insan2.karaciger(); çalýþmaz
		
		IInsan insan = new IInsan() {
			
			@Override
			public void tatma() {
				// TODO Auto-generated method stub
				System.out.println("tatma");
			}
			
			@Override
			public void koklamak() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void gorme(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void duyma(String name, String name2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void duyma(String name) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dusunme() {
				System.out.println("dusunme");
				
			}
			
			@Override
			public void dokunma() {
				// TODO Auto-generated method stub
				
			}
		};
		
		insan.tatma();
		insan.dusunme();
		
		
		
	}

}
