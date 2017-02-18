package com.vektorel2.koleksiyon.vektor;

public class Islem {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		
		myStack.push("1");
		myStack.push("10");
		myStack.push("8");
		
		System.out.println("veri goster");
		myStack.veriGoster();
		System.out.println("pop");
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());

	}




	
}
