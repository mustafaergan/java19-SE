package com.vektorel.myex;

public class Islem {
	
	public static void main(String[] args){
		
		try{
		 int[] dizi = new int[2];
		 dizi[2] = 10;
		}catch (ArrayIndexOutOfBoundsException ex) {
			throw new ArrayHatalari(ex);
		}
		
		
	}

}
