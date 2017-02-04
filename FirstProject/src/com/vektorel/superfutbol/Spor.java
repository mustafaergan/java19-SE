package com.vektorel.superfutbol;

public class Spor {
	
	final double PI = 3.5;
	
	private String takým;
	protected String topRengi = "Beyaz";
	
	
	final public void hangiSahadasin(final String sahaIsmi){
		
		System.out.println("sahaismi" + sahaIsmi);
		
	}
	
	public void hangiSahadasin(final double sahaIsmi){
		
		System.out.println("sahaismi" + sahaIsmi);
		
	}
	
	
	public void hangiSahadasin(final String sahaIsmi, String ikinci){
		
		System.out.println("sahaismi" + sahaIsmi);
		
	}
	
	
	final public void hakemVar(){
		System.out.println("Spor - Hakem");
	}
	

	public Spor (){
		System.out.println("Spor Sýnýfý");
	}
	
	public Spor(String value){
		System.out.println("Spor sýnýfý Deger:"+value);
	}
	
	public void kacKisiyiz(int i) {
		System.out.println("Bu kadar ponçik kýzýz :" + i);
	}
	
	
	public void takiminiSoyle(){
		System.out.println("takým "+ this.takým);
	}
	
	public void topunSekiliniSoyle(){
		System.out.println("Top karedir");
	}
	
	public void topRenginiSoyle(){
		System.out.println("top Rengi "+ this.topRengi);

	}
	
	public void topRenginiSoyle(String value) {
		System.out.println("**spor**"+value);
		System.out.println("**spor**"+"Siz ne isterseniz olur abi");
		
	}
	
	
	

	public String getTakým() {
		return takým;
	}

	public void setTakým(String takým) {
		this.takým = takým;
	}

	public String getTopRengi() {
		return topRengi;
	}

	public void setTopRengi(String topRengi) {
		this.topRengi = topRengi;
	}

	
}
