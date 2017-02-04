package com.vektorel.sinif;

public class Ucgen {
	
	private int a;
	private int b;
	private int h;
	
	public Ucgen(int a, int b, int h) {
		this.a = a;
		this.b = b;
		this.h = h;
	}
	
	public int alanHesapla() {
		return b * h / 2;
	}
	
	public int cevre() {
		return a * 2 + b;
	}
	
}
