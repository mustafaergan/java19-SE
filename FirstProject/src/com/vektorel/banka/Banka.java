package com.vektorel.banka;

public class Banka {
	private Dolar dolar;
	private TL tl;
	
	
	public Banka(){
		System.out.println("Banka nesnesi oluþturuldu");
	}
	
	public Banka(Dolar dolar){
		this.dolar = dolar;
	}
	
	public Banka(TL tl){
		this.tl = tl;
	}
	
	public Banka(TL tl , Dolar dolar){
		this.tl = tl;
		this.dolar = dolar;
	}
	
	public Dolar getDolar() {
		return dolar;
	}
	public void setDolar(Dolar dolar) {
		this.dolar = dolar;
	}
	public TL getTl() {
		return tl;
	}
	public void setTl(TL tl) {
		this.tl = tl;
	}
	
	
	
	

}
