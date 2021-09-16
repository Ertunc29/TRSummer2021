package day38_exception;

public class Exception03 {

	public static void main(String[] args) {
		// try catch blogundaki e'nin gorevi
		
		int sayi1=10;
		int sayi2=0;
		
		Exception01 exp=new Exception01();
		//esitligin solundaki Exception01 hem class adi hemde exp icin data turu
		
		try {
		System.out.println(sayi1/sayi2);
		}catch (ArithmeticException e) {
			// ArithmeticException java'da bir class ve e objesi icin data turu
			// e ise ArithmeticException class'indan olusturdugumuz objenin adi
			// o zaman ismi e olmak zorunda degiliz ama genelde e kullanilir
			System.out.println(e); //java.lang.ArithmeticException
			// bu durumda hem java'ya sorunu yazmasi icin firsat vermis oluruz
			// hemde aplication'u bloke etmemis oluruz
			System.out.println(e.getMessage()); // / by zero
			
			e.printStackTrace(); // java.lang.ArithmeticException: / by zero
			                     //at java2021summerTr/day38_exception.Exception03.main(Exception03.java:15)

		} 
      System.out.println("kod bloke olmamisss");
	}

}
