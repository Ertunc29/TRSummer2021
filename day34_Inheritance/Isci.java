package day34_Inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {
	 
		Isci isci1=new Isci();
		
		isci1.isim="omer";
		isci1.soyisim="Aydin";
		isci1.id=1001;
		isci1.izindeMi=false;
		isci1.saatUcreti=10;
		isci1.statu="isci";
		isci1.maas=isci1.maasHesapla();
		
		System.out.println(isci1.isim + " " +isci1.soyisim+ " " + isci1.id +
				" "  + isci1.statu + " " +isci1.maas+ " tl");
		
		// bu derse kadar hangi class'dan bilgi almak istiyorsak o class'dan obje olusturduk
		// inheritance ile bu mecburiyet ortadan kalkti
		// child class'da olusturdugumuz obje ile tum parent class'larda 
		// bulunan variable ve method'lari inherit edebilirim
		
		
	Isci isci2=new Isci();
		
		isci2.isim="Ahmet";
		isci2.soyisim="Aydin";
		isci2.id=1002;
		isci2.izindeMi=false;
		isci2.saatUcreti=15;
		isci2.statu="isci";
		isci2.maas=isci2.maasHesapla();
		
		System.out.println(isci2.isim + " " +isci2.soyisim+ " " + isci2.id +
				" "  + isci2.statu + " " +isci2.maas+ " tl");
	}

}
