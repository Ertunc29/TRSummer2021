package day29_passByValue_mutableClass;

public class C04_ImmutableClasses02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A="Ali";
		String B="Ali";
		String C= B+"";
		String D=C;
		
		
		// equals methodu sadece icerige bakar icerik hepsinde Ali oldugundan
		// equals iki satirda da true doner
		
		System.out.println(A.equals(C)); // true
		System.out.println(A.equals(B)); // true
		System.out.println(D.equals(C));// true
		
		// == hem icerige hem referansa bakar dolaysiyla A==C falde verir
		// A ve B objesi farkli objeler oldugu halde nicin true doner?
		
		System.out.println(A==C);// FALSE
		System.out.println(A==B); // true
		System.out.println(D==C);// true
		
		String E=new String("Ali");
		// STRING non-primitive oldugundan new kelimesini kullanmamiz gerekir
		// ama string cok kullanildigi icin String'e ozel olarak new kelimesi kullanilmadan da
		// yeni String olusturabiliriz. String isim="Ali"; gibi
		System.out.println("new ile olusturdugum E degiskeni : "+ E);
		String F=new String("Ali");
		
		System.out.println(E.equals(F));// TRUE
		System.out.println(E==F); // false

	}

}
