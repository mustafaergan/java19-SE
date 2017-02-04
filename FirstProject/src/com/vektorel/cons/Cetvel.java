package com.vektorel.cons;

public class Cetvel {
	int id;
	private String name;
	
	//**********************Cons*******************/
	public Cetvel(){
		System.out.println("Cetvel Nesnesi Olustu");
	}
	
	public Cetvel(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	//**********************Ýþlem *******************/

	
	public void oku(){
		System.out.println("Benim Id:" + this.id);
		
		System.out.println("Benim Adým:" + this.name);
		
		System.out.println("**************");

	}
	
	public String isimSoyle(){
		return this.name;
	}
	

	
	//**********************Setter Getter *******************/

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
