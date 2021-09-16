package day27_staticKeyWord;

public class C01 {
	
	int sayi=10;
	String str="Yasasin eclipse";
	static int sayi2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println(sayi); // sayi variable'i instance bir variable oldugu icin direk main method'da kullanilamaz
		// instance variable'lara obje uzerinden ulasabiliirm
		
		// obje olusturmak icin constructor kullanmaliyim
		// bu class'da constructor var mi ?
		
		C01 obj1=new C01(); // new'dan sonra yazilan constructor --onemli--
		
		// SAGDAKI C01: CLASS ISMI VE AYNI ZAMANDA DATA TURUDUR
		// SAGDAKI C01: class ismi ile ayni ama yaninda () oldugu icin Constructor'dir
		
		// obj1.sayi; CTE verir cunku ya atama yapmaliyiz veya yazdirmaliyiz
		
		System.out.println(obj1.sayi); // 10
		obj1.sayi=44;
		
		// System.out.println(obj1.sayi); obje urettik diye istance'a direk ulasamayiz mutlaka obje kullanmaliyiz
		
		System.out.println(obj1.sayi); //44
		
		C01 obj2=new C01();
		System.out.println(obj2.sayi); // 
		
		obj2.sayi=34;
		
		System.out.println(sayi2); // 0
		                           // java run time programdir

	}

}
