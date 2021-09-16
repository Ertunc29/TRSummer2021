package day40_exception;

public class Exception03 {

	public static void main(String[] args) {
		
		int arr[]= {1,4,7,8};
	
		try {
			System.out.println(arr[20]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("bu kod ne olursa olsun calissin");
		}

		System.out.println("kod bloke oldu");
		 // finally blogu try-catch blogu ile veya sadece try ile de calisabilir
	    // Finally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi
		// ongeremedigim bir exception oldugunda da calisir
	}

}
