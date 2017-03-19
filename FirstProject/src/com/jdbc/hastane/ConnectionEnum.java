package com.jdbc.hastane;

public enum ConnectionEnum {

	HOST(1,"localhost"),
	PORT(2,"5432"),
	DBNAME(3,"veritabani?sslmode=require"),
	USERNAME(4,"kullanici"),
	PASSWORD(5,"SIFRE_KALDIRILDI"),
	JDBC_POSTGRESQL(6,"jdbc:postgresql://");
	
	int id;
	String value;
	
	
	ConnectionEnum(int id, String value){
		this.id = id;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}
	
	public String getValue() {
		return value;
	}
	
	public String dbConnection(){
		String value = ConnectionEnum.JDBC_POSTGRESQL.getValue()
		+ConnectionEnum.HOST.getValue()
		+":"+
		ConnectionEnum.PORT.getValue()
		+ "/"
		+ConnectionEnum.DBNAME.getValue();
		return value;
	}
	
}
