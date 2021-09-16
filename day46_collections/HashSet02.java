package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class HashSet02 {

	public static void main(String[] args) {
		
     Set<String> set1= new HashSet<>();
		
		set1.add("Z");  
		set1.add("B");  
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B"); // set tekrar kabul etmez
		
		System.out.println(set1); // [A, B, C, Z]
		
		set1.clear();
		System.out.println(set1); // []
		set1.add("Z");  
		set1.add("B");  
		set1.add("A");
		set1.add("C");
		set1.add("M");
		
		System.out.println(set1); // [A, B, Z]
		
		Set<String> set2= new HashSet<>();
		
		set2.add("B");
		set2.add("Z"); 
		set2.add("A");
		System.out.println(set2);
		
		System.out.println(set1.containsAll(set2)); // true
		System.out.println(set2.containsAll(set1));// false
		
		set1.removeAll(set2); // en az ayni olan bir eleman bulursa siler ve true doner
		
		
		System.out.println(set1);
		System.out.println(set2);
		
		set1.add("B");  
		set1.add("A");
		set1.add("C");
		
		
		set1.retainAll(set2); // 
		
		System.out.println(set1);
		System.out.println(set2);
		
		
		
	}
}
