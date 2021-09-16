package day09_switchCase;

import java.util.Scanner;

public class C6_SwitchCase04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen SDET kisaltmasinda ki harflerden birisini giriniz");
		
		char harf=scan.next().toUpperCase().charAt(0);
		
		switch(harf) {
		   
		case 'S' :
			System.out.println("Software");
			break;
			
		case 'D' :
			System.out.println("Developer");
			break;
		
		case 'E' :
			System.out.println("Engineer");
			break;
			
		case 'T' :
			System.out.println("Tester");
			break;
			
			default :
				System.out.println("Lutfen gecerli bir harf giriniz");
			
		}

	}

}
