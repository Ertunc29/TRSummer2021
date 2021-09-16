package day41_errors_GarbageCollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="";
		
	//	for (int i = 0; i < 100000; i++) {
	//		str+=i;
			
		//}
		
		// bu kod calistiginda kac obje olusur?
		//1001
		// ilk basta bir tane olusturduk
		// sonra her dongu'de str'a concenation yapilacak
		// ama String class'i immutable oldugundan her yeni degeri koymak icin
		// yeni bir String olusturulur ve eski objeden pointer silinir
		
	//	System.out.println(str);
	}    
	
	// dolaysiyla loop bittiginde bir tane pointer'in siaret ettigi obje
	// bin tane de hicbir pointerin isaret etmedigi obje heap memory'de bulunur
	
	List<Integer> list=new ArrayList<>();
	// bu satir javaya yeni bir obje olusurmasini soyluyor
	// java yeni obje icin yer var mi diye memory'i kontrol eder ve memory kritik seviyede ise 
	// Garbage Collector devreye sokuyor.
	
	
	//Garbage Collector'da finalize() methodu'nu calistirir
	// finalize methodu silinecek objeleri isaretler ve 
	// Garbage Collector finalized olan objeleri siler
	

	

}
