package day35_Inheritance;

public class Memur extends Muhasabe {

	public static void main(String[] args) {
		
		Memur m1=new Memur();
		
		Memur m2=new Memur();
		
		m1.isim="Sanim";
		m1.soyisim="Sah";
		m1.adres="kara kayalar";
		m1.saatUcreti=20;
		m1.statu="developer";
		m1.tel="05345190029";
		m1.id=m1.idAta();
		m1.maas=m1.maasHesapla();
		System.out.println(m1.isim +"\n" + m1.soyisim +"\n" + m1.adres + "\n"+ m1.saatUcreti
				+"\n" +m1.statu + "\n" +m1.tel + "\n" + m1.id + "\n" + m1.maas );

	}

}
