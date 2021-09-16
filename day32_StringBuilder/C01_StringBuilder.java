package day32_StringBuilder;

public class C01_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1= new StringBuilder("Rumeysa");
		System.out.println(sb1); // Rumeysa
		
		sb1.append(" ").append("cetinturk"); // baska bir String'in istedgimiz bolumunu SB nin sonuna ekler
		System.out.println(sb1); // Rumeysa cetinturk
		
		String cumle="javayi cok sever";
		sb1.append(cumle, 6, 9);
		System.out.println(sb1);  // Rumeysa cetinturk co
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity()); // 7+16=23
		
		sb1.charAt(1); 
		System.out.println(sb1.charAt(1)); // u
		
		sb1.charAt(5); // bize bilgi getiren methodlar StringBuilder'i degistirmez
		System.out.println(sb1); // degismez Rumeysa cetinturk c
		
		sb1.delete(17, 21); // istenilen karakterleri siler
		System.out.println(sb1); // Rumeysa cetinturk
		
		String isim="Rumeysa Cetintur";
		sb1.equals(isim);
		System.out.println(sb1.equals(isim)); // data turleri farkli oldugu icin icerigin kiyaslanmasi mumkun degil
		
		StringBuilder sb2=new StringBuilder("Rumeysa Cetintur");
		System.out.println(sb1==sb2); // false SB'de equals methodu String'den farkli calisir 
		                              // ancak ayni obje ile kiyaslandiginda true
		                              // String'deki == gibi calisir
		                              // true
		
	
		System.out.println(sb1.indexOf("cetin"));// 8 SB'de arama yapar
		System.out.println(sb1.indexOf("e", 6)); // 9 istedigimiz index'ten sonra arama yapar
		System.out.println(sb1.indexOf("kazim")); // -1 // istedigimiz String'i bulamazsa -1 dondurur
		
		
		sb1.insert(7, " "); // istenilen parcayi istenilen yere ekler
		System.out.println(sb1); // Rumeysa  cetinturk
		
		cumle="merhaba dunya";
		sb1.insert(0, cumle, 0, 8);
		System.out.println(sb1); // merhaba Rumeysa  cetinturk
		                            //0 : SB'a nereden itibaren eklenecek
		                            // cumle : hangi String'den eklenecek
		                            // 0: cumlenin hangi indexinden baslanacak
		                            // 8 : baslangic indexinden sonra kac akrakter alinacak 
		
		sb1.insert(25, cumle, 8, 13);
		System.out.println(sb1);
		
		System.out.println(sb1.lastIndexOf("t")); // 22 istenen string'in kullanildigi son index'i verir
		System.out.println(sb1.lastIndexOf("a", 22)); //14 istenen index'ten oncesine bakar
		
		sb1.replace(8, 15, "Seher"); // Sb'in baslangic ve bitis indexleri arasindaki kismi verilen string ile degistirir.
		System.out.println(sb1); //
		
		sb1.reverse();
		System.out.println(sb1); // kaynudrutnitec  reheS abahrem
		sb1.reverse();
		
		sb1.setCharAt(10, 'k');
		System.out.println(sb1);
		
		System.out.println(sb1.subSequence(8, 13));
		
		System.out.println(sb1);
		sb1.substring(8,13);
		System.out.println(sb1);
		
		StringBuilder sb3=new StringBuilder("java cok guzel");
		StringBuilder sb4=new StringBuilder("java cok guzel");
		
		System.out.println(sb3.equals(sb4)); // false iceriklerin ayni olup olmadigina bakar
		System.out.println(sb3.toString().concat(" insanin sevdikce sevesi geliyor")); // java cok guzel insanin sevdikce sevesi geliyor
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.trimToSize(); // SB icin hazirlanan kapasitedeki fazlaliklari  siler 
		                  // length ile kapasiteyi esit hale getirir
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		System.out.println(sb3.compareTo(sb4)); // SB'nin tum karakterlerinin esitligini kontrol eder 
		
		

	}

}
