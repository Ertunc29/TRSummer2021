package day34_Inheritance;

public class Muhasebe extends Personel {

	// muhasabe class'inin personel class'inin child class'i oldugunu
	// decalre etmek icin classs ismine extend keyword ile
	// paret class'i yazariz
	
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	
	public int maasHesapla() {
		
		maas=saatUcreti*8*30;
		return maas;
		
		
	}
}
