package com.vektorel.object;

public class Islem {
	
	public static void main(String[] args) {
		Object monitor = new Monitor();
		Object sandelye = new Sandelye();
		kimsinSoyle(monitor);
		kimsinSoyle(sandelye);
	}

	private static void kimsinSoyle(Object obj) {
		if(obj instanceof Monitor){
			Monitor mon = (Monitor) obj;
			System.out.println(mon.kimsin);
		}else if(obj instanceof Sandelye){
			Sandelye san = (Sandelye) obj;
			System.out.println(san.kimsin);
		}
	}

}
