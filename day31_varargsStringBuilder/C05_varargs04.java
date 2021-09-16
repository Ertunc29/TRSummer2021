package day31_varargsStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class C05_varargs04 {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		;
		// toplama(list) varargs esnek oldugu icin list e benzesede list degildir
		
		int arr[]= {15,20,25};
		toplama(arr); // varargs array olarak calsiir ve argument olarak array yollanabilir
		
		// kullanicidan deger alarak varargs calistirmak istiyorsak
		// girilen degerleri bir arraya kaydetmeliyiz
		//bunun icin kullanicidan aldiginiz degerleri esnek oldugu icin bir liste koyariz
		// sonra list'i arraya ceviririz
	
		
		
	}
	
	public static void toplama( int... var) { // data turunden sonra yazdigimiz ... varargs kullandigimiz anlamindadir
		int toplam=0;
		
			for (int each : var) { // var'a git her bir int'i bana getir
				toplam+=each;
				
			}
			System.out.println(toplam);
			
		}

}
