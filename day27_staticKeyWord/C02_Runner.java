package day27_staticKeyWord;

public class C02_Runner {

	@SuppressWarnings("static-access") // bu main method da static access ile ilgili
	                                   // isleyisi bozmayan kucuk bir hata var ve ben bunu onayliyorum
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// C01 de ki variable'lara ulasmak istersem
		// ilk once C01'deki variable'larin instance'mi static'mi olduguna bakmam gerekir
		// ornegin sayi ve str instance variable'dir. dolaysiyla onlara ulasmak obje uzerinden ulasabilirim.
		
		C01 obj1=new C01();
		System.out.println(obj1.str);//yasasin eclipse
		
		obj1.str="yasasin faruk";
		
		System.out.println(obj1.str); // yasasin faruk
		
		C01 obj2=new C01();
		System.out.println(obj2.str); // yasasin eclipse-bu yeni obje obj1 degisikligi bunu etkilemez
		
		// sayi2 variable'i static oldugu icin obje'ye ihtiyac duyulmaz
		
		System.out.println(C01.sayi2); // 0
		C01 obj3=new C01();
		
		obj3.sayi2=27; // CTE vermez
		               // ancak altini sari cizer  ve satir numarasina unlem koyar
		               // cunku java daha kisa ve emin yol vakren nicin obje uzerinden ulastigini sorar
		               // bu kodun calimasina engel degildir o nedenle CTE vermez
		               // fakat bu gereksiz bir islemdir java bizi uyarir
		
		System.out.println(obj3.sayi2); //27
		
		C01.sayi2=34;    // static variable'lara class ismi.variable ismi yazilarak ulasilabilir buna static way denir
		
		System.out.println(C01.sayi2); // 34 static variable'lar ulasabilen her obje ve 
		                               // her class icin ortaktir. 
		
		System.out.println(obj2.sayi2); // 34 static variable bir kez degisti mi herkes icin degisir
        System.out.println(obj1.sayi2); // 34
	}

}
