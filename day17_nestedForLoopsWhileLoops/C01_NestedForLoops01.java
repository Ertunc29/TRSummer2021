package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C01_NestedForLoops01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
		  
		 *
		 * *
		 * * *
		 * * * *
		 
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamasyi giriniz");
		int rakam=scan.nextInt();
		
		// mesela kullanici 5 girmis olsun
		
		for(int satirNo=1; satirNo<=rakam;satirNo++) {
			
			for(int i=1;i<=satirNo;i++) {
				System.out.print("* ");
			}
			
			System.out.println("");
			
		}
		 

	}

}
