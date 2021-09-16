package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	public static void main(String[] args) {
		
		/*
		 eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum olusuyorsa
		 icice try-catch bloklari olusturabiliriz
		 bu ornekte once dosyayi okutmak istedik. java "ya dosyayi bulamazsam" diye bizden yardim istedi
		 bizde try-catch blogu ile FileNotFoundException handle etmesine yardimci olduk
		 sonra dosyadaki yazilari okumaya calistik ve java yeniden " ya dosyayi okuyamazsam"
		 diye yardim istedi. bizde try-catch blogu ile IOException ile handle etmesini sagladik
		 */
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\java2021summerTr\\src\\day39_exception\\File");
			
			int k=0;
			try {
				while((k=fis.read())!=-1) { // read 
					System.out.print((char)k);
					
				}
			} catch (IOException e) {// dosyalarla ilgili genel yazma ve okuma sorunlarini handle eder
				                     // FileNotFoundException IS-A IOException
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			// e.printStackTrace(); // tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
			System.out.println(e.getMessage());
		}
       System.out.println("kod bloke olmadi");

	}

}
