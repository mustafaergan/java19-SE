package com.vektorel2.generic2;

public class Islem {

	public static void main(String[] args) {
		
		MyClass<Integer,Double,Person> nesnem = new MyClass<>();

		nesnem.setE(10);
		nesnem.setT(20.0);
		
		System.out.println((nesnem.getE()*2));
		
		nesnem.carp();
		
	}
	
}
