package day49_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		
		// Soru 1 ) Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return 
		 // eden bir method yaziniz
		
		String input="Helloooo";
		
		Map<String,Integer> methoddanGelenMap=harfSayisiBul( input);
    System.out.println(methoddanGelenMap);

	}

	private static Map<String, Integer> harfSayisiBul(String input) {
		
		String harfler[]=input.split("");
		System.out.println(Arrays.toString(harfler));
		
		Map<String,Integer> harfSayisi=new HashMap();
		
		for (String each : harfler) {
			
			if(!harfSayisi.containsKey(each)) {
				
				harfSayisi.put(each, 1);
				
				
			}else {
				harfSayisi.put(each, harfSayisi.get(each)+1);
			}
			
		}
		return harfSayisi; 
		
		
		
	}

}
