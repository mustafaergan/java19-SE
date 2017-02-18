package com.vektorel2.koleksiyon.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MyMap {
	
	Scanner scan = new Scanner(System.in);

	public Map<Integer,String> veridoldur(){
		Map<Integer,String> myMap = new HashMap<>();
		
		while(1==1){
			int key = scan.nextInt();
			if(key == 0)
				break;
			String value = scan.next();
			myMap.put(key, value);
		}
		return myMap;
		
	}
	
	public void verileriGoster(Map<Integer,String> map){
		
		for(Entry<Integer, String> veri : map.entrySet()){
			System.out.println(veri.getKey());
			System.out.println(veri.getValue());
		}
		System.out.println("-------");
		 Iterator it =  map.entrySet().iterator();
		 while (it.hasNext()) {
			 Entry en = (Entry) it.next();
			 System.out.println(en.getValue());
		}
		 
	}
	
	
	
	
	
	
	

}
