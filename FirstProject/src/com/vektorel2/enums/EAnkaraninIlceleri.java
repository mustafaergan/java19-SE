package com.vektorel2.enums;

public enum EAnkaraninIlceleri {
	
	CANKAYA(1,"Çankaya"),
	MAMAK(2,"mamak"),
	KECIOREN(3,"keçiören");
	
	int key;
	String value;
	
	EAnkaraninIlceleri(int key, String value){
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
}
