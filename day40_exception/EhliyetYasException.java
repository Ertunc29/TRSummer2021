package day40_exception;

import java.util.Scanner;

public class EhliyetYasException {

	public static void main(String[] args) throws Throwable  {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		
		if(yas<0) {
			
			throw new EhliyetYas("gecerli bir yas giriniz");
			
		}else if (yas<18) {
			
			throw new EhliyetYas("ehliyet icin uygun degilsin");
		}
          System.out.println("ehliyet alabilirsin");
	}

}
