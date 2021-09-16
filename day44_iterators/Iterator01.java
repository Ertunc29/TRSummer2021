package day44_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		
		// her elemana B harfini ekleyelim
		
		for (String each : list) {
			
			each+="B";
			
			System.out.print(each+ " ");
			
		}
		
		System.out.println(" ");
		System.out.println(list);
		
	    // Collections'da her yapi index'i desteklemez. ornegin Set'de index olmaz
		//index olmayinca da mecburen tum elemanlara ulasmak icin For-each loop kullanilir
		// bunun icinde java iterator class'ini olusturmustur
		
		Iterator it1=list.iterator();
		
		// next(), hasNext(); remove() methotlarina sahiptir.
		
		// Listedeki tum elemanlari Iterator kullanarak silelim
		 while(it1.hasNext()) {
			
			it1.next();
			it1.remove();
		}
		System.out.println(list);
		
		
	}

}
