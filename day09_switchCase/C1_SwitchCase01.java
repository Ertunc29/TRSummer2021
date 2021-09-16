package day09_switchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gun numarasi giriniz");
		int gunNo=scan.nextInt();
		
		switch(gunNo) {
		
		case 1:
			System.out.println("Bugun pazartesi");
			break;
			
		case 2 :
			System.out.println("Bugun sali");
			break;
			
		case 3 :
			System.out.println("Bugun carsamba");
			break;
			
		case 4:
			System.out.println("bugun persembe");
			break;
			
		case 5 :
			System.out.println("bugun cuma");
			break;
		case 6:
			System.out.println("bugun cumartesi");
			break;
		
		case 7:
			System.out.println("bugun pazar");
			break;
			
		default:
			System.out.println("lutfen gecerli bir gun numarasi giriniz");
		
		}
		
			
		

	}

}
