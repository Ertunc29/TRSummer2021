package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// javayla bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde
		// javaya " ya dosyayi bulamazsam " der ve bizden cozum uretmemizi bekler
		// dosya bulma ile ilgili exception turu : FileNotFoundException
		// java kodu yazar yazmaz burada ki olasi problemi gorur ve CTE verir
		// kodumuzu yazdigimiz anda ortaya cikan bu tur exception'lara Checked Exception diyoruz
		
		try {
			
			FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\java2021summerTr\\src1\\day39_exception\\File");
		} catch (FileNotFoundException e) {
			
			// e.printStackTrace(); // tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
			System.out.println(e.getMessage());
		}
       System.out.println("kod bloke olmadi");
       
       
	}

}
