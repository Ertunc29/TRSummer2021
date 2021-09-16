package day11_stringManipulations;

public class C04_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// endsWith : verilen Stringin istenen karakter ile bitip bitmedigini kontrol eder.
		// istenen karakter ile bitiyorsa True bitmiyorsa False olur
		// parametre String olmali
		
		// starstWith : verilen Stringin istenen karakter ile baslayip baslamadigini kontrol eder.
		// istenen karakter ile basliyorsa True baslamiyorsa False olur
		// parametse String veya kelime olabilir
		
		
		//isEmpty : verilen Stringin uzunlugu 0 ise True, icermiyorsa False olur
		// str=null durumlarinda java hata verir. cunku atama yok
		
		//replace() : verilen Stringdeki istenen karakteri istenen yeni karkater ile yer degistirir
		// replace methodu char icinde kullanilabilir
		
		//replaceAll :  verilen Stringdeki istenen karakterleri istenen yeni karkaterler ile yer degistirir
		// replace() arasinda ki farklar, 
		//            -   replaceAll de char kullanilamaz
		//            -   replaceAll methodunda Regular Expressions kullanilabilir
		//         \\s :sapcae yaparsaniz cumledeki butun space lerin yerine istenen islemi yapabilirsiniz
		//            \\s : sadece space
		//            \\S : space olmayan hersey
		//            \\w : harfler ve rakamlar
		//            \\W : harf ve rakamlar disindaki hersey
		//            \\d : digit(rakam) in hepsi
		//            \\D : digit disindaki hersey
		
		//replaceFirst : verilen Stringde ki istenen karakterlerin ilkini, istenen yeni karakterler ile degistirir
		
		// substring() : index kullanilarak verilen String in istenen parcasini almamizi saglar 
		//         - parametre olarak 1 sayi girilirse. girilen index den sonra String in sonuna kadar bolumu
		//         - parametre olarak iki sayi girilirse girilen 1.sayidaki indexden baslayip 2. sayiya kadar karakteri bize dondurur
		//         - karakter sayisini veren sayi giriirse birsey yazdirmaz
		//         - uzunluktan fazlasi girilirse hata verir
		
		// trim : istedigimiz Stringin basinda veya sonunda var olan bosluklari temizler
		
		        String kkNo="12345 4532 7686 3550";
				String isim="sanim sah29";
				System.out.println(kkNo.replace(" ", ""));
				System.out.println(kkNo); // 12345 4532 7686 3550 yoksa 12345453276863550
				
				// replaceAll ile
				
				System.out.println(kkNo.replaceAll("\\s", "")); // s sadece space
				System.out.println(kkNo.replaceAll("\\S", "*")); // S space olmayan hersey
				System.out.println(kkNo.replaceAll("\\w", "&")); // harf veya rakamlarin hepsi
				System.out.println(kkNo.replaceAll("\\W", "-")); // harf veya rakamlarin disindaki hersey
				System.out.println(kkNo.replaceAll("\\d", "0")); // rakamlarin hepsi
				System.out.println(kkNo.replaceAll("\\D", "a")); // rakamlarin disindaki hersey
				
				
				System.out.println(isim.replaceAll("\\s", "")); // s sadece space
				System.out.println(isim.replaceAll("\\S", "*")); // S space olmayan hersey
				System.out.println(isim.replaceAll("\\w", "&")); // harf veya rakamlarin hepsi
				System.out.println(isim.replaceAll("\\W", "-")); // harf veya rakamlarin disindaki hersey
				System.out.println(isim.replaceAll("\\d", "0")); // rakamlarin hepsi
				System.out.println(isim.replaceAll("\\D", "a")); // rakamlarin disindaki hersey
				
				//syso icinde yapilan Manipulationlar asil Stringi degistirmez
				
				
				
				
		

	}

}
