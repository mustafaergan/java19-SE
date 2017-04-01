package com.jdbc.user;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Username:");
		String username = scanner.next();
		System.out.println("Password:");
		String password = scanner.next();

		UserDAO userDAO = new UserDAO();
		
		if(userDAO.isUserControl(username,password)){
			System.out.println("Sisteme Giriþ Baþarýlý");
		}
		
		
		
		
	}

}
