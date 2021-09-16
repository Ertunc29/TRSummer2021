package day05_Wrapper_Cocatenation;

public class C3_Concatenation02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi=7;
		char ilkHarf='a'; // 97
		String str="Java";
		
		System.out.println(sayi+str+ilkHarf); //7Javaa
		System.out.println(sayi+ilkHarf+str); // 7aJava || 104Java
		
		System.out.println(sayi+""+ilkHarf);// yanyana yazmak icin en az bir String olmali
		                                    // eger Char varsa aski degerini bulur onu yazdirir
		
		System.out.println(ilkHarf);
		
		

	}

}
