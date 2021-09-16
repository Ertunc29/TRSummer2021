package day39_exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception04 {
	
	// eger handle edilecek exception'lar arasinda parent-child iliskisi varsa
	// bu durumda child exception icin catch blogu yazamsakta kodumuz calisisir
	// child exception'u silmenin pozitif yani tek catch blogu ile tum exceptionlar
	// handle edilebilir. negatif yani ise bir sorunla karsilastigimizda bunun dosya
	// bulunmadigi icin mi yoksa okunmadigi icin mi oldugu anlasilmaz.

	
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\java2021summerTr\\src\\day39_exception\\File");
			
			int k=0;
			
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
					fis.close();
				}
		
			
		} catch ( IOException e) {
			
			// e.printStackTrace(); // tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
			System.out.println(e.getMessage());
		}
       System.out.println("kod bloke olmadi");
       
       


	}

}
