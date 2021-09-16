package day19_arrays;

import java.util.Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[5];
		
		System.out.println(Arrays.toString(arr)); // [0,0,0,0,0]
		
		// bir kez olusturudugum index sonradan degistirebilir miyim
		// [0,0,0,0,0,5]
		
		//arr[5]=5;
		
		// array'in length'i sonradan degistirilemez
		// array'i kullanissiz yapan da bu ozelligidir
		
		arr[2]=1;
		System.out.println(Arrays.toString(arr)); // [0,0,1,0,0]
		
		arr=new int[6];
		System.out.println(Arrays.toString(arr)); // [0,0,0,0,0]
		
		// ARRAY'in length'i degistirilemez
		

	}

}
