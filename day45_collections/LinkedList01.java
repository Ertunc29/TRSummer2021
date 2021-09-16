package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList01 {

	public static void main(String[] args) {
		
		// linked bagli demektir
		// linked list'te tum elemanlar baglidir. tren gibi birbirine bagldir
		
		// collections'da obje olustururken olusturmak istedigimix
		// collection'un class mi yoksa interface mi olduguna bakmaliyiz.
		// eger olusturmak istedigimiz collection interface ise 
		// data turu olarak o interface'i, constructor olarak ise uygun bir class secmeliyiz
		// simdiye kadar list(interface) olustururken constructor olarak Arraylist seciyorduk
		
		List<String> list=new ArrayList<>();
		
		list.add("X");
		list.add("Y");
		
		LinkedList<String> ll1=new LinkedList<>();
		
		ll1.add("S");
		ll1.add("A");
		System.out.println(ll1);
		
		ll1.add(1, "T");
		System.out.println(ll1);
		
		//ll1.addAll(list);
		
		//System.out.println(ll1);
		
		
		ll1.addAll(2, list);
		
		System.out.println(ll1);
		
		ll1.addLast("K");
		
		System.out.println(ll1);
		
		// Linkedlist List ve Queue interface'larin implement ile child'i oldugundan
		// her iki interface'daki methodlari override etmek zorundadir
		// islev olarak ayni isi yapan addLast() queue'dan ve add() List'ten inherit edilmistir
		
		
		// ben bir LinkedList olusturmak istiyorum ama sadece List ozelliklerini tasisin
		
		List<String>  listList=new LinkedList<>();
		
		listList.add("sadece List'ten gelen ozellikler var");
		
		//  ben bir LinkedList olusturmak istiyorum ama sadece Queue ozelliklerini tasisin
		
		Queue<String>  listQueue=new LinkedList<>();
		
		listQueue.add("sadece Queue'den gelen ozellikler var");
		
		

	}

}
