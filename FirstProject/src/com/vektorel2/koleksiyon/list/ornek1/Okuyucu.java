package com.vektorel2.koleksiyon.list.ornek1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Okuyucu {
	
	Scanner scan;
	
	public List<String> dosyaoku(String path){
		List<String> alisverisList = new ArrayList<>();
		try {
			scan = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(scan.hasNextLine()){
			String s = scan.nextLine();
			if(!s.equals("Alýþveriþ Listesi:"))
				alisverisList.add(s);
		}
		return alisverisList;
	}
	
	public List<String> alisverisLinkList(String path){
		List<String> alisverisList = new LinkedList<>();
		try {
			scan = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(scan.hasNextLine()){
			String s = scan.nextLine();
			if(!s.equals("Alýþveriþ Listesi:"))
				alisverisList.add(s);
		}
		return alisverisList;
	}

}
