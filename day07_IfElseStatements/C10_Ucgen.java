package day07_IfElseStatements;

import java.util.Scanner;

public class C10_Ucgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Girdiginiz ucgen esitkenar ucgendir");
			
		} else {
			System.out.println("Girdiginiz ucgen esitkenar ucgen degildir");
		}

	}

}
