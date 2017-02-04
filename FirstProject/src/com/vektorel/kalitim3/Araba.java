package com.vektorel.kalitim3;

public class Araba {
	
	protected double motorGucu;
	int model;
	String markasi;
	
	public void hareket(){
		System.out.println("Araba - Hareket()");
	}
	
	public void fren(){
		System.out.println("Araba - Fren()");
	}

	public double getMotorGucu() {
		return motorGucu;
	}

	public int getModel() {
		return model;
	}

	public String getMarkasi() {
		return markasi;
	}

	public void setMotorGucu(double motorGucu) {
		this.motorGucu = motorGucu;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public void setMarkasi(String markasi) {
		this.markasi = markasi;
	}
	
	

}
