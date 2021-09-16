package day31_varargsStringBuilder;

public class C03_Varargs02 {

	public static void main(String[] args) {
		
		// istedigimiz kadar sayi girdigimizde tum sayilalri toplayan bir method yazalim
		// Var....variety cestililik args...arguments
		
		toplama(2,3);
		toplama(5,10,11);
		toplama(4,5,6,7,8);
		
			 

	}
	
	public static void toplama(int... i) { // data turunden sonra yazdigimiz ... varargs kullandigimiz anlamindadir
	int toplam=0;
	
		for (int j : i) { // var'a git her bir int'i bana getir
			toplam+=j;
			
		}
		System.out.println("toplam: "+ toplam);
		
	}
	

}
