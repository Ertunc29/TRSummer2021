package day42_abstractClasses;

public class  C02_final extends C01_final {

	public static void main(String[] args) {
		
		System.out.println(C01_final.SAYI);
		
		// static bir variable okul ismi gibi herkes icin aynidir
		
		// C01_final.SAYI=20; 
		// SAYI variable'i final olarak tanimlandigi icin degistirilemez 
		
		C02_final obj1=new C02_final();
		
		obj1.deneme();

	}

	
	public void deneme() {
		
		System.out.println("child class'taki overriding method'u");
		
		
		
	}
	
	//public final void deneme2() {
	
//	}
	
	// final class yaptigimizda inherit edilemez


}
