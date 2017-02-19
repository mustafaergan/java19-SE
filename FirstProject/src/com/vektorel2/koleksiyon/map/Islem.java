package com.vektorel2.koleksiyon.map;

import java.util.Map;
import java.util.Map.Entry;

public class Islem {
	
	public static void main(String[] args) {
		
//		Map<String, String> myMap = new HashMap<>();
//		myMap.put("1", "Ahmet");
//		myMap.put("2", "Hasan");
////		myMap.put("3", null);
//		myMap.put("3", "ahmet");
////		System.out.println(myMap);
//		
//		System.out.println(myMap.remove("2"));
//		
//		System.out.println(myMap.entrySet());
//		
//		System.out.println(myMap.get(null));
		
		MyMap map = new MyMap();
		Map<Integer,String> doluMap = map.veridoldur();
		map.verileriGoster(doluMap);
		
		for(Entry en : doluMap.entrySet()){
			if(en.getValue().equals("ahmet"))
				en.setValue("mehmet");
		}
		
		System.out.println(doluMap);
		
		doluMap.put(1, "mahmut");
		
		System.out.println(doluMap);
		
//		doluMap.put("1","hasan")
		
		
		
		
		
	}

}
