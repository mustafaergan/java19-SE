package com.vektorel.cons;

public class Kitap {
	
	protected String barkod;
	private String isim;
	private int id;
	
//	public Kitap(String barkod){
//		this.barkod = barkod;
//	}
//	
//	public Kitap(String barkod,String isim){
//		this.barkod = barkod;
//		this.isim = isim;
//	}
	
	public Kitap(String barkod,String isim,int id){
		this.barkod = barkod;
		this.isim = isim;
		this.id = id;
	}
	
	
	public Kitap(){
		System.out.println("Kitap Nesnesi Oluþtu");
	}
	
	
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
