package day08_ternaryOperator;

import java.util.Scanner;

public class C5_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		double sayi=scan.nextDouble();
		
		System.out.println(sayi>0 ? sayi : (sayi)*-1);
		
		
		
		
		// if ile yapmak isteseydik
		
		if (sayi>0) {
			System.out.println(" sayinin mutlak degeri : "+ sayi);
			
		}else {
			System.out.println(" sayinin mutlak degeri : "+ sayi*-1);
		}

	}

}
