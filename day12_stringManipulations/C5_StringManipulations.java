package day12_stringManipulations;

public class C5_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
		 String str1="$13.99"
		 String str2="$10.55"
		 ipucu : Double.parseDouble() methodunu kullanabilirsiniz
		*/
		
		String str1="$13.99";
	    String str2="$10.55";
	    
	    str1=str1.replace("$", "");
	    str2=str2.replace("$", "");
	    
	    System.out.println((str1) + (str2));// $ dan kurtulduk ama hala String oldugu icin 13.9910.55 olur
	    
	    Double sayi1=Double.parseDouble(str1);
	    Double sayi2=Double.parseDouble(str2);
	    
	    System.out.println("iki sayinin toplami : $"+ (sayi1 +sayi2));

	}

}
