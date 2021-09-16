package day40_exception;

public class Exception04 {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		String eMail="snm2921@gmail.com";
		mailDogrula(eMail);
		

	}

	private static void mailDogrula(String eMail) throws InvalidEmailIdCheckedException {
		
		if(eMail.contains("@hotmail") || eMail.contains("@gmail")) {
			
			System.out.println("mailiniz basariyla kaydedildi");
		}else {
			
			throw new InvalidEmailIdCheckedException("email uygun degil");
		}
				
	}

}
