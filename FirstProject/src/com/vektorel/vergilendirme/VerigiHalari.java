package com.vektorel.vergilendirme;

public class VerigiHalari extends Exception{
	int exType;

	public VerigiHalari(int i) {
		this.exType = i;
	}
	
	public void myMessage(){
		if(this.exType == 1){
			System.out.println("kar yanlýþ girildi");
		}else if(this.exType == 0){
			System.out.println("isim yanlýþ");
		}
	}

}
