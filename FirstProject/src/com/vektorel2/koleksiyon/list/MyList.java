package com.vektorel2.koleksiyon.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {
	public List<String> veriDoldur(String[] array){
		List<String> myList = new ArrayList<>();
		
		for(String s:array){
			myList.add(s);
		}
		
		return myList;
	}
	
	public void veriOku(List<String> mahmudunListesi){
		
//		for(String s : mahmudunListesi){
//			
//		}
		
		for(int i = 0; i<mahmudunListesi.size() ; i++){
			System.out.println(mahmudunListesi.get(i));
		}
		
//		Iterator<String> iterator = mahmudunListesi.iterator();
//		
//		while (iterator.hasNext()) {
//			iterator.next();
//		}
		
	}
	
	
	
	
	
	
	
}
