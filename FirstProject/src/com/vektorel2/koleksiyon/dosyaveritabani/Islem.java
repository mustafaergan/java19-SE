package com.vektorel2.koleksiyon.dosyaveritabani;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class Islem {
	
	public static void main(String[] args) {
		Veritabani veritabani = new Veritabani();
		
		Map<String, Person> myMap=  veritabani.dosyalariCek("C:/kisiler/");
		Person person;
		for(Entry<String, Person> entry : myMap.entrySet()){
			person = entry.getValue();
			System.out.println(person.getDogumYeri());
		}
		
		System.out.println(myMap);
		
		LinkedList<String> dene = new LinkedList<>();
		
		dene.add("1");
		dene.add("2");
		dene.add("3");
		dene.add("4");
		
		ListIterator listIterator  =   dene.listIterator();
		if(listIterator.hasNext())
			System.out.println(listIterator.next());
		if(listIterator.hasNext())
			System.out.println(listIterator.next());
		if(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
		
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.previous());
		
		
	}

}
