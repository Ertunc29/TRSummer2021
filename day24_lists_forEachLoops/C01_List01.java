package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* kullanicidan isimler isteyin ve bunlari bir list'te depolayin
		 kullanici "yeter" yazincaya kadar isim istemeye devam edin
		 kullanici iism girmeyi bitirdiginde toplam kac isim girdigini 
		 ve bunlardan kac tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
		 
		  isimList=Ali, Veli, Ayse, Fatma, Zeki, Kemal
		  
		 */
		
		Scanner scan=new Scanner(System.in);
		List<String> girilenIsimler=new ArrayList<>();
		String isim;
		
		
		do {
			
			System.out.println("Lutfen listeye eklemek icin isim giriniz \nBitirmek icin yeter yaziniz");
			
			isim=scan.nextLine();
			
			if(!isim.equalsIgnoreCase("yeter")) { // yeter degilse ismi ekledim
				
				girilenIsimler.add(isim);
				
			}
			
			
			
		
			
		}while(!isim.equalsIgnoreCase("yeter")); // kullanici yeter demedigi surece tekrar ettim
		
		System.out.println(girilenIsimler);
		
		// karsilastirmak istedigimiz listeyi olusturalim
		//listenin uzunlugu degismeyecegi icin array olusturup, liste'e cevirebiliriz
		// boylece 6 ismi tek tek eklemek zorunda kalmayiz
		
		String isimler[]= {"Ali", "Veli", "Ayse", "Fatma", " Zeki", "Kemal"};
		List<String> isimList=Arrays.asList(isimler);
		
		// elimizde iki liste var 
		// 1-kullanicidan aldigimiz isimlerim oldugu girilenIsimler
		// 2-karsilastiracagimiz liste isimList
		
		System.out.println("Toplam : " + girilenIsimler.size() + " isim girdiniz");
		int count=0;
		
		for (int i=0; i<girilenIsimler.size();i++) {
			
			if (isimList.contains(girilenIsimler.get(i))) {
				count++;
			}
		}
		
		System.out.println("girdiginiz isimlerden :"+ count + " tanesi bendeki listede kayitli");

	}

}
