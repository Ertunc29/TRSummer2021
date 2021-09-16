package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEeach01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<String> list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");
		
		List<String> list2=new ArrayList<>();
		
		list2.add("Ali");
		list2.add("Kemal");
		list2.add("Hatice");
		list2.add("Fatma");
		list2.add("Omer");
		list2.add("Yusuf");
		
		// bu listeleri karsilastiralim ve ortak isimleri direk yazdiralim
		
		for (String each : list1) {
			
			if (each.length()>4) {
				System.out.println(each + " ");
			}
		}

	}

}
