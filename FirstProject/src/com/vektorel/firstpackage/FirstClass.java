package com.vektorel.firstpackage;

public class FirstClass {

	public static void main(String[] args) {

		String ad = "Ahmet";
		String soyad = "Öz";
		byte yas = 25;
		char cinsiyet = 'e';
		String sirket = "Vektorel";
		String pozisyon = "Eðitmen";
		float maas = 2500;
		boolean evliMi = false;

		int sayi1 = 55;
		int sayi2 = 30;
		int sonuc = sayi1 % sayi2;
		System.out.println(sonuc);

		int rakam1 = 5;
		rakam1 %= 10;
		System.out.println(rakam1);

		byte x = 8;
		byte y = 7;

		int z = x & y;
		z = x | y;
		System.out.println(z);

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		int maasim = 1500;
		System.out.println(maasim == 1500);

		if (maasim > 2500) {
			System.out.println("Maaþýn ");
			System.out.println("yüksek.");
		} else if (maasim < 750) {
			System.out.println("Maaþýn düþük.");
		} else if (maasim > 1250 && maasim < 1500) {
			System.out.println("Maaþýn düþüðe yakýn.");
		} else {
			System.out.println("Maaþýn ideal.");
		}

		int a = (maasim > 2500) ? 5 : (maasim > 2500) ? 6 : 7;

		System.out.println("---------");
		int i = 0;
		for (i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("5'i atlýyorum.");
				break;
			}

			System.out.println("Merhaba");
		}
		System.out.println(i);

		int sayac = 5;
		while (sayac < 25) {
			System.out.println("Sayaç sayýyor.");
			sayac++;
		}

		do {
			System.out.println("do-while çalýþýyor.");
		} while (false);

		System.out.println("*-*-*-*-*-");
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int m = 5; m >= 0; m--) {
			for (int n = m; n >= 0; n--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("while");
		int k = 5;
		int l = 0;
		while (k >= 0) {
			while (l < k) {
				System.out.print("*");
				l++;
			}
			l = 0;
			System.out.println();
			k--;
		}

		
		
		System.out.println("Tekrar eden ");
		int sayac2 = 3;
		for (int q = 0; q < sayac2 * 2; q++) {
			for (int w = 0; w <= q % sayac2; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int sayiDegeri;
		for (int say = 0; say < 10; say++) {
			sayiDegeri = 15 * say;
			System.out.println(sayiDegeri);
		}
		
		
		
		
		
//		*
//		***
//		*****
//		*******
		
		for (int o=0; o < 6; o++) {
			if (o % 2 != 0) {
				continue;
			}
			
			for (int u = 0; u <= o; u++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int age = 26;
		switch (age) {
		case 25:
			System.out.println("Yaþýnýz 25");
			break;
		case 26:
			System.out.println("Yaþýnýz 26");
			break;
		default:
			System.out.println("Yaþýnýzý bulamadýk!");
			break;
		}
		
	}

}
