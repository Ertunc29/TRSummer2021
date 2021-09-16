package day07_IfElseStatements;

import java.util.Scanner;

public class C4_IfElse03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullaniciya yasini sorun
		// eger yas 65 e esit ve buyukse emekli olabilir
		// eger 65 ten kucukse emekli olamazsin yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas= scan.nextInt();
		
		if(yas<=65) {
			
			System.out.println("Emekli olamazsin, calismalisin");
		} else { 
			
			System.out.println("Eemekli oalbilirsin");
		}

	}

}
