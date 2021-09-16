package day07_IfElseStatements;

import java.util.Scanner;

public class C1_IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*kullanicidan gu ismini alin ve 
		 * hafta ici veya hafta sonu oldugunu yazdirin
		 * String icin equalsa methodunu kullanin
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen gun ismini giriniz");
		
		String gunIsmi=scan.next().toLowerCase();
		
		//flag kullanimi
		int flag=0;
		
		if(gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe")
				|| gunIsmi.equals("cuma")) {
			
			System.out.println("giridigniz gun hafta ici");
			flag++;
			
		} if(gunIsmi.equals("cumartes") || gunIsmi.equals("pazar")) {
			System.out.println("girdiginiz gun hafta sonu");
			flag++;
			
		} //pazar==>flag=1 2/if body si caliscak
		  // carsamba==>flag=1 1/if body si calisacak
		  // pezer==>flag=0 
		
		if(flag==0) {
			System.out.println("Lutfen gecerli bir gun ismi yaziniz");
		}
					
		
		
		

	}

}
