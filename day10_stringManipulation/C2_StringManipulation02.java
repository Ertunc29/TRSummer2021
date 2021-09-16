package day10_stringManipulation;

public class C2_StringManipulation02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String str1="Java guzeldir";
				
				System.out.println(str1.length());//13
				
				
				String str2=""; // isime hic degerini atar yani bos
				
				System.out.println(str2.length()); // 0
				
				 str2 = null; // null yazdiginda ise atama yoktur. isim.in hicbir degeri yok
				
				// null==keyword
				// null== null pointer
				
				System.out.println(" " + 10);// bosluk10 olur
				System.out.println(' ' + 10); // 42 olur space==32 aski degeri
				
				//str'in uzunlugu 13
				// str in son harfinin indexi 12
				
				String str3="as;mda;smf;amf;almf;asldpenfwnmg;wm;sa,f'wlmef[lwempgvnwe;mvw[lemvkwemgwm";
				
				System.out.println(str3.length());
				
				// str3'un son harfinin index'i==> str3.lenght()-1
				
				// lenght() : verilen String deki karakter sayisini verir
				// String isim= "Ali Can";
				//  System.out.println(isim.lenght());==karakter sayisi 7. boslukta karakter sayilir
	}

}
