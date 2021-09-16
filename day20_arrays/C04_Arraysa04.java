package day20_arrays;

import java.util.Arrays;

public class C04_Arraysa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// "java, candir"
		
		String str="Java, candir";
		
		str.split(str); // split methodu bize  array dondurur
		                // donen arrayi direk yazdirmaliyiz
        
		System.out.println(Arrays.toString(str.split(",")));
		
		// veya method'dan donen String barindiran bir array oldugundan
		// bir array olusturup ona assign edebiliriz
		
		String bolunmusKelimeArray[]=str.split(","); 
		System.out.println(bolunmusKelimeArray[1]); // ( )candir
		System.out.println(bolunmusKelimeArray[0]);
		
		String bolunmusKelimeArray2[]=str.split("a");
		
		System.out.println(Arrays.toString(bolunmusKelimeArray2)); // [J, v, , c, ndir]
		
		System.out.println(bolunmusKelimeArray2.length); // 4
		
		String bolunmusKelimeArray3[]=str.split(""); // Stringi karakterlere ayirir
		
		System.out.println(Arrays.toString(bolunmusKelimeArray3)); // [J, a, v, a, ,,  , c, a, n, d, i, r]
		
		String cumle ="Java ogren, rahat yasa"; // cumle kac kelimeden olusur
		String kelimeArrayi[]= cumle.split(" ");
		System.out.println("Cumledeki kelime sayisi :"+ kelimeArrayi.length);
		
		// harf sayisi 
		
		String cumle2= cumle.replaceAll("\\W", "");
	    System.out.println(cumle2);
	    System.out.println(cumle2.length()); //18
	    
	    String harfArrayi[]=cumle2.split("");
	    System.out.println(harfArrayi.length); //18
	}

}
