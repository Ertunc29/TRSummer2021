package day42_abstractClasses;

public class YanHizmetlerChild extends YanHizmetler {

	public static void main(String[] args) {
		
		YanHizmetlerChild yh= new YanHizmetlerChild();
		
		
		yh.acilIsler();
	}
		
	@Override
	public void acilIsler() {
		
		System.out.println("acil isler her zaman onceliklidir");
	}

	@Override
	public void maasHesapla() {
	
		
	}

	@Override
	public void mesaiBilgisi() {
		
		
	}

}
