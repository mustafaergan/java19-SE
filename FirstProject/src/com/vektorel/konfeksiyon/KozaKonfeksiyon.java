package com.vektorel.konfeksiyon;

public class KozaKonfeksiyon extends AKonfeksiyon{

	public double satinAlma(int fiyat, int miktar, int indirim) {
		
		return (super.satinAlma(fiyat, miktar) - indirim);
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
