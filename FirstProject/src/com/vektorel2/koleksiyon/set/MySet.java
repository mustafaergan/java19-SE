package com.vektorel2.koleksiyon.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	
	public Set<String> veriDoldur(String[] array){
		Set<String> mySet = new HashSet<>();
		for(String s : array){
			mySet.add(s);
		}
		return mySet;
	}
	public Set<String> indexliVeriDoldur(String[] array) {
		Set<String> veri = new LinkedHashSet<>();
		for(String s: array){
			veri.add(s);
		}
		
		return veri;
	}
	
	public Set<String> treeVeriDoldur(String[] array) {
		Set<String> veri = new TreeSet<>();
		for(String s: array){
			veri.add(s);
		}
		return veri;
	}
	
	public void verioku(Set<String> mySet){
		Iterator<String> iterator = mySet.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
	
	
	public Set<String> hashSetRasgeleDoldur() {
		Set<String> mySet = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		for(;;){
			String eklenecekVeri = scan.nextLine();
			if(eklenecekVeri.equals("Exit")){
				break;
			}
			if(mySet.add(eklenecekVeri)){
				System.out.println("veriyi ekledim");
			}else
				System.out.println("veriyi ekleyemedim");
		}
		return mySet;
	}
	
	public Set<String> linkedSetRasgeleDoldur() {
		Set<String> mySet = new LinkedHashSet<>();
		Scanner scan = new Scanner(System.in);
		for(;;){
			String eklenecekVeri = scan.nextLine();
			if(eklenecekVeri.equals("Exit")){
				break;
			}
			mySet.add(eklenecekVeri);
		}
		return mySet;
	}
	
	public Set<String> treeSetRasgeleDoldur() {
		Set<String> mySet = new TreeSet<>();
		Scanner scan = new Scanner(System.in);
		for(;;){
			String eklenecekVeri = scan.nextLine();
			if(eklenecekVeri.equals("Exit")){
				break;
			}
			mySet.add(eklenecekVeri);
		}
		return mySet;
	}




}
