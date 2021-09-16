package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C4_IfStatements03 {

	public static void main(String[] args) {
		
		
		/* 
		 kullanicidan gun iismlerinden birinin ilk harfini isteyin 
		 ve o harf ile baslayan gun isimlerini yazdrin
		 ornek: ilkHarf=P output ="Pazar, Persembe veya Pazartesi" 
		 buyuk kucuk harf problemi olmamasi icin toUpperCase kullanin
		 */

	
	
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen istediginiz bir gun isminin ilk harfini giriniz");
	        
	        char harf=scan.next().toLowerCase().charAt(0);
	        
	        if(harf=='p') {
	        	System.out.println("pazartesi,persembe veya pazar");
	        	
	        } if(harf=='s') {
	        	System.out.println("sali");
	        	
	        } if(harf=='c') {
	        	System.out.println("carsamba,cuma veya cumartesi");
	        	
	        } 
	        	if(harf!='c' && harf!='p' && harf!='s') {
	        		System.out.println("Lutfen gecerli bir harf giriniz");
	        	}
	        	
	 
	
	}
}
