package com.vektorel.iaraba;

public class Volvo implements IAraba,IVolvoTamirci,IKaporta {

	private String isim = "Volvo";
	
	@Override
	public void fren() {
		System.out.println(" Volvo fren sistemi Devrede");
		abs();
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
	public void abs(){
		System.out.println("Volvo ABS Devrede");
	}

	@Override
	public void frenTamir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void macun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boya() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boya(String renk) {
		System.out.println(this.isim +" "
				+ renk + " boya oldu");
	}

}
