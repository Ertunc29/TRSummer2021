package day18_DoWhileLoopScope;

public class C05_Scope02 {
	
	     // 7- eger birden fazla localde (methodda) kullanacaginiz variable varsa 
	     // bunu class level da olusturmalisiniz
	     // 8- variable'nin static olup olmamasina nasil karar veririz?
	     // bu sorunun cevabi variable'in kullanilcagi locallerle ilgilidir
	     // eger kullanilacak local static ise o zaman kullanilacak variable'i static yapmak zorundayiz
	    
	     int sayiClass=10;
	     static int sayiClassStatic=10;

	public static void main(String[] args) {
		// 5-class levelde olmayan tum variable'lara local variable denir
		// 6- local variable'lar static olarak tanimlanamaz
		
		// local variable'lar deger atanamdan olusturulabilir
		// ANCAK deger atanmadan kullanilamaz
		
		int sayi;
		sayi=10;
		System.out.println(sayi);
		// System.out.println(sayiClass); kullanilamaz static olmali

	}
	
	public void method1() {
		//System.out.println(sayiMain); kullanilamaz
		
	}
	
	public static void method2() {
	   //System.out.println(sayiMain); kullanilamaz
		
	}

}
