package day33_Encapsulations;

public class C02_Encapsulations {
	
	// okul isminin baska clas''lardan okunmasini ama deger atanmamasini istiyorsak
	// getter() methodu'nu kullaniriz.
	
	private String okulIsmi="yildiz koleji";
	private String tcNo="01234567890";
	private int hesapNo=5554321;
	public int sayi=100;
	
	// obje olusturup deger atanip kullanmasini istedigimiz ama 
	// ilk atadigimiz degerin gorunmemesini istiyorsak setter() methodu'nu kullaniriz	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//eger ulasmak istedigim class uyehleri public degilse baska
		// package'larden ulasmak icin extra islem yapmam gerekir
		
		// yapabilecegimiz islermlerden birincisi  encapsulation(sata saklama)
		// bu class'dan kimseyle paylasmak istemedigimiz variable ve methodlar olusturalim
			
		// private yapinca guvenligi sagladik
		// ancak class uyelerinin private olmasi OOP'e aykiri
		
		// Encapsulation class'imizda olsuturdugumuz class uyelerine
		// kimlerin ne oranda ulasabilecegini belirlemek icin yapilir
		

	}
	    private void denemeMethod() {
		
		System.out.println("deneme method'u calisti");
		
	}
		public String getOkulIsmi() {
			return okulIsmi;
		}
		public void setTcNo(String tcNo) {
			this.tcNo = tcNo;
		}
		public void setHesapNo(int hesapNo) {
			this.hesapNo = hesapNo;
		}
		

}
