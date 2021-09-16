package day39_exception;

public class Exception07 {

	public static void main(String[] args) {
		
		// Casting yaparken uygun olmayan islem yaaprsaniz 
		// java ClassCastException verir
		
		// Eger tamamen sayilardan olusmayan bir Stringi int'a cevirmeye calsiirsaniz
		// java NumberFormatException verir.
		
		
		int sayi=10;
		
		String str="12345";
		
		System.out.println(str+10); // 1234510
		
        int strSayi=Integer.parseInt(str); 
		
		System.out.println(strSayi+10); // 12355
		
		String str2="123a456";
		// System.out.println(Integer.parseInt(str2)); // NumberFormatException
		
		
		  Object sayi2=40;
		  String sayiStr=(String)sayi2; // ClassCastException
		                                // Explicit narrowing Casting
		
		

	}

}
