package day29_passByValue_mutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_passByValue01 {

	public static void main(String[] args) {
		
		/* 
		  soru 3: bir list olusturalim. ekeman olarak 10,11, 12, ekleyelim
		  iki method olusturup list elemanlarini artirmayi deneyelim
		  - 1.method'a elemanlari for each loop kullanarak artirin
		  - 2. Method'a elemanlari set method'u kullanarak artirin
		  - Nethod'lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim
		  
		 
		 */
		
		List<Integer> sayiList=new ArrayList<>();
		
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);
		
		System.out.println("ilk olusturdugumuz liste :"+ sayiList); //[10, 11, 12]
		
		forEeachLoopIleArtir(sayiList);
		 System.out.println("for loop method'undan sonra List : " + sayiList); // [10,11,12]
		 
		 setIleArtir(sayiList);
		 
		 System.out.println("set method'undan sonra Main method icinde List : "+ sayiList); // supriz-[15, 16, 17]

	}

	private static void setIleArtir(List<Integer> sayiList) {
		
		
		for (int i=0;i<sayiList.size();i++) {
			sayiList.set(i, sayiList.get(i)+5);
			
			
			// loop'dan sonra listeyi yazdiralim
			
			
		}
		
		System.out.println("set method'u icinde artirimdan sonra List : "+ sayiList); //[15, 16, 17]
		
		
		
		
	}

	private static void forEeachLoopIleArtir(List<Integer> sayiList) {
		// for each ile sayilari artiralim
		
		System.out.print("foreach loop ile artirdigimiz elemntler ;");
		
		for(Integer each : sayiList) { // each loop disina cikamaz. 
			
			each+=5;
			System.out.print(each+" "); // 15, 16, 17
			
		}
		System.out.println();
		System.out.println("foreach loop'dan sonra list :" + sayiList); // [10,11,12]
		
		
		// foreach loop ile atama yapamadigim icin listeyi kalici olarak degistiremedim
		// for loop kullanip get method'u ile elementleri cagirinca da atama yapamadim
		// dolaysiyla for loop ile elementleri kalici olarak degistiremedim
		
	}

}
