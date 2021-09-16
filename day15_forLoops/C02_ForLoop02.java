package day15_forLoops;

public class C02_ForLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10 dan 20 ye kadar olan sayilari yazdirin
		
		for(int sayi=10; sayi<=20; sayi++) {
			System.out.print(sayi+" ");
			
		}// 100 ile 200 dahil 10 ile bolunebilen sayilari yazdirin
		System.out.println("");
		for(int sayi=100; sayi<=200; sayi+=10) {
			System.out.print(sayi+" ");
			
		}//50 den 10 ye kadar 3'er 3'er geri sayarak yazdirin
		System.out.println("");
		 for( int sayi=50; sayi>=10;sayi-=3) {
			 System.out.print(sayi+" ");
			 
		 }// 50 ile 100 arasinda uc ile bolunebilen sayilari yazdirin
		  System.out.println("");
		  for(int sayi=50; sayi<=100; sayi++) {
			  if(sayi%3==0) {
				  System.out.print(sayi+" ");
			  }
			  
		  } //for(int sayi=10;sayi<20;sayi--) {
			//  System.out.print(sayi+" ");
			  // bu durumda sayi 10'dan geriye dogru saymaya baslar ve asla 20'ye ulasmaaycagindan 
			  //sonsuza gider buna sonsuz loop denir
		  //}
		  
		  for(int sayi=10; sayi<0;sayi++) {
			  System.out.print(sayi+" ");
		  }
		  System.out.println("");
		  System.out.println("son foor loop sonrasi");
		  
		  }

}
