package day44_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	public static void main(String[] args) {
		
List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		
		// her elemana B harfini ekleyelim
		
		ListIterator li1=list.listIterator();
		
		while(li1.hasNext()) {
			
			
			li1.set(li1.next()+"B");
		}
		System.out.println(list);
		
		
		 ArrayList<String> calisanlar=new ArrayList<String>();
	        calisanlar.add("Ahmet");
	        calisanlar.add("Memmet  ");
	        calisanlar.add("Hande");
	        calisanlar.add("Hüseyin");
	       
	        ListIterator<String> iterator=calisanlar.listIterator();
	        
	        System.out.println("Baþtan sona doðru yazdýralým...");
	        
	        while(iterator.hasNext()){
	            System.out.println(iterator.next());
	        }
	        
	       System.out.println("\nSondan baþa doðru yazdýralým...");
	       
	        while(iterator.hasPrevious()){
	            System.out.println(iterator.previous());
	        }
	        System.out.println(calisanlar);
		

	}

}
