package com.vektorel.overloading;

public class Toyota {
	private int id;
	private String name;
	
	protected Toyota(){
		System.out.println("Toyota nesnesi oluþturuldu");
	}
	
	protected Toyota(int id , String name){
		System.out.println("Toyota class Toyata id : "+id+ "Name: "+ name);
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
}
