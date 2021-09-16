package day09_switchCase;

import java.util.Scanner;

public class C2_SwitchCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		switch(sayi) {
		
		case 10:
				System.out.println("Iki basamakli en kucuk sayi");
			break;
			
		case 100:
				System.out.println("Uc basamakli en kucuk sayi");
			break;
			
		case 1000:
				System.out.println("Dort basamakli en kucuk sayi");
			break;
		default : 
		      System.out.println("Girdigin sayiyi degistir");
		      
		      scan.close();
		}

	}

}
