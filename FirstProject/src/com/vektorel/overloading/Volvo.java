package com.vektorel.overloading;

public class Volvo {
	private int id;
	private String name;
	private int model;
	
	public Volvo(){
		this.id = 100;
	}
	
	public Volvo(int id){
		this.id = id;
	}
	
	public Volvo(int id, String name, int model) {
//		System.out.println(" id:"+id+" name:"+name+" model:"+model);
		this.id = id;
		this.name = name;
		this.model = model;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
}
