package com.vektorel.firstpackage;

public class Rekursif {
	
	public int faktoriyel(int value) {
		if (value == 1) {
			return 1;
		}
		return value * faktoriyel(value-1);
	}
	
	public void writeName(int value) {
		if (value == 0) {
			return;
		}
		
		System.out.println("Vektorel");
		writeName(value-1);
	}
	
	public int fibonacci(int value) {
		if (value == 0) {
			return 0;
		} else if (value == 1) {
			return 1;
		}
		
		return fibonacci(value - 1) + fibonacci(value - 2);
	}
	
	public double usAl(double taban, double us) {
		if (us == 0) {
			return 1;
		}
		
		if (us < 0) {
			return (1/taban) * usAl(taban, us+1);
		}
		
		return taban * usAl(taban, us-1);
	}
	
	public static void main(String[] args) {
		Rekursif r = new Rekursif();
		r.writeName(5);
		
		System.out.println(r.fibonacci(6));
		System.out.println(r.usAl(5, -2));
	}
}
