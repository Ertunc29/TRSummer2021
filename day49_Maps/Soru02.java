package day49_Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

;

public class Soru02 {

	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		
		 hm.put("H", "Hidrojen");
		 hm.put("Li", "Lityum");
		 hm.put("Au", "Altın");
		 hm.put("Ag", "Gümüş");
		 hm.put("U", "Uranyum");
		 
		 Set set = hm.entrySet();
		 Iterator i = set.iterator();
		 
		 while (i.hasNext()) {
		 Entry me = (Map.Entry) i.next();
		 
		 System.out.println(me.getKey() + " : " + me.getValue());
		 }
		 //
		 String str = (String) hm.get("Au");
		 System.out.println(str);
		 hm.put("Au", "Radyum");
		 
		 System.out.println("Yeni değer : " + hm.get("Au"));
		 
		 
		 }
		 

	}


