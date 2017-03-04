package com.vektorel2.generic2;

import com.vektorel2.enums.EAnkaraninIlceleri;

public class Islem {

	public static void main(String[] args) {
		
		MyClass<Integer,Double,Person> nesnem = new MyClass<>();

		nesnem.setE(10);
		nesnem.setT(20.0);
		
		System.out.println((nesnem.getE()*2));
		
		nesnem.carp();
		
		EAnkaraninIlceleri.CANKAYA.getValue();
		
	}
	
}
