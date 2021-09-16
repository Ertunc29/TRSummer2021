package day07_IfElseStatements;

import java.util.Scanner;

public class C9_NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*kullanicidan bir sifre girmesini isteyin
		 * eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin
		 * ilk harf A ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin/
		 * eger ilk harf kucuk ise "z" olup olmadiigni kontrol edin.
		 * ilk harf z ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdiirn.
		 */
		 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sifre giriniz");
		
		char sifreilkHarf = scan.next().charAt(0);
		
		if( sifreilkHarf >='a' && sifreilkHarf <='z') {
			
			if ( sifreilkHarf =='z') {
				
				System.out.println("Gecerli sifre");
				
				
		 }else {
			 System.out.println("Gecersiz sifre");
			 
		 } 
			
		}else if (sifreilkHarf >='A' && sifreilkHarf <='Z') {
			if (sifreilkHarf =='A') {
				System.out.println("Gecerli sifre");
				
			}else {
				System.out.println("Gecerisiz sifre");
				
			}
			
		}else {
			System.out.println("Sifrenin ilk karakteri harf olmali");
		}
		
		
		
	}  
}
