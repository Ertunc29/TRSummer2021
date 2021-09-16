package QPractice;

import java.util.Scanner;

public class QPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("a sayisini giriniz");
		int a=scan.nextInt();
		
		System.out.println("b sayisini giriniz");
		int b=scan.nextInt();
		
		System.out.println("c sayisini giriniz");
		int c=scan.nextInt();
		
		double sonuc=((a*a)-(b*b)/b*3);
		System.out.println("islemin sonucu :"+sonuc);
				

	}

}
