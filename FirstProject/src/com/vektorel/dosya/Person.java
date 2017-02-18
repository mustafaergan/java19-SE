package com.vektorel.dosya;

public class Person {
	
	private int id;
	private String name;
	
	public Person(int i, String string) {
		this.id = i;
		this.name = string;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
