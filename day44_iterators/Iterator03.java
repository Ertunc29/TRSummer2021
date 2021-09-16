package day44_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(2);
		list.add(13);
		list.add(56);
		list.add(23);
		list.add(45);
		list.add(14);
		list.add(40);
		
		ListIterator li1=list.listIterator();
		
		while(li1.hasNext()) {
			
			
			
			int temp=(int)li1.next();
			
			if(temp<20 || temp>40) {
				
				li1.remove();
			}
		}
		
		System.out.println(list);
	}

}
