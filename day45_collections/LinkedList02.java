package day45_collections;

import java.util.LinkedList;

public class LinkedList02 {

	public static void main(String[] args) {
		
		
    /*LinkedList<String> ll1=new LinkedList<>();
		
		ll1.add("A");
		ll1.add(20);
		ll1.add('C');
		
		System.out.println(ll1);
		*/
		LinkedList<Object> ll1=new LinkedList<>();
		
		// Collections'da esitligin sol tarafinda <> icinde data turu yazilmasa
		//  veya data turu olarak Object yazilsa da collections calisir
		// ama boyle bir durumda surekli casting yapildigi icin
		// zaman ve hafiza acisindan verimli degildir
			ll1.add("A");
		ll1.add(20);
		ll1.add('C');
		
		System.out.println(ll1);
	 LinkedList<Object> ll2=new LinkedList<>();
		
		ll2.add("K");
		ll2.add(25);
		ll2.add('S');
		
		System.out.println(ll2);
		LinkedList<String> ll3=new LinkedList<>();
		
		ll3.add("K");
		ll3.add(25+"");
		ll3.add('S'+"");
		
		System.out.println(ll3);

	}

}
