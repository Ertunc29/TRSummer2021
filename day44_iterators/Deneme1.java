package day44_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Deneme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Iterator it1=list.iterator();
		
		for (int i = 0; i < list.size()+3; i++) {
			
			it1.next();
			it1.remove();
			
		}
		System.out.println(list);

	}

}
