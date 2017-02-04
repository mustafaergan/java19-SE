package com.vektorel.cons;

public class Kalem {
	private int id;
	private String name;
	
	
	public Kalem(){
		System.out.println("Kalem Nesnesi Oluþtu");
	}
	
	public Kalem(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void oku(){
		System.out.println("Benim Id:" + this.id);
		
		System.out.println("Benim Adým:" + this.name);
		
		System.out.println("**************");

	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


}
