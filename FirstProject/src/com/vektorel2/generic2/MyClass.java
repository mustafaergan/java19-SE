package com.vektorel2.generic2;

public class MyClass <E,T,M> {
	E e;
	T t;
	M m;
	
	public void setE(E e) {
		this.e = e;
	}
	public E getE() {
		return e;
	}
	
	public void setM(M m) {
		this.m = m;
	}
	
	public M getM() {
		return m;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	public void carp(){
		System.out.println((Integer)e*(Double)t);
	}
}
