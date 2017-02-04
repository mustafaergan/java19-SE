package com.vektorel.overloading;

public class Araba {
	
	Volvo volvo;
	
	
	public Araba(int arabaId){
		System.out.println("araba int id:"+arabaId +" nesnesi oluþturuldu");
	}
	
	public Araba(double arabaId){
		System.out.println("araba double:"+arabaId +" nesnesi oluþturuldu");
	}
	
	public Araba(String arabaId){
		System.out.println("araba String:"+arabaId +" nesnesi oluþturuldu");
	}
	
	public Araba(){
		System.out.println("Araba Nesnesi Oluþturuldu");
	}
	
	protected Araba(int id,String name){
		System.out.println("int iki parametreli id:"+ id + "name:"+name);
	}
	
	protected Araba(String id,String name){
		System.out.println("string iki parametreli id:"+ id + "name:"+name);
	}
	
	public Araba(Volvo volvo){
		System.out.println("Volvo tipinde nesne üratildi");
	}
	public Araba(Fiat fiat){
		System.out.println("Fiat tipinde nesne üratildi");
	}
	public Araba(Toyota toyota){
		System.out.println("Araba Classý Toyota tipinde nesne üratildi");
	}

	public Araba(Fiat isimliFiatNesnesi, Volvo volvo) {
		this.volvo = volvo;
		//		System.out.println("iki parametreli volvo,fiat nesnesi oluþtu");
		System.out.println("Fiat id:"+isimliFiatNesnesi.getId()
							+"-- name:"+isimliFiatNesnesi.getName());
		
		System.out.println("Volvo id:"+volvo.getId()
		+"-- name:"+volvo.getName());
		
	}
	
	public void setVolvo(Volvo volvo) {
		this.volvo = volvo;
	}
	
	public Volvo getVolvo() {
		return volvo;
	}
	
	

	

}
