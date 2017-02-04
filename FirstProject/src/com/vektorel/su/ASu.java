package com.vektorel.su;

public abstract class ASu implements IBalikTutmak {
	
	public void akar(){
		System.out.println("Su Akar Yolunu Bulur");
	}
	
	public abstract int debi();
	
	public void tuzlulukOrani(){
		System.out.println(0 + " Tuz Orani");
	}

}
