package QPractice;

import java.util.Scanner;

public class QPractice6 {

	public static void main(String[] args) {
	
        Scanner scan=new Scanner(System.in);
		
		System.out.println("a kenarini giriniz");
		int a=scan.nextInt();
		
		System.out.println("b kenarini giriniz");
		int b=scan.nextInt();
		
		System.out.println("c kenarini giriniz");
		int c=scan.nextInt();
		
		if (a<=0 || b<=0 || c<=0) {
			System.out.println("hatali giris yaptiniz");}
		
		
		else if((a*a)+(b*b)==(c*c)) {
			System.out.println("ucgeniniz dik bir ucgendir");
		
	} else if((a*a)+(c*c)==(b*b)); {
	System.out.println("ucgeniniz dik bir ucgendir"); 
		
	}  if ((b*b)+(c*c)==(a*a)); {
		System.out.println("ucgeniniz dik bir ucgendir");
	}
	
		
		

		
	}
	
	

}
