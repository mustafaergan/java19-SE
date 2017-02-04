package com.vektorel.superfutbol;

public class PlajVoleybol extends Voleybol {
	
	
	public PlajVoleybol(){
		super();
		System.out.println("Plaj Sýnýfý");
	}
	
	public void takiminiSoyle(){
		setTakým("ponçik kýzlar");
		System.out.println(getTakým());
		super.kacKisiyiz(5);
	}

}
