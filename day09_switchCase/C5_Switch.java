package day09_switchCase;

import java.util.Scanner;

public class C5_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gun numarasi giriniz");
		int dayNo=scan.nextInt();
		
		switch (dayNo) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("thursday");
			break;
		
		case 5:
			System.out.println("friday");
			break;
				
				
		case 6:
			System.out.println("saturday");
			break;
			
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("this is not valid day");
		
		}

	}

}
