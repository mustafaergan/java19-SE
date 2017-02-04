package com.vektorel.NumberExp;

import java.util.Scanner;

public class Islem {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try{
			while(true){
				int ver = Integer.parseInt(scan.nextLine());
			}
		}catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Ver hatasý");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			scan.close();
		}

		
	}

}
