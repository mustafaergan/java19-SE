package com.vektorel.iaraba;

public class Fiat implements IAraba,IKaporta{

	private String isim = "Fiat";
	
	@Override
	public void fren() {
		System.out.println("Fiat karadüzen fren sistemi devrede");
		
	}

	@Override
	public void gaz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debriyaj() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elFreni() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void macun() {
		System.out.println("Macun oldu");
	}

	@Override
	public void boya() {
		System.out.println("Boya oldu");
	}

	@Override
	public void boya(String renk) {
		System.out.println(this.isim +" "
				+ renk + " boya oldu");
	}

}
