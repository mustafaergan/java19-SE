package com.vektorel.konfeksiyon;

public class MarkaKonfeksiyon extends AKonfeksiyon {
	
	
	@Override
	double satinAlma(int fiyat, int miktar) {
		setKdv(10);
		return super.satinAlma(fiyat, miktar);
	}

	@Override
	void kumasturu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	double kumasturu(int deger) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	float kumasturu(int deger, double deger1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
