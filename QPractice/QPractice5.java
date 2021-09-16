package QPractice;

import java.util.Scanner;

public class QPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("vize notunu giriniz");
		int vize1=scan.nextInt();
		
		System.out.println("vize2 notunu giriniz");
		int vize2=scan.nextInt();
		
		System.out.println("final notunu giriniz");
		int finalnotu=scan.nextInt();
		
		System.out.println("vize oranini giriniz");
		double vO=scan.nextDouble();
		
		System.out.println("final oranini giriniz");
		double finalO=scan.nextDouble();
		
		double ortalama=((vize1+vize2)/2*vO/100+(finalnotu*finalO/100));
		
		if(ortalama >=50) {
			System.out.println("Tebrikler dersi basari ile gectiniz :"+ ortalama);
			
		} else {
			System.out.println("Maalesef derten kaldiniz");
		}

	}

}
