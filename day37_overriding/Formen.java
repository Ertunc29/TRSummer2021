package day37_overriding;

public class Formen extends Isci {
	
	public String sorumluOldBolum="bakim";
	//public String isim="Emrullah";

	public static void main(String[] args) {
		
		// Inheritance'da data turu olarak class ismi kullanimi
		
		// bir class'ta obje uretirken data turu olarak class'in kendisini veya 
		// parentlarini kullanabiliriz
		// olusturdugumuz obje ile variable kullanmamiz gerekirse, hangi degeri 
		// lacagini anlamak icin once Data turu olan class'a gideriz
		// orada aradigimiz variable varsa kullaniriz, yoksa 
		// parentlarina bakariz, yukari dogru giderken buldugumuz ilk degeri kullaniriz
		
		Formen fr1=new Formen();
		// fr1 objesini kullanarak hangi class'larin hangi variable'lari gorebilirim
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim + " "+ fr1.sorumluOldBolum+ " "+ fr1.maas);
		
		Isci fr2=new Formen();
		// data turu olarak isci secildigi icin Isci class'i ve uzerini goruruz
		
		fr2.bolum="boya atolyesi";
		//fr2.isim="Serkan";
		System.out.println(fr2.isim + " "+fr2.maas +" "+ fr2.bolum); // Mesut 5000 boya atolyesi
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim); // Sanim
		
		

	}

}
