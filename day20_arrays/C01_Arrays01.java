package day20_arrays;

import java.util.Arrays;

public class C01_Arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/
		
		/* soru 1: verilen 3 elemanli bir array'in
		  tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
		  ornek:[1,2,3] ise output [3,2,1] olacak
		  
		 */
		
		int arr[]= {1,2,3};
		
		int temp=arr[0];
		
		arr[0]=arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		
		System.out.println(Arrays.toString(arr));
		
		// array kac elemali olursa olsun tum elemanlari bir sola tasiyacak kod yaziniz
		
		int arr2[]= {1,3,9,4,6,8,10};
		
		temp=arr2[0];
		
		for(int i=0; i<arr2.length-1; i++) {
			
			arr2[i]=arr2[i+1];
			
			
			
		}
			
		arr2[arr2.length-1]=temp; 
		
		System.out.println(Arrays.toString(arr2)); // [3,9,4,6,8,8]
		
	}

}
