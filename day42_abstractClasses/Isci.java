package day42_abstractClasses;

public class Isci extends Personel {

	public static void main(String[] args) {
		
		Isci isci1=new Isci();
		isci1.maasHesapla();
		isci1.mesaiBilgisi();
		isci1.isim="Rumeysa";
		System.out.println(isci1.isim);
		isci1.ozelSigorta(); // abstract parent class'daki concrete methodu istersem kullanabilirim

	}

	@Override
	public void maasHesapla() {
		// parent class'daki abstract methodu implement etti
		//1- sen abstract class'i parent edindiysen mutlaka ordaki abstract methodu
		//implement etmelisin
		//2- parent class'daki method'da bodu olmadigi icin onu kullanmanin anlami yok
		// biz child class'daki body olan method(concrete) kullanip islem yapmaliyiz
		
		System.out.println("isciler icin maas 5000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("isciler gunde 8 saat calisir");
		
	}

}
