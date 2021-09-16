package day42_abstractClasses;

public class IdariPersonel extends Personel {
	
	// extends Personel yazarak Abstract Personele cencrete bir child olusturdum
	// ve java CTE verdi
	// cozum olarak urettigi iki ihtimal var
	//1- unimplemented(uyarlanmamis methodlari uyarla)
	//2- ya da Perosnel class'indan abstract kelimesini kaldir

	public static void main(String[] args) {
		

	}

	@Override
	public void maasHesapla() {
		System.out.println("idari eprsonel maas 4000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("idari personel gunde 10 saat calisir");
		
	}

}
