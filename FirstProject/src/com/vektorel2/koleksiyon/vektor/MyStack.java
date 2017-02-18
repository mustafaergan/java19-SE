package com.vektorel2.koleksiyon.vektor;

import java.util.Enumeration;
import java.util.Stack;

public class MyStack{
	
	Stack<String> myStack = new Stack<>();
	
	public void push(String veri){
		myStack.push(veri);
	}
	
	public String pop(){
		if(myStack.isEmpty())
			return null;
		return myStack.pop();
	}
	
	public void veriGoster(){
		Enumeration array = myStack.elements();
		
		while(array.hasMoreElements())
			System.out.println(array.nextElement());
	}

	public String peek() {
		return myStack.peek();
	}

}
