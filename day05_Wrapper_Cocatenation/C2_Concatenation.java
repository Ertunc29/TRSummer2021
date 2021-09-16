package day05_Wrapper_Cocatenation;

public class C2_Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Hello";
		String str2="World";
		
		int sayi1=3;
		int sayi2=4;
		
		System.out.println(str1+(sayi2-sayi1));
		System.out.println(str1+" "+ 5*(sayi2-sayi1));
		
		System.out.println(str1+" "+sayi1+sayi2);
		
	    System.out.println(sayi1+sayi2 + " " + str2); //7World
	    
	    System.out.println(sayi1+sayi2); // == data turu int
	    
	    System.out.println(sayi1+""+sayi2); // data turu string
	    
	    // bosluksuz tirnak sayiyi yanyana yazidirir. 
	    
	    String intdanCevrilen=""+sayi1; // bu yontem method kullanmadan int Stringe cevirir
	    
	    
	}

}
