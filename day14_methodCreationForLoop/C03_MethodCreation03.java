package day14_methodCreationForLoop;

import java.util.Scanner;

public class C03_MethodCreation03 {

	public static void main(String[] args) {
		
		
		/* Email kontrolu yapan bir program yazin. kullanicinin girdigi sifre
		 -@ isareti icermiyorsa gecersiz email yazdirin
		 -@gmail.com icermiyoersa "lutfen gmail adresinizi girin" yazdirin
		 -@gmail.com ile bitmiyorsa "yazimda bir sorun var, maili kontrol ediniz" yazdirin
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen email adresinizi giriniz");
		
		String email=scan.next();
		
		emailKontrolEt(email);

	}

	public static void emailKontrolEt(String email) {
		// TODO Auto-generated method stub
		
		if(!email.contains("@")) {
			System.out.println("Gecersiz email");
			
		}else if(!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresinizi girin");
			
		}else if(!email.endsWith("@gmail.com")) {
			System.out.println("yazimda bir sorun var, maili kontrol ediniz");
		}else {
			System.out.println("Emailiniz basariyla kaydedildi");
		}
	}

}
