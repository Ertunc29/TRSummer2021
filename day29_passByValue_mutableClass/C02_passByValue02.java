package day29_passByValue_mutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_passByValue02 {

	public static void main(String[] args) {
		
		/*
		  soru :bir list ve array olusturalim ve eleman olarak 10,11,12 ekleyelim
		  iki method olusturup list ve array'i degistirmeyi deneyelim
		  1.Method'da array'a yeni bir array assign edelim ve yeni halini yazdiralim
		  2.Method'da list'e yeni bir list assign edelim ve yeni halini yazdiralim
		  
		  -Method call'dan sonra method'da yeniden yazdirip 
		  degisip degismediklerini kontrol edelim.
		 
		 
		 */
		

		
		int arr[]= {10,11,12};
		System.out.println("ilk olusturdugumuz array : "+ Arrays.toString(arr));
		
           
		   
		
		
		arrayDegistir(arr);
		System.out.println("arrayDegistir method'u calistiktan sonra main method icinde arr : "+
		Arrays.toString(arr)); // [10, 11, 12]
		
		
		 List<Integer> sayiList=new ArrayList<>();
			
		   sayiList.add(10);
		   sayiList.add(11);
		   sayiList.add(12);
		   
		   System.out.println("ilk olusturdugumuz liste : " + sayiList);// [10, 11, 12]
		 
		   ListDegistir(sayiList);
		   
		   System.out.println("listDegistir method'u calistiktan sonra main method icinde list : "+ sayiList); // [10, 11, 12]
		
		

	}

	         private static void ListDegistir(List<Integer> sayiList) {
	        	 // bu method'da sayiList'e yenei bir deger atayalim
	        	 
	        	 sayiList=new ArrayList<>();
	        	 sayiList.add(50);
	        	 System.out.println("Method icinde degisen liste : "+ sayiList); // 50
		
		
	}

			private static void arrayDegistir(int arr[]) {
		// bu method'a yeni bir array assign edelim
	        	 
	        	 arr=new int[4];
	        	 arr[0]=15;
	        	 arr[1]=25;
	        	 arr[2]=35;
	        	 arr[3]=45;
	        	 
	        	 System.out.println("method icinde arr : "+ Arrays.toString(arr)); //[15, 25, 35, 45]
		
	}

}
