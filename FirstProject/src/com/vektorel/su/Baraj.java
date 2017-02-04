package com.vektorel.su;

public class Baraj extends ASu {

	@Override
	public int debi() {
		return 1000;
	}

	@Override
	public void oltaIleTutmak() {
		System.out.println("baraj'da balýk tutmak çok güzel");
	}
	
	@Override
	public void tuzlulukOrani() {
		System.out.println(10 + " Barajda tuzluluk Oraný");
	}

}
