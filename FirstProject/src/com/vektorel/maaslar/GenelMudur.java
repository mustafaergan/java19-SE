package com.vektorel.maaslar;

public class GenelMudur extends Mudur {
	
	int kidem;
	
	public GenelMudur(int kidem) {
		super(kidem);
		this.kidem = kidem;
	}
	
	
	@Override
	public int maasAl() {
		return kidem*sabitMaas;
	}
	
	@Override
	public String kimsin() {
		return "Genel Müdür";
	}

}
