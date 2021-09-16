package day21_mDArrays;

import java.util.Arrays;

public class C04_MDArrays04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Soru 4: asagidaki multi dimensional array'in
		 ic array'lerindeki tum elemanlarin toplamini birer birer bulan
		 ve herbir sonucu yeni bir array'in elemani yapan
		 ve yeni array'i ekrana yazdiran bir program yaziniz
		 
		 { {1,2,3}, {4,5}, {6,7} }
		 
		 ornek: { {1,2,3}, {4,5}, {6,7} }==> 1+2+3=6 4+5=9 6+7=13
		 */
		
		int arr[][]={ {1,2,3}, {4,5}, {6,7} };
		
		int toplamArray[]=new int[arr.length]; //inner array sayisina uygun bir array olusturalim
		
		for(int i=0; i<arr.length;i++) {
			
			int elementlerToplami=0;
			
			for(int j=0;j<arr[i].length;j++) {
				
				elementlerToplami+=arr[i][j];
				
				
				
			}
			
			toplamArray[i]=elementlerToplami;
			
		}
		
		System.out.println(Arrays.toString(toplamArray));

	}

}
