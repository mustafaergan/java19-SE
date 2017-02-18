package com.vektorel.myex;

public class ArrayHatalari extends ArrayIndexOutOfBoundsException {
	

	public ArrayHatalari(ArrayIndexOutOfBoundsException ex) {
		System.out.println("deneme");
	}

	public void arraySikintilari(){
		System.out.println("Array'de hata var");
	}
}
