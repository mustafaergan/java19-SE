package com.vektorel.array;

public class Array implements IArray,IArrayMaks {
	
	int[] array;
	
	public Array(int[] array) {
		this.array = array;
	}

	/**
	 * Tekleri bulan kod
	 */
	public void tekBul() {
		for(int i = 0 ; i < this.array.length ; i++ ){
			if(array[i] %2 ==1){
				System.out.println(array[i]);
			}
		}
	}
	
	/**
	 * Çiftleri bulan kod
	 */
	public void ciftBul() {
		for(int i = 0 ; i < this.array.length ; i++ ){
			if(array[i] %2 == 0){
				System.out.println(array[i]);
			}
		}
	}
	/**
	 * maksimun deger bulur
	 */
	public void makBul() {
		int ilk = this.array[0];
		for(int i = 0 ; i < this.array.length ; i++ ){
			if(ilk < this.array[i])
				ilk =  this.array[i];
		}
		System.out.println("mak deger" + ilk);
	}

}
