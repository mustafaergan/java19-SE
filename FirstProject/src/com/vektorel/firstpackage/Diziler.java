package com.vektorel.firstpackage;

public class Diziler {

	public static void main(String[] args) {
		
		char[] isimDizisi = new char[7];
		isimDizisi[6] = 'a';
		isimDizisi[5] = 'f';
		isimDizisi[4] = 'a';
		isimDizisi[3] = 't';
		isimDizisi[2] = 's';
		isimDizisi[1] = 'u';
		isimDizisi[0] = 'M';
		
		for (int i = 0; i < isimDizisi.length; i++) {
			System.out.println(isimDizisi[i]);
		}
		
		String[] firmaAdi = new String[] {
				"Vektorel", "Biliþim", "A.Þ.", "", ""
		};
		firmaAdi[1] = "biliþim";
		System.out.println(firmaAdi);
		
		
		int[][] ikiboyutluDizi = new int[2][2];
		
		ikiboyutluDizi[0][0] = (int) (Math.random() * 10);
		ikiboyutluDizi[0][1] = (int) (Math.random() * 10);
		ikiboyutluDizi[1][0] = (int) (Math.random() * 10);
		ikiboyutluDizi[1][1] = (int) (Math.random() * 10);
		
		for (int i = 0; i < ikiboyutluDizi.length; i++) {
			for (int j = 0; j < ikiboyutluDizi[0].length; j++) {
				System.out.print(ikiboyutluDizi[i][j]);
				System.out.print("-");
			}
			System.out.println();
		}
		
	}

}
