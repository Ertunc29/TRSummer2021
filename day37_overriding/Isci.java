package day37_overriding;

public class Isci extends Personel {
	
	public String bolum="Kaynak Atolyesi";
	public int maas=5000;
	public String isim="Mesut";
	
	
	
	
	public void mesai() {
		
		System.out.println("isciler gunluk 8 saat calisir");
	}
	
	// overloading : ayni isimde ama farkli method signature'larina sahip methodlar
	
	public int maasHesapla(int gunSayisi) {
		
		return gunSayisi*8*15;
		
		
	}
	
	public int maasHesapla(int gunlukCalismaSaati, int gunSayisi) {
		
		return 15*gunlukCalismaSaati*gunSayisi;
		
	}
	
	public int maasHesapla(int gunlukCalismaSaati, int gunSayisi, int saatUcreti) {
		return saatUcreti*gunlukCalismaSaati*gunSayisi;
		
	}

}
