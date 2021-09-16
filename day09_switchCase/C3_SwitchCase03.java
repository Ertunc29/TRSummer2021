package day09_switchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir gun ismi giriniz");
		String gun = scan.next().toLowerCase();
		
		switch (gun ) {
	
		case "pazartesi" :
		case "sali" :
		case "carsamba"  :
		case "persembe" :
		case "cuma"  :
			System.out.println("girdiginiz gun hafta ici");
			break;
		case "cumartesi" :
		case "pazar" :
			System.out.println("Girdiginiz gun hafta sonu");
			break;
		default :
			System.out.println("Lutfen gecerli gun ismi giriniz");
			
			
			
			
		
		
		}

	}

}
