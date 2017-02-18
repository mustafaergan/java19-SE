package com.vektorel2.koleksiyon.vektor;

import java.util.Enumeration;
import java.util.Stack;

public class StackSinifi {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		System.out.println("1. donus");
		
		Enumeration array = stack.elements();
		
		while(array.hasMoreElements()){
			System.out.println(array.nextElement());
		}
		System.out.println("2. donus");

		Enumeration array2 = stack.elements();
		
		while(array2.hasMoreElements()){
			System.out.println(array2.nextElement());
		}
		

		while(!stack.isEmpty()){
			System.out.println("pop ettiðim nesne:" + stack.pop());
		}
		

		Enumeration array3 = stack.elements();
		
		while(array3.hasMoreElements()){
			System.out.println(array3.nextElement());
		}
 		
	}

}
