package day47_queue_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		
		// Queue bir interface'dir dolaysiyla obje uretemeyiz
		// child Class'i olan PriorityQueue ve LinkedList constructor secimine 
		
		
		Queue<String> q1=new PriorityQueue<>();
		
		q1.add("D");
		q1.add("W");
		q1.add("M");
		q1.add("B");
		
		System.out.println(q1); // [B, W, M]
		
		// Queue yapisi geregi insertion order'a gore siralama yapmasi beklenir
		// Ancak constructor olarak PriorityQueue sectigimiz icin java tarafindan belirlenen
		// priority'e gore siralama yapar
		
		//Bizde istersek Priority kuralini tanimlayabiliriz..O zaman bizim istedigimize gore siralar
		
		Queue<String> q2=new LinkedList<>();
		
		// ayni elemanlarla fakat LinkedList construvtor'i kullanarak olusturdugumuz
		// queue ise beklenenlere uygun olarak ekleme sirasina gore yazdirir
		
		q2.add("D");
		q2.add("W");
		q2.add("M");
		q2.add("B");
		
		System.out.println(q2); // [D, W, M, B]
		
		// Queue yapisi geregi FIFO gecerlidir
		
		q2.offer("Z");
		
		System.out.println(q2); // [D, W, M, B, Z]
		
		q1.offer("Z"); // en sona eleman ekler
		
		q1.offer("X");
		
		
		System.out.println(q1); // [D, W, M, B, Z]
		
		System.out.println(q2.peek()); // D silmeden ilk elemani bize dondurur
		
		System.out.println(q2); // [D, W, M, B, Z]
		
		q2.remove();
		
		System.out.println(q2); // [W, M, B, Z]
		
		q2.element(); // silmeden ilk elemani getirir
		
		System.out.println(q2);// [W, M, B, Z]
		
		q2.poll();
		System.out.println(q2); // [M, B, Z]
		
		q2.remove("B");
		
		System.out.println(q2); // [M, Z]
		
		q2.poll();
		
		System.out.println(q2);
		
        q2.remove();
		
		System.out.println(q2); // bos suan
		
		// q2.remove(); // exception verir
		
		// q2.poll();
		
		q2.element(); // exception verir

		
		
		
	
		
		

	}

}
