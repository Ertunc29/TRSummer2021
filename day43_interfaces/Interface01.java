package day43_interfaces;

public interface Interface01 {
	
	public void motor(); // interface icinde abstract method'lar ve ozel concrete methodlar olabilir
	
	/*
	 bir abstract method'un body'si olmadigindan o methodun istenen
	 dinamik ozelligi nasil egrceklestirecegini bilmemiz mumkun degildir
	 sadece ne yapacagini biliriz
	 
	 bu method bize sunu anlatir;
	 beni inherit eden her concrete clss'in dinamik motor ozelligi olmalidir
	 */
      void vites();
	  
	  // beni inherit edene her concrete class'in dinamik vites ozelligi olmalidir
	  
	  abstract void kasa ();
	  
	  // beni inherit edene her concrete class'in dinamik kasa ozelligi olmalidir
	 
	 // interface'da sadece abstract, public methodlar olur. bbu iki keyword'u yzsakta yazmasakta 
	 //java tum methodlari bu sekilde kabul eder
	 
	 // java da interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
	 // bir class sonradan bazi keyword'ler yazilarak interface yapilamaz
	 
	 String isim="Mustafa";
	 
	 public static String isim1="Hakan";
	 
	 final String isim2="asli"; // java isim kelimesini bold ve italik yapti demek ki butun variable'lar final ve static'tir
}
