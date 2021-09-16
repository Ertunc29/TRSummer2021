package day15_forLoops;

import java.util.Scanner;

public class C08_ForLoop08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//soru 8: kullanicidan bir string isteyin ve stringi terse ceviren bir program yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir String yaziniz");
		String kelime=scan.nextLine();
		String terstenKelime=scan.nextLine();
		
		for(int i=kelime.length()-1; i>=0;i--) {
			terstenKelime+=kelime.substring(i,i+1);
			
			
		} System.out.println(terstenKelime);

	}

}
