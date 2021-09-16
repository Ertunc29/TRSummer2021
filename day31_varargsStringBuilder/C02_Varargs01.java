package day31_varargsStringBuilder;

public class C02_Varargs01 {

	public static void main(String[] args) {
		
		
		// verilen iki sayiyi toplayan ve sonucu yazdiran bir method yaziniz
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		
		toplama(sayi1,sayi2);
		toplama(sayi1,sayi2,sayi3);
		
		// oyle bir method yazalim ki icine kac method yazarsak yazalim toplasin
		toplama(2,3); // iki sayinin toplami methodu calisir
		toplama(2,3,5); // uc sayinin toplami ,ethodu calisir
		
		// istedigimiz kadar sayiyi yazabilecegimiz methodu olusturabilmesi icin java varargs olusturmus.

	}

	private static void toplama(int sayi1, int sayi2, int sayi3) {
		
		System.out.println("uc sayinin tpplami :" + (sayi1+sayi2+sayi3));
		
	}

	private static void toplama(int sayi1, int sayi2) {
		
		System.out.println("iki sayinin tpplami :" + (sayi1+sayi2));
		
	}

}
