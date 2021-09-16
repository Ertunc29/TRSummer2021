package day25_constructor;

public class C03 {
	
	int sayi=10;
	String isim="Mehmet";
	// ayni package daki farkli class'lardan bu variable'lara ulasilabilir
	// cunku access modifier yazmazsak default access moidifier kullanilir
	// access modifier default ise ayni paketten heryerden kullanilabilir
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sayi=20; degisken static olmadigi icin main method'da kullanamam
		
		// deneme(); deneme method'u static olmadigi icin main method'dan cagiramam
		
		C03 obj1=new C03();
		obj1.denem();
        // ayni class'ta oldugumuz halde sttaic olmadigi icin kullanmadigimiz variable ve methodlari
		// obje olustutrarak kullanabiliriz.
	}
	
	public void denem() {
		
		System.out.println("deneme methodu calisti");
	}

}
