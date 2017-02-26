package com.vektorel2.generic3;

public class MyHashMap<K,A> {

	K k;
	A[] a;
	
	public void put(K k,A[] a){
		this.k = k;
		this.a = a;
	}
}
