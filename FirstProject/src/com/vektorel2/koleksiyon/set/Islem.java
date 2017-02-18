package com.vektorel2.koleksiyon.set;

import java.util.Set;

public class Islem {

	public static void main(String[] args) {
		String[] array = {"Mustafa","Ahmet","Mahmut","Abdullah","Zeynep"};
		
		MySet mySet = new MySet();
		
		Set<String> veri = mySet.veriDoldur(array);
		Set<String> indexliVeri = mySet.indexliVeriDoldur(array);
		Set<String> treeVeri = mySet.treeVeriDoldur(array);
		
		if(!veri.isEmpty()){
			mySet.verioku(veri);
		}
		
		System.out.println("-----------------");
		
		if(!indexliVeri.isEmpty())
			mySet.verioku(indexliVeri);
		
		System.out.println("-----------------");
		
		if(!treeVeri.isEmpty())
			mySet.verioku(treeVeri);
		
		
		Set<String> veriRasgeleHash = mySet.hashSetRasgeleDoldur();
		
		Set<String> veriRasgeleLinked = mySet.linkedSetRasgeleDoldur();

		Set<String> veriRasgeleTree = mySet.treeSetRasgeleDoldur();
		
		System.out.println("-----------------");
		System.out.println("-----------------");
		mySet.verioku(veriRasgeleHash);
		System.out.println("-----------------");
		mySet.verioku(veriRasgeleLinked);
		System.out.println("-----------------");
		mySet.verioku(veriRasgeleTree);

		
	}
	
}
