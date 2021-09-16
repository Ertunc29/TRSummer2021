package day40_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\java2021summerTr\\src\\day39_exception\\File");
		
		// try -catch blogu exception ile handle etmekte kullanilir
		// throws keyword'u ise sadece declarationdur ----------interwiew
		// dolaysiyla throws kullanilan bir method'da exception olusursa kod bloke olur
		
		int k=0;
		
			while((k=fis.read())!=-1) {
				System.out.print((char)k);
				
			}
	   // eger birden fazla exception icin throws keyword'u kullanacaksak 
			// yazacagimizi exceptionlarib arasindaki iliski ve siralama onemli olur
			// eger yazdigimiz exceptionlar arasinda parent child iliskisi varsa 
			// once child exception yazilmalidir, aksi takdirde child exceptipn ersilemez olur
			// istersek sadece parent yazmakta yeterli olur
			
			

	}

}
