package day42_abstractClasses;

public class C01_final {
	
	static final int SAYI=10;
	
	// instance bir variable'i final ve static yaparsaniz java onu bold yapar
	// bizde ismi BUYUK harfle yazariz
	
	String isim;
	
	// instance variable\lara ilk deger atamasi yapmak zorunda degiliz
	// deger atamadigimizda Java data turune gore default deger atar
	
	// final String soyisim;
	
	// final variable'larin degeri degistirelemeyecegi icin 
	// ilk atama yapilmadan olusturulmasina Java izin vermez

	public static void main(String[] args) {
		
		System.out.println(SAYI);
		
		System.out.println(Integer.MAX_VALUE);
		
		}
	
	public void deneme() {
		
		System.out.println("deneme yapiyorum");
		
	}
	public final void deneme2() {
		System.out.println("deneme yapiyoruz");
	}


}
