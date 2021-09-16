package day28_staticBlock_PassByValue;

public class C02_StaticBlocks {

	public static void main(String[] args) {
		
		System.out.println(C01_sStaticBlocks.sayi);
		// local de static variable olusturulmaz
		
		double fiyat=100;
		
		indirimYap(fiyat); //90
		
		System.out.println(indirimYap(fiyat)); //90.0
		
		System.out.println("methodda ki fiyat :"+ fiyat); //100.0

	}

	private static double indirimYap(double ucret) {
		
		ucret=ucret*90/100;
		System.out.println("methodda ki fiyat :"+ ucret); // 90
		
		return ucret;
		
	}

}
