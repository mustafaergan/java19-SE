package com.vektorel.su;

public class Islem {

	public static void main(String[] args) {
		
		Golet golet = new Golet();
		
		golet.akar();
		
		IBalikTutmak balikTut = new Baraj();
		
		balikTut.oltaIleTutmak();
		
		ASu abstractOrnegiGolet = new Golet();
		
		abstractOrnegiGolet.tuzlulukOrani();
		
		abstractOrnegiGolet.debi();
		
		abstractOrnegiGolet.oltaIleTutmak();
		
		ASu abstractOrnegiBaraj = new Baraj();

		abstractOrnegiBaraj.tuzlulukOrani();
		
		

	}

}
