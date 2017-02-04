package com.vektorel.cons;

public class Defter {
	private int id;
	private String name;
	
	public Defter(){
		System.out.println("Defter Nesnesi Oluþtu");
	}
	
	public Defter(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


}
