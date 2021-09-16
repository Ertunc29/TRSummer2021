package day05_Wrapper_Cocatenation;

public class C1_WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String isim="Sanim";
		int sayi=10;
		
		System.out.println(isim.charAt(2));
		
		
		//isim. dediigmizde bircok metod listelenir. cunku isim variable'nin data turu string 
		// ve String data turu non-primitive dir.
		//non-primitive degerinin yaninda method'lr vardir.
		
		// sayi. sayi variable nin data turu integer/ ve integer primitive dir.
		//primitive data turleri sadece value sahiptirler. methodlari yoktur.
		
		//Java primitive data turleri icinde methodlarin kullanilmasi icin
		// her primitive data turu icin bir WRAPPER CLASS olusturmus
		
		Integer sayi2=10;
		System.out.println(sayi2.MAX_VALUE);// int alabilecegi max deger
		System.out.println(sayi2.MIN_VALUE);// int alabilecegi min deger
		
		//short un min ve max degerlerini bulalim
		
		Short sayi3=0;
		
		System.out.println(sayi3.MAX_VALUE);
		System.out.println(sayi3.MIN_VALUE);
		
		//Wrapper Class kullanimina bir ornek verelim
		
		String okulNo="858";
		
		// Eger bir String variable sadece sayilardan olusuyorsa bu String int'a cevirebiliriz
		
		int okulNoSayiOlarak=Integer.parseInt(okulNo);
		
		//System.out.println(okulNo++); okulNo String olarak tanimlandigi icin matematiksel islem yapilamaz.
		
		System.out.println(++okulNoSayiOlarak); // 859
		
		Character basHarf='a';
		
		System.out.println(basHarf.charValue()); // a
		
		
		
		
		
		

	}

}
