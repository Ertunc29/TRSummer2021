package day33_Encapsulations;

import day18_DoWhileLoopScope.C04_Scope01;


public class C01_Encapsulations {

	public static void main(String[] args) {
		// OOP Concept
		// Object Oriented Programing
	    // bir proje kapsaminda class'larda olusturulan variable ve methodlarin 
		// baska class'larda tekrar tekrar yazilmamasi; var oldugu class'dan obje uretilerek
		// bu variable ve method'larin istendigi kadar kullanilmasidir.
		
		
		C04_Scope01 obj1=new C04_Scope01();
		
		// esitligin sol tarafi declaration
		// declaration iki parca ilk parca data turu ikinci parca isim
		// esitligin saginda ise deger iki parcadan olusur
		// ilki new keyword'u ikincisi constructor'dur
		// hangi class'dan obje uretmek istersek o calss'in constructor'ini kullaniriz
				
				
		obj1.sayi1=15;
		System.out.println(obj1.sayi1);
		
		obj1.method1();
		
		deneme();

	}
	
	public static void deneme() {
		// projemiz kapsaminda bulunan tum class'lardan
		// oublic variable ve method'lara istedigimiz yerden obje ureterek ulasabilirim
		//eger ulasmak istedigim class uyehleri public degilse baska
		// package'larden ulasmak icin extra islem yapmam gerekir
		 
		C04_Scope01 obj2=new C04_Scope01();
		
		obj2.str1="java";
		System.out.println(obj2.str1);
	}

}
