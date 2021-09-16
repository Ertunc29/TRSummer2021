package day49_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Soru01 {

	public static void main(String[] args) {
		
		
		
		    HashMap<String,String> cityState = new HashMap<>();
		    
		    cityState.put("Bangalore", "Karnataka");
		    cityState.put("Chennai", "TamilNadu");
		    cityState.put("Madurai", "TamilNadu");
		    cityState.put("Mumbai", "Maharashtra");
		    
		    System.out.println(cityState);
		    System.out.println();
		    
		    System.out.println("Size  : " + cityState.size());
		    
		    for(Map.Entry<String, String> m : cityState.entrySet())
		    {
		      System.out.println(m.getKey() + " : " + m.getValue());
		      
		      
		    

		  }

		}

	}


