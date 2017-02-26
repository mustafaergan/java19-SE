package com.vektorel2.generic3;

import java.util.ArrayList;
import java.util.List;

import com.vektorel2.generic2.Person;

public class Islem {

	
	public static void main(String[] args) {
		MyHashMap<Integer,String> myHash = new MyHashMap<>();
		String[] array = {"java","se","ee","swing"};
		myHash.put(1, array);
		MyHashMap<String,Person> myHash2 = new MyHashMap<>();
		Person[] persons = new Person[2];
		myHash2.put("1", persons);
		MyHashMap<String,Person>[] myHash3 = new MyHashMap[5];
		List<MyHashMap<String,Person>> myHashMap4 = new ArrayList<>();
	}
	
}
