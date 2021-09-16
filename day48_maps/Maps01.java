package day48_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {

	public static void main(String[] args) {
		
		
		Map<Integer,String> map1=new HashMap<>();
		Map<Integer,String> map2=new HashMap<>();
		
		map1.put(101, "Ali, Can, java");
	    map1.put(102, "Veli, Yan, java");
	    map1.put(103, "Ali, Can, C#");
	    
	    System.out.println(map1); // {101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Can, java}
			
	    
	    map2.put(202, "Vefa, Bas, java");
	    map2.put(203, "Falih, Kan, SQL");
	    
	    System.out.println(map2);
	    
	    map1.putAll(map2);
	    System.out.println(map1);
	    
	    map2.put(104, "Omer, Ari, SQL");
	    map1.putAll(map2);
	    System.out.println(map1); // {101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Can, C#, 104=Omer, Ari, SQL, 202=Vefa, Bas, java, 203=Falih, Kan, SQL}
	    
	    
	    map1.putIfAbsent(102, "Esra, Coskun, Lamda"); // eleman yoksa ekle aynisi varsa ekleme
	    System.out.println(map1); 
	    
	    map1.putIfAbsent(100, "Esra, Coskun, Lamda"); 
	    System.out.println(map1); // {100=Esra, Coskun, Lamda, 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Can, C#, 104=Omer, Ari, SQL, 202=Vefa, Bas, java, 203=Falih, Kan, SQL}
 
	    System.out.println(map1.containsKey(101)); //true
	    System.out.println(map1.containsValue("java")); // false
	    System.out.println(map1.containsValue("Esra, Coskun, Lamda")); // true
	}

}
