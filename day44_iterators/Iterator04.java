package day44_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {
		
        List<Integer> list=new ArrayList<>();
		
		list.add(2);
		list.add(13);
		list.add(56);
		list.add(23);
		list.add(45);
		list.add(14);
		list.add(40);
		
		System.out.println(list);
		
		ListIterator li1=list.listIterator();
		
		 while(li1.hasNext()) {
			 li1.next();
			 
	            
	        }
	 
	        System.out.println();
	        
	      //  Object obj=li1.previous();
		
		while(li1.hasPrevious()) {
			
			
            System.out.print(li1.previous()+" ");
            System.out.print(li1.nextIndex()+"-");
		}
		
		
		
	}

}
