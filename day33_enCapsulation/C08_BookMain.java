package day33_enCapsulation;

import java.util.Scanner;

public class C08_BookMain {
	
	

	public static void main(String[] args) {
		
		
		C07_Book kitap=new C07_Book();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("son okudugunuz kitabi giriniz");
		String kitap2=scan.nextLine();
		kitap.setBookName("calikusu");
		kitap.setAutorName(kitap2);
		
		System.out.println("1. kitabim : "+ kitap.getBookName() + "2. kitabim : "+ kitap.getAutorName());

	}

}
