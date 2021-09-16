package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
		
	//	Set<String> set= new Set<>(); obje olusmaz Set Interface
		
		Set<String> set1= new HashSet<>();
		
		set1.add("Z");  // 
		set1.add("B");  
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B"); // set tekrar kabul etmez
		
		System.out.println(set1); // [A, B, C]
		
		System.out.println(set1.hashCode()); // 288
		
		//set1.add("Trabzon");
		//set1.add("Kelkit");
		
		set1.add("X");
		
		System.out.println(set1);  // [A, B, C, Trabzon, Kelkit, Z]
		
		// set'de onemli olan ozellik No duplication ve elemanin kumede var olup olmamasidir
		// Siralama Set icin onemli degildir
		// Set icin elemanlari girdigimiz sirada verir veya elemanlari natural siralama verir
		// gibi bir ifade kullanamayiz

		System.out.println(set1.hashCode()); // 376
		
		// Collections'da hashCode() method'u o cellection icindeki
		// tum elemanlarin hashCode arin toplamini verir
		// yeni eleman eeklersek dogal olarak hash code degisir

	}

}
