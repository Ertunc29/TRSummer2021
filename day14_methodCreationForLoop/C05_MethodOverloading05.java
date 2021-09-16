package day14_methodCreationForLoop;

public class C05_MethodOverloading05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java candir";
		System.out.println(str.substring(5));//candir
		System.out.println(str.substring(5,7));// ca
		
		// 
		
		String isim="Sanim";
		String soyisim="Sah";
		int sayi1=10;
		int sayi2=20;
		double sayi3=15.0;
		double sayi4=3.14;
		
		toplama(isim,soyisim);
		toplama(sayi1,sayi2);
		toplama(sayi3,sayi4);
		
		toplama(20,45.3); // biri int digeri double . double methodu zaten var dolaysiyla double daha genis oldugu icin
		                  // double methodu calsiir
		
		toplama(45.3, 20);

	}

	private static void toplama(double sayi3, double sayi4) {
		System.out.println(sayi3 + sayi4);
		
	}

	private static void toplama(int sayi1, int sayi2) {
		System.out.println(sayi1+sayi2);
		
	}

	private static void toplama(String isim, String soyisim) {
		System.out.println(isim+" " +soyisim);
		
	}
	
	private static void toplama(int sayi1, double sayi3) {
		System.out.println(sayi1+sayi3);
	}
	
	private static void toplama(double sayi1, int sayi3) {
		System.out.println(sayi1+sayi3);
	}
}
