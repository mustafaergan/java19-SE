package com.vektorel.maaslar;

public class Mudur extends Calisan {

	int kidem;
	
	public Mudur(int kidem) {
		this.kidem = kidem;
	}
	
	@Override
	public int maasAl() {
		return kidem*sabitMaas;
	}
	
	@Override
	public String kimsin() {
		return "Müdür";
	}
	
}
