package day39_exception;

public class Exception05 {
	
	// null olarak tanimlanmis bir pbje iler uygun olmayan bir islem yapmaya
	// calistiginizda java NullPointerException verir.
	// Unchecked exception'dur. RTE

	public static void main(String[] args) {
		
		String str1=" ";
		String str2="";
		String str3=null; // null bir deger degildir sadece str3'un hicbirseye esit olmadigini 
		                  // soyleyen bir isaretcidir.
		
		System.out.println(str1.length()); //1
		System.out.println(str2.length()); // 0
		//System.out.println(str3.length()); // NullPointerException
		
		System.out.println(str1.concat("bos"));
		System.out.println(str3+"bos");
		System.out.println(str3.concat("bos"));
		
	}

}
