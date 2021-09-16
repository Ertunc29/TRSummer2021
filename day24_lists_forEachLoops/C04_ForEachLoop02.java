package day24_lists_forEachLoops;

public class C04_ForEachLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru : bir Integer Array olusturun ve bu array'deki sayilarin carpimini
		// for each loop kullanarak yazdiriniz.
		
		int arr[]= {2,4,5,7,8,1,23};
		int carpim=1;
		for (Integer each : arr) {
			
			carpim*=each;
			
		}
		System.out.println("array'in elamanlarinin carpimi :"+ carpim);
		
		int count=1;
		carpim=1;

		for (Integer each : arr) {
			
			carpim*=each;
			count++;
			
			System.out.println(count + " adimdaki carpim :"+ carpim);
		}
	}

}
