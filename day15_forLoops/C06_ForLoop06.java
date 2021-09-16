package day15_forLoops;

import java.util.Scanner;

public class C06_ForLoop06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan 100'den kucuk bir tmasayi isteyin. 1'den girilen sayiya kadar tum sayilari yazdirin. ancak,
		// -sayi 3'un kati ise sayi yerine "Java" 
		// -sayi 5'in kati ise "Guzeldir"
		// -sayi hem 3'un hem 5'in kati ise "Java Guzeldir" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Luyfen 100'den kucuk bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		for(int i=1; i<=sayi; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.print("Java Guzeldir");
				
			}else if(i%3==0) {
				System.out.print("Java");
				
			}else if(i%5==0) {
				System.out.print("Guzeldir");
				
			}else {
				System.out.print(i+" ");
			}
		}

	}

}
