package QPractice;

import java.util.Scanner;

public class QPractice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayi yaziniz :");
		int sayi =scanner.nextInt();
		
		if (sayi<0) {
			sayi*=(-1);
			
		}
			
			System.out.println("sayiniz mutlak deger :"+sayi);
			

	}

}
