package day31_varargsStringBuilder;

public class C04_Varargs03 {

	public static void main(String[] args) {
		//  verilen sayilardan ilki haric tum sayilari toplayin ve
		// buldgunuz sonucu ilk sayi ile carpip yazdirin
		
		toplama(2,3);
		toplama(5,10,11);
		toplama(4,5,6,7,8);
		
			 

	}
	
	public static void toplama(int sayi, int... var) { // data turunden sonra yazdigimiz ... varargs kullandigimiz anlamindadir
	int toplam=0;
	
		for (int each : var) { // var'a git her bir int'i bana getir
			toplam+=each;
			
		}
		System.out.println(sayi*toplam);
		
	}

	

}
