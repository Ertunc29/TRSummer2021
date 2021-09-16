package day44_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru {
	
	static int sonuc;

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(2);
		list.add(56);
		list.add(13);
		list.add(45);
		list.add(14);
		list.add(40);
		
	
		
		ListIterator li1=list.listIterator();
		
		int count=0;
		
		while(li1.hasNext()) {
			
			sonuc= (int) li1.next();
			
			if(count<=3) {
				
				sonuc+=5;
			}
			count++;
		}
		System.out.println(sonuc);
		
		
		
	

	
	}
}
