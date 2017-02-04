package com.vektorel.kalitim3;

public class Binek extends Araba{
	
	boolean tup = false;
	
	public void tupGec(){
		System.out.println("Binek - tupGec()");
	}
	
	@Override
	public void fren() {
		System.out.println("Binek - fren()");
	}

	public boolean isTup() {
		return tup;
	}

	public void setTup(boolean tup) {
		this.tup = tup;
	}
	
	

}
