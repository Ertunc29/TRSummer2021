package day45_collections;

import java.util.LinkedList;

public class LinkedList03 {

	public static void main(String[] args) {
		
		
        LinkedList<String> ll1=new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); // [A, B]
		
		ll1.remove(0); // remove(index) index'deki elemani siler ve bize dondurur
		
		// eger listemiz Integer sayilardan olsuuyorsa
		// parent icine yzdigimiz sayinin index mi yoksa sayi mi oldugunu karistirmamak icin
		// java parantez icine yazilani index olarak kabul eder
		
		System.out.println(ll1); // [B]
		
		ll1.add("A");
		ll1.add("B");
		
		System.out.println(ll1); // [B, A, B]
		
		// ll1.remove("B");
		System.out.println(ll1.remove("B")); // true
		System.out.println(ll1); // [A, B] ilk B'yi sildi 
		
		ll1.addFirst("B");
		
		System.out.println(ll1);
		
		//ll1.removeFirstOccurrence("B"); // ilk buldugu elemani siler
		System.out.println(ll1.removeFirstOccurrence("B")); // true
		System.out.println(ll1.removeFirstOccurrence("C"));// false
		System.out.println(ll1);

	}

}
