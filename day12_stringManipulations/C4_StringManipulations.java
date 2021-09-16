package day12_stringManipulations;

import java.util.Scanner;

public class C4_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 harfli bir kelime giriniz");
		String kelime=scan.next();
		
		if (kelime.length()!=4) {
			System.out.println("Lutfen 4 harfli bir kelime giriniz");
			
			
		}else {
			System.out.println(kelime.substring(3,4) + kelime.substring(2,3) + kelime.substring(1,2) + kelime.substring(0,1));
		}

	}

}
