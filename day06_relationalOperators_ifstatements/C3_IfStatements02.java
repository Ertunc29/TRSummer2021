package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C3_IfStatements02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int girilenSayi=scan.nextInt();
		
		if (girilenSayi%2==0) {
			System.out.println("girdiginiz sayi cift sayidir"); 
					
			
		} 
		
		if (girilenSayi%2==1) {
			System.out.println("girdiginiz sayi tek sayidir");
		
	}    
		if (girilenSayi<0) {
			System.out.println("lutfen pozitif bir tamsayi giriniz");
		}
      	  
      	  
		}
	        
	

}
