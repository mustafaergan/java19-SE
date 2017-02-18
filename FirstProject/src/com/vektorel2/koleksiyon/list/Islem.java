package com.vektorel2.koleksiyon.list;

import java.util.List;

public class Islem {
	public static void main(String[] args) {
		String[] myArray =
			{"Salça","Tavuk","Dometes","Salça","Tuz"};
		
		MyList list = new MyList();
		
		List<String> dolmusListe = list.veriDoldur(myArray);
		
		dolmusListe.contains("Salça");
		
		dolmusListe.remove("Tuz");
		
		dolmusListe.lastIndexOf("Salça");
		System.out.println(
				dolmusListe.get(dolmusListe.indexOf("Salça")));
		
		//		list.veriOku(dolmusListe);
	}
}
