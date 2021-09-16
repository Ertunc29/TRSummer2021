package day29_passByValue_mutableClass;

public class C03_ImmutableClasses01 {

	public static void main(String[] args) {
		
		int sayi=0; // obje olusturduk
		
		for(int i=0; i<1000;i++) { // obje olusturduk burda da
			i++;
		}
		
		// bu kodu calistirdigimizda 13. satira kadar java kac obje uretir?
		// bu soruyu cevaplamak icin degiskenin data turune bakmaliyiz
		// sayi'nin veri turu : int
		// int mutable 
		
		String str="A"; // obje olusturma var
		
		for(int i=0;i<1000;i++ ) { // obje olusturma var
			str+=" ";
			
			
		}
		 /*
		  20.satir ile 24. satir arasinda kac obje olusur?
		  i int oldugu icin sadece 1 tane variable olusturulur.
		  str String oldugundan 1001 obje olsuturulur.
		  */
	}

}
