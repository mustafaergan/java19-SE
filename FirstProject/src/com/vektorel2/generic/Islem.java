package com.vektorel2.generic;

public class Islem {

	public static void main(String[] args) {
//		String a = (String)ekranaBastir("Merhaba Dunya");
//		ekranaBastir(10);
//		ekranaBastir(10.0);
//		System.out.println(ekranaBastir('a'));
		Person person = new Person();
		
		ekranaBastir(person,"String");
		
		Animal animal = new Animal();
		
		ekranaBastir(animal,10);
		
//		Animal.ekranaYazdir();

	}
	
	
	public static <E,M> E ekranaBastir(E e, M m){
		System.out.println(e);
		if(e instanceof Person){
			Person person = ((Person) e);
			System.out.println(person.benimBilgilerim());
			System.out.println(m);
		}
		if(e instanceof Animal){
			Animal animal = ((Animal) e);
			System.out.println(animal.benimBilgilerim());
			System.out.println(m);
		}
		return e;
	}
}
