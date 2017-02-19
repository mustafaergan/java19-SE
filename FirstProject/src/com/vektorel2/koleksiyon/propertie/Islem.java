package com.vektorel2.koleksiyon.propertie;

import java.util.Properties;

public class Islem {

	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.setProperty("userName", "leprax");
		System.out.println(pro.getProperty("userName"));
	}
	
}
