package day47_queue_maps;

import java.util.Deque;
import java.util.LinkedList;

public class Queue02 {

	public static void main(String[] args) {
		// De: double ended (cift tarafli)
		
		Deque<String> dk1=new LinkedList<>();
		
		dk1.addFirst("C");
		dk1.add("M");
		dk1.add("A");
		
		System.out.println(dk1); // [C, M, A]
		
		dk1.addLast("L");
		
		System.out.println(dk1); // [C, M, A, L]
		
		System.out.println(dk1.getFirst()); // C
		System.out.println(dk1.getLast()); // L
		
		System.out.println(dk1.hashCode()); // 2995606
		
		System.out.println(dk1.pop()); // C
		
		System.out.println(dk1); // [M, A, L]
		
		dk1.push("Y");
		System.out.println(dk1); // [Y, M, A, L]

	}

}
