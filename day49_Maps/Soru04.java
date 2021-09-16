package day49_Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Soru04 {

	public static void main(String[] args) {
		
		
		Map<Integer, Character> m = new HashMap<Integer, Character>();
		
		 for (int i = 65; i <=80;i++) {
			 
		 m.put(i, (char) i);
		 
		 
		 
		 }
		// System.out.println(m);
		 
          Set<Integer> ks = m.keySet();
		 
		 Iterator<Integer> i = ks.iterator();
		 
		 while (i.hasNext()) {
			 
		 Integer key = i.next();
		 System.out.print(key + " ");
		 System.out.println(m.get(key));
		 } 

	}

}
