package day37_overriding;

public class GeciciIsci extends Isci {
	
	public String calistigiBolum="Yemekhane";

	public static void main(String[] args) {
		
		// overriding : bir child class'da parent class'dan alinan method'u degistirmeye
		// overriding denir.
		
		GeciciIsci gi1=new GeciciIsci();
	    System.out.println(gi1.maasHesapla());
	    gi1.mesai();
	    
        
	}
	
	// overriding yapmak icin parent class'inda ki method signature ile 
	// child class'da bir method olusturulur
	// signature ayni oldugundan sadece body degisir
	// boylece parent class'daki method child class icin gecersiz hale gelir
	
	public int maasHesapla() {

		return 30*8*10;
	}

	@Override // annotaion
	
	public void mesai() {
		//super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calisir");
		
		// annotation : aciklama, dipnot 
		// java 28. satirda kodu inceleyenler icin bir aciklama getiriyor
		
		// annotation olmasi ile olmamasi arasinda ki fark 
		// annotation sadece bir aciklama degildir 
		// override yaptigimiz methodu surekli kontrol eder ve parent class'da ki overriden method
		// signuter'i degistirilirse CTE verdirir.
		
		// eger override edilen parent class'daki method'un da calismasini 
		// istiyorsak overriding method'un ilk satirina super.overridenMethodIsmi yazariz
		// eger overriding method'un ilk satirina super() yazmazsak 
		// overriden method calismaz.
		
		// Access modifier 
		// Child Parent'i sinirlandiramaz
		//Yani overriding method'un access modifier'i overriden method'un access modifier'indan daha dar olamaz
		
		// Return Type
		// overriden method'un return type'i primitive veya void ise
		// overriding method'u return type'i da ayni olmali
		// eger return type primitive degil ise 
		// (overriding method'un return type'i) IS-A (overriden method'un return type'i) olmalidir.
	}

}
