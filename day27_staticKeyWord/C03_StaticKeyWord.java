package day27_staticKeyWord;

public class C03_StaticKeyWord {
	
	static int sayi=15;
	String str="java";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* bir method variable'i static yapmanin avantaji: 
		   
		   Static variable ve method'lara ulasmak istedigimixde classIsmi.methodIsmi yazmamiz yeterli olur
		   
		    Ornegin array'lerde kullandigimiz Arrays class'i altindaki toString() methodu static
		    olarak java developerler tarafindan hazirlanmis oldugu icin Arrays.toString() yazarak methodu rahatlikla kullanabiliriz
		    
		    ancak variable static yapmak biraz riskli. mesela bir okul uygulamasinda ikul ismini static variable olarak
		    olusturursak avantaj olarak heryerden rahatlikla okul ismine ulsabiliriz
		    
		    ama ogrenci objelerinden veya ogretmen objelerinden biri uzerinden okul adi degistirilise
		    tum ogrenciler ve tum ogretmenler icin okul adi kalici olarak degismis olur ve bu da
		    bir uygulama icin istenmeyen bir durumdur.
		 */
		
		sayi=20;
		// str="static olan main method'dan instance variable'a direk ulasamazsin";
		
		staticMethod();
		// staticOlmayanMethod(); main method static oldugu icin staticOlmayanMethod'u cagiramayiz
		
		System.out.println(C01.sayi2); //0
		
		// java run time bir programdir.
		// hangi class'ta run tusuna basarsaniz o class calisir.
	
	}
	
	public static void staticMethod() {
		System.out.println("static variablelar gokteki ay gibidir");
		
		sayi=30;
		// str="static olmayan variable'a ulasabilirim"; ulasilamaz
	}
    public void staticOlmayanMethod() {
    	System.out.println("static olmayan method calisti");
    	
    	staticMethod(); // static method'lar heryerden cagrilabilir
    	sayi=25; // static variable'lara heryerden ulasilabilir ve deger atanabilir
    	str="static olmayan variable'a ulasabilirim";
    	
		
    }
}
