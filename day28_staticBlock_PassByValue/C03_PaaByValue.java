package day28_staticBlock_PassByValue;

public class C03_PaaByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(C01_sStaticBlocks.sayi);
		// local de static variable olusturulmaz
		
		double fiyat=100;
		
		indirimYap(fiyat); //90
		
		System.out.println(indirimYap(fiyat)); //90.0
		
		System.out.println("methodda ki fiyat :"+ fiyat); //100.0
		
		int zamYuzdesi=15;
		zamYap(zamYuzdesi);
		

	}

	private static void zamYap(int zamYuzdesi) {
		
		// javaya bir method olusturdugumuzda java bizim main method'da kullandigimiz
		// variable isminde kopya bir variable olusturur
		// bunun amaci kod takibini kolaylastirmaktir
		// bu degiskenin ismini degistirsekte kod problemsiz calisir
		
	}

	private static double indirimYap(double ucret) {
		
		ucret=ucret*90/100;
		System.out.println("methodda ki fiyat :"+ ucret); // 90
		
		return ucret;
		

	}

}
