package day10_stringManipulation;

public class C1_StringManipulation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1= "Ali Can";
		String name2= "Ali Can";
		String name3= name2 + "";
		String name4= "Ali";
		String name5="Can";
		String name6= name4+ " "+ name5;
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name2.equals(name6));
		
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name2==name6);
		
		// farkli objeler ayni degeri aldiginda java ref lere bakar
		// bu ref ler ayni ise ==true farkli ise ==false olur
		
		String name7="ALI CAN";
		String name8="ALI cAn";
		String name9="ali can";
		String name10="AliCan";
		
		System.out.println(name1.equalsIgnoreCase(name7));
		System.out.println(name1.equalsIgnoreCase(name9));
		System.out.println(name1.equalsIgnoreCase(name10));	
		
		//farkli objeler ayni degeri aldiginda java refereanslara bakar
		// bu referanslar ayni ise == true dondurur, farkli ise false dondurur
		
		//equals sadece iceriklere bakar ayni ise true farkli ise false olur
		// == ise degerlerin yaninda referanslara da bakar. 
		// degerleri karsilasrirmak ve supriz yasamamak icin equals kullanmaliyiz
		
		//equlasignoreCase : verilen iki string degiskeni buyuk kucuk harf gozetmeksizin karsilastirmak icin kullanilir
		
	    // money, MONEY, moNEy degerleri karsilastirilirsa true olur
		
		// String isim1="ALI CAN";
		// String isim2="ali can"
		// System.out.println(isim1.equalsIgnoreCase(isim2));== true olur
		
	

	}

}
