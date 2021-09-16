package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet01 {

	public static void main(String[] args) {
		// Verilen bir Array'deki tekrarli elemanlari silip
		// uninque elemanlardan olusan bir Array'e cevirem bir method yazin
		
		int arr[]= {2,3,4,3,5,3,6,4,7,4,8,5};
		
		int tekrarsizArray[]=tekrarlariSil(arr);
		
		System.out.println(Arrays.toString(tekrarsizArray));

	}

	private static int[] tekrarlariSil(int[] arr) {
		
		Set<Integer> set1=new HashSet<>();
		
		for (Integer each : arr) {
			 
			set1.add(each);
			
		}
		System.out.println(set1); // [2, 3, 4, 5, 6, 7, 8]
		int tekarsizArray []=new int[set1.size()];
		
		int index=0;
		for (int each : set1) {
			
			tekarsizArray[index]=each;
			index++;
			
		}
		return tekarsizArray;
		
		
		
	}

}
