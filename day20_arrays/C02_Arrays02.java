package day20_arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SSoru 2: verilen bir array'in tum elemanlarini toplayan bir program yazalim
		
		int arr[]= {2,4,6,8,10};
		
		int toplam=0;
		
		for (int i=0; i<arr.length; i++) {
			
			toplam+=arr[i];
		}
		
		System.out.println(" verilen array'daki tum elemanlarin toplami "+ toplam);

	}

}
