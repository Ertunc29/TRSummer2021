package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception03 {

	public static void main(String[] args) {
		// icice try-catch yerine
		// bir tane try ve multiple catch blogu kullanabiliriz
		// ancak bur durumda yazdigimix exception'lar arasinda parent - child iliskisi
		// varsa once child class'i yazmaliyiz. aksi takdirde yabi once parent yazilirsa
		// child'a is kalmaz java erisilmez catch diyerek CTE verir.
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\java2021summerTr\\src\\day39_exception\\File");
			
			int k=0;
			
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
					
				}
			} catch ( FileNotFoundException e) {
				
				e.printStackTrace();
			
		} catch ( IOException e) {
			
			// e.printStackTrace(); // tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
			System.out.println(e.getMessage());
		}
       System.out.println("kod bloke olmadi");


	}

}
