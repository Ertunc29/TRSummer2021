package day01variables;

import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Vize1 notunu giriniz");
		double vize1=scan.nextDouble();
		
		System.out.println("Vize2 notunu giriniz");
		double vize2=scan.nextDouble();
		
		System.out.println("Final notunu giriniz");
		double finalnotu=scan.nextDouble();
		
		double gecmeNotu=(vize1+vize2)/2*0.30+finalnotu*0.70;
				System.out.println("gecme notunuz :"+ gecmeNotu);
		
	}

}
