package com.vektorel.maaslar;

public class Yazilimci extends Calisan {

	int kidem;
	
	public Yazilimci(int kidem) {
		this.kidem = kidem;
	}
	
	@Override
	public int maasAl() {
		return kidem*sabitMaas;
	}
	
	@Override
	public String kimsin() {
		return "Yazilimci";
	}
	
}
