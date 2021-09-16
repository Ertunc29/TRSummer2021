package day42_abstractClasses;

public abstract class Personel {
	
	// bir class'i abstract yapmak icin class keyword'unden once
	// abstract yazmak yeterlidir
	
	// abstract bir class'in icinde variable olabilir mi?
	// olabilir
	
	// variable abstract olabilit mi?
	// olamaz
	
	
	
	
	public String isim="Yasin";
	
	// public abstract int sayi=10;

	 // abstract class'in tum concrete child'lari abstract class'daki tum dinamik 
	// ozellikleri override etmek zorundadir. (yani method)
	
	// bir method abstract olabilir mi ?nasil yapilir?
	
	public abstract void  maasHesapla();
	public abstract void mesaiBilgisi();
	
	// bir abstract class'da concrete method yazilabilir mi?
	// bir abstract class'da abstract ve concrete method'lar olabilir
	// concrete child method'lar abstract method'lari override etmek zorundadir
	// ama concrete methodlari overrride etmek istege baglidir
	
	public void ozelSigorta() {
		System.out.println("bu personel ozel sigorta kapsamindadir");
	}
	
	
}


