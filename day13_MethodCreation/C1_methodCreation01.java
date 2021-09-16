package day13_MethodCreation;

public class C1_methodCreation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// bir methodu olusturmak o methodu calistirmak icin yeterli degildir
		//eger bir methodu calistimak isterseniz methodu  cagirmalisiniz
		
		toplama(20,30); // 50
		
		//sadece method call yapildiginda method calisir
		//eger method icinde bir sey yazdiriyorsak consol de o yaziyi goruruz
		//ancak methodumuz return veya type a sahipse bize bir sonuc return edecektir
		// bu sonucu ya direk yazdiririz
		
		System.out.println(toplama(10,30)); // 40 
		
		// veya donen sonucu bir variable a atayabiliriz.
		
		
		int sonuc=toplama(10,30);// sonuc=40;
		
		System.out.println(sonuc);

	}
	
	public static int toplama(int sayi1, int sayi2) {
		
		
		System.out.println("method calisti");
		return sayi1+sayi2;
	}

}
