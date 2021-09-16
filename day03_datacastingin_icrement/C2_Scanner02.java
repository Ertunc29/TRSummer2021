package day03_datacastingin_icrement;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		System.out.println("girdiginiz kelimenin ilk harfi : " + ilkHarf);
		
		scan.close();
	}

}
