package day43_interfaces;

public interface Interfaces02 {
	
	
	void jant();
	
	// buaradaki default ve static bizim bildigimiz default ve static mi?
	// HAYIR
	
	  public default void deneme() { // concrete method----default ile
		
		System.out.println("default keyword'lu method calisti");
	}
	     
	     // bizim bildigimiz default access modifier'di
	     // bir method'da birdenf alza access modifier olur mu?
	     // bizim interface'da olusturdugumuz tum methodlar public ve abstract'tir
	  // interface da default keyword kullanarak cencrete method olusturabiliriz
	  // buradaki default keyword'u access modifier degil
	  // java nin ozel bir cozumudur
	  // buradaki default keyword basina yazildigi method'un cocnrete oldugunu belirtir
	     
	     static void deneme2() {
	    	 
	    	 System.out.println("static keyword'lu method calisti");
	     }
	     
	     // yukarida default keyword icin yazdigimiz durum;lar static icinde gecerlidir
	     // static ve default keyword'u kullanarak olustrdugumuz methodlar
	     // override edilmek zorunda degildir.
	     
	     String isim="Zeynep";
	     
	   

}
