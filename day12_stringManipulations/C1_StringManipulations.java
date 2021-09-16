package day12_stringManipulations;

public class C1_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java candir";
		
		System.out.println(str.substring(5)); // candir
		System.out.println(str.substring(10)); // r
		System.out.println(str.substring(11)); // lenght=11 hiclik cikar
		//System.out.println(str.substring(20)); // hata verir
		System.out.println(str.substring(5,8));// can
		System.out.println(str.substring(2,3));//v
		System.out.println(str.substring(5,5));// hiclik
		System.out.println(str.substring(5,11));// candir
		//System.out.println(str.substring(5,1)); // hata
		
		System.out.println(str.substring(2,3) + str.substring(7,8)); //vn
		
		String str2=" zambaklar en issiz yerlerde acar ";
		
		System.out.println(str2.trim());
 
	}

}
