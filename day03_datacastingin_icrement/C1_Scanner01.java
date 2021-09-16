package day03_datacastingin_icrement;

import java.util.Scanner;

class C1_Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi ve soyisminizi yaziniz, \nisminizi yazdiktan sonra ENTER'a basiniz");
		
		String name=scan.nextLine();
		String surname=scan.nextLine();
		
		System.out.println("Isminiz : "+ name +"\nSoyisminiz : "+ surname + "\nKursumuza katiliminiz alinmistir, tesekkur ederiz");
		
		scan.close();

	}

}
