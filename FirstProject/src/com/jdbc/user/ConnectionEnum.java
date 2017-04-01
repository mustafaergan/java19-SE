package com.jdbc.user;

public enum ConnectionEnum {

	HOST(1,"ec2-54-83-201-96.compute-1.amazonaws.com"),
	PORT(2,"5432"),
	DBNAME(3,"d4k6g1bpcb45bd?sslmode=require"),
	USERNAME(4,"tkdeqreaurehzf"),
	PASSWORD(5,"DXG6miPHMsWYIXB1Tv0WiSqPH8"),
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
	
	static String dbConnection(){
		String value = ConnectionEnum.JDBC_POSTGRESQL.getValue()
		+ConnectionEnum.HOST.getValue()
		+":"+
		ConnectionEnum.PORT.getValue()
		+ "/"
		+ConnectionEnum.DBNAME.getValue();
		return value;
	}
	
}
