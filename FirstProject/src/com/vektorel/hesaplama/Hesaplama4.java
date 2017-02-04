package com.vektorel.hesaplama;

public class Hesaplama4 {
	
	protected int sabit = 2;
	private int ozelsabit = 1;
	
	protected static void ekranaBas(){
		
	}
	
	public static void main(String[] args) {
		ekranaBas();
	}
	
	public static class Toplama4{
		protected static int toplama;
		protected int sonuc;
		
		public int toplamaYap(int param1, int param2){
			return param1 + param2;
		} 
		
		public void dekontOlustur(){
			
		}
	}
	
	public class Cikarma4{
		protected int sonuc;
		
		public int cikarmaYap(int param1, int param2){
			return param1 - param2 * sabit;
		}
		
	}
	
	
			
			

}
