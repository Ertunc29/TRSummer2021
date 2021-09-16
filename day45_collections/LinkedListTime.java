package day45_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	LinkedList<Object> ll1=new LinkedList<>();
	System.out.println(System.currentTimeMillis());	
		for (int i = 0; i < 10000; i++) {
			
			ll1.add("A"+i);
			ll1.add(20+i);
			ll1.add('C'+i);
				}
		System.out.println(System.currentTimeMillis());
		
		System.out.println("====================================");
		
    LinkedList ll2=new LinkedList<>();
    
    System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
		ll2.add("K"+i);
		ll2.add(25+i);
		ll2.add('S'+i);
		
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("====================================");
		LinkedList<String> ll3=new LinkedList<>();

System.out.println(System.currentTimeMillis());

		for (int i = 0; i < 10000; i++) {
		ll3.add("K"+i);
		ll3.add(25+""+i);
		ll3.add('S'+""+i);
		}
		System.out.println(System.currentTimeMillis());
		
	}

}
