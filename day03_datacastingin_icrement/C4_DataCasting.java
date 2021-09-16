package day03_datacastingin_icrement;

public class C4_DataCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double sayi1 = 2000.14;
		
		int sayi2 = (int) sayi1;
		
		System.out.println("double degisken : " + sayi1);
		
		System.out.println("int degisken :"+ sayi2);
		
		byte sayi3=(byte) sayi2;
		
		System.out.println("byte degisken :" + sayi3);
		
		int sayi4=95;
		int sayi5=5;
		
		System.out.println("bolme sonucu : "+ sayi4/sayi5);
		 
		double sayi6=2000;
		
		System.out.println("bolme sonucu : "+ sayi6/sayi5);
		
		double sayi7=15;
		
		System.out.println("bolme sonucu : "+ sayi4/sayi7);
	}

}
