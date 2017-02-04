package com.vektorel.kalitim3;

public class Islem {

	public static void main(String[] args) {
		
		HýzArabasi hýzArabasi =new HýzArabasi();
		
		hýzArabasi.setModel(2017);
		hýzArabasi.setMotorGucu(2000.0);
		hýzArabasi.setMarkasi("Ferari");
		
		hýzArabasi.setTurboMiktari(5000);
		hýzArabasi.setAksesuar("rüzgarlýk");
		
		
		hýzArabasi.hareket();
		
		
		
	}
}
