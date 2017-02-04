package com.vektorel.kalitim3;

public class HýzArabasi extends Araba {
	int turboMiktari;
	String aksesuar;
	
	void turboYap(){
		System.out.println("Hýzarabasý - turboYap()");
	}
	

	@Override
	public void hareket() {
		System.out.println("HýzArabasý - hareket()");
	}
	
	public void motorGucuDegistir(){
		
	}

	
	
	public int getTurboMiktari() {
		return turboMiktari;
	}


	public String getAksesuar() {
		return aksesuar;
	}


	public void setTurboMiktari(int turboMiktari) {
		this.turboMiktari = turboMiktari;
	}


	public void setAksesuar(String aksesuar) {
		this.aksesuar = aksesuar;
	}


}
