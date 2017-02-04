package com.vektorel.kalitim;

public class Cocuk extends Baba {
	
	public void univerte(){
		System.out.println("Çocuk - üniversite");
	}
	
	@Override
	public void yurume() {
		System.out.println("Cocuk - Yuruyemiyorum");
	}

}
