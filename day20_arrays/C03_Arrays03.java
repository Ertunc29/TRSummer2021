package day20_arrays;

import java.util.Arrays;

public class C03_Arrays03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// verilen bir array'i buuykten kucuge siralayiniz
		
		int arr[]= {3,15,10,11,9};
		
		arr=arraySirala(arr);
		
		System.out.println("siralanmis hali :"+ Arrays.toString(arr));
		
	//	System.out.println(Arrays.toString(arrayiTerstenSirala(arr))); sonucu yazdirmak icin 
		
		arr=arrayiTerstenSirala(arr);
		System.out.println("tersten siralanmis hali :"+ Arrays.toString(arr));
	
	}

	private static int[] arrayiTerstenSirala(int[] arr) { 
		
		int[] temp=new int[arr.length]; // eski array'le ayni uzunlukta bir array olusturdum
		
		for (int i=0; i<temp.length; i++) {
			temp[i]=arr[arr.length-1-i];
			
			
			
		}
		// temp array'i istedigim gibi arr'in ters siralanisi oldu
		// bunu main methoda'a dondurmem (return) lazim
		
		return temp;
		
	}

	private static int[] arraySirala(int[] arr) {
		
		
		// oncelikle array'i kucukten buyuge siralamaliyiz
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		return arr;
		
	}

}
