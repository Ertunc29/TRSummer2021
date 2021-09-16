package day40_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ece {

	public static void main(String[] args) throws ArithmeticException, FileNotFoundException {
		int sayi1=10;
		int sayi2=0;
		
		System.out.println(sayi1/sayi2);
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\java2021summerTr\\src\\day39_exception\\File");

	}

}
