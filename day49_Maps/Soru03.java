package day49_Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class Soru03 {

	public HashMap hashMap;
	// veriyi sıralamak için TreeMap yapısı
	
	private TreeMap treeMap;
	
	public void startDemo() {
		
	 hashMap = new HashMap();
	 
	 hashMap.put("Key1", new Double(3434.34));
	 hashMap.put("Key2", new Integer(123));
	 hashMap.put("Key3", new String(" Ankara"));
	 hashMap.put("Key4", new Boolean(true));
	 // Sort the hash map using a tree map
	 
	 treeMap = new TreeMap(hashMap);
	 }
	public static void main(String[] args) {
		
	 Soru03 md = new Soru03();
	 
	 md.startDemo();
	 System.out.print(" HashMap : ");
	 System.out.println(md.hashMap);
	 System.out.print(" TreeMap : ");
	 System.out.println(md.treeMap);
	 }
	} 
		
		

	


