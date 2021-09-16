package day14_methodCreationForLoop;

import java.util.Scanner;

public class C04_MethodCreation04 {

	public static void main(String[] args) {
		
		/* kullanicidan ismini soyismini ve bosluk birakmadan 16 hane olacak sekilde kredi kart numarasini alin
		  
		   isim ve soyisim ilk harfleri buyuk diger harfler kucuk oalcak sekilde,
		   KK numarasini ise 4 rakamlik 4 blok ve aralarinda boluk olacak sekilde duzelten 
		   2 method yazin ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun
		 
		 */
		
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Lutfen isminizi giriniz");
		
		   String musteriIsmi=scan.next();
		   
		  musteriIsmi=isimDuzelt(musteriIsmi);
		
		 System.out.println("Lutfen soyisminizi giriniz");
		 
		 String musteriSoyismi=scan.next();
		 
		 musteriSoyismi=soyisimDuzelt(musteriSoyismi);
		 
		 System.out.println("Lutfen kredi kart numaranizi \narada bosluk olmadan yaziniz");
		 String kkNo=scan.next();
		 String yeniKkNo=kkNoDuzelt(kkNo);
		 
		 System.out.println(musteriIsmi + " " + musteriSoyismi + "\n" + yeniKkNo);

	}

	   private static String kkNoDuzelt(String kkNo) {
		   
		 kkNo=kkNo.replace(" ", "");
		
		 kkNo=kkNo.substring(0,4) + " " + kkNo.substring(4,8) + " " + kkNo.substring(8,12) + " " + kkNo.substring(12);
		 
		 return kkNo;
	}

	private static String soyisimDuzelt(String musteriSoyismi) {
		   
           musteriSoyismi=musteriSoyismi.trim(); // atama yapmazsak degisiklik kalici olmaz
		   
		   musteriSoyismi=musteriSoyismi.substring(0,1).toUpperCase() + musteriSoyismi.substring(1).toLowerCase();  
		
		return musteriSoyismi;
	}

	public static String isimDuzelt(String musteriIsmi) {
		
		   // bu methodun amaci musteri ismini nasil yazarsa yazsin
		   // ilk harf buyuk digerleri kucuk harf olacak sekilde duzenlemek
		   //basta sonda bosluk birakmissa onlarida yok edelim
		   
		   musteriIsmi=musteriIsmi.trim(); // atama yapmazsak degisiklik kalici olmaz
		   
		   musteriIsmi=musteriIsmi.substring(0,1).toUpperCase() + musteriIsmi.substring(1).toLowerCase();
		   
		   // musteri isminde yaptigim degisiklikleri main methoda gonderebilmek icin
		   // return type'i void yerine variable'in data turune uygun bir sekle dondurmeliyiz
		   return musteriIsmi;
		
	}

}
