package day18_DoWhileLoopScope;

public class C04_Scope01 {
	
	  // 1-main method disinda olusturulan variable'lara class level denir.
	
	
	public int sayi1=1;
	public int sayi2=0;
	
	public String str1;
	String str2="Java";
	
	// 3- static olmayan variable'lara static alanlardan ulasilamaz
	
	static boolean anladinMi;
	// 2- static olarak tanimlanan variab'lar class icinde heryerde kullanilabilir
	//static olsun veya olmasin her methof'dan ulasabilriiz ve kullanabiliriz
	
	static boolean biliyormusun=true;
	static char harf;
	static String str;
	
	// 4- class level'da olusturulan variable'lar static olsun veya oolmasin
	// deger atamadan da kullanilabilir
	// eger biz deger atamazsak Java calss level'daki variable'lara
	// default degerler atar
	// sayisal degerler icin =0, boolean=false, string=null, char=' '

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Scope(Kapsam): bir class icerisinde olsuturulan variable'lar icin scope; o variable'a 
		 nereden ve nasil ulasilabilecegini ve nerede gecerli oldugunu ifade eder.
		 
		 Scope uymayan bir kullanimda Java Compile Time Error verir.
		 
		 Java da olsuturulan variable'lar icin 4 kullanim mevcuttur
		 - Instrance(object) Variables// ogretmen adi; ogrenci notu gibi
		 - Static(class) Variables// okul adi, adres gibi
		 - local(methods) variables
		 - loop variables // deger atamadan olusturabilirsiniz ama kullanamazsiniz
		*/
		
		for (int i=0; i<10; i++) {
			System.out.println(i+" ");
			
			i=10;
			String isim="sanim";
		}
		
		// System.out.println(isim);
		
		//System.out.println(i);  // scope disinda i yi kullanamayiz
		
		//i=10;   // scope disinda i yi kullanamayiz
		
		int sayi;
		//sayi++;
		//System.out.println(sayi);
		
		//method1(); // main method static kulubune uye, static olmayani kabul etmez
		method2();
		
		
		System.out.println("main method icinde anladinMi nin degeri :"+ anladinMi);
		System.out.println("main method icinde str'nin degeri : "+ str);
		System.out.println("main method icinde harf'in degeri : "+ harf);

	}
	
	public void method1() {
		System.out.println("method1 calisti");
		
		sayi1=20;
		System.out.println(anladinMi);
	}
	
	public static void method2() {
		System.out.println("method2 calisti");
	}

}
