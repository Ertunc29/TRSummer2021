package day07_IfElseStatements;

import java.util.Scanner;

public class C7_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen notunuzu giriniz");
		
		double not=scan.nextDouble();
		
		if(not<0 || not>100) {
			
			System.out.println("Lutfen gecerli not giriniz");
		} else if(not<50) {
			
			System.out.println("Notunuz D");
		} else if (not<=60) { 
			
			System.out.println("Notunuz C"); 
		} else if (not<=80) {
			System.out.println("Notunuz B"); 
			
		} else if(not>=80) {
			
		System.out.println("Notunuz A");
		}

	}

}
