package day25_constructor;

public class C02_CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C01 car1=new C01();
		
		/* bir esitlikte sol taraf declaraation
		 declaration'da data turu, variable ismi 
		 String isim="Mehmet";
		 data turu class ismi olabilir
		 primitive data turlerini java olsuturmustur biz primitive data turu olusturamayiz
		 non-primitive data turlerini java da olusturubailir bizde olusturabiliriz
		
		 C01 car yazdigimizda C01 hem class ismi hemde non-primitve data turudur.
		
		
          new C01(); esitligin sagi deger olusturma
          new : keyword dur ve yeni bir obje olusturacagimiz beyan eder
          C01() ise constructor'dir
          
          */
		
		car1.fiyat=10000;
		car1.ilanNo=1001;
		car1.marka="Toyota";
		car1.model="Corolla";
		car1.yil=2020;
		// variable'lar sadece deger atamasi yapar
		
		System.out.println(car1.fiyat + ", " + car1.ilanNo + ", "+ car1.marka + ", "+ car1.model + ", "+ car1.yil);
		
		car1.maxHiz(200);
		car1.yakit("dizel ");
		// methodlarin ne yapacagini method belirler
		
		// bir araba daha olusturmak istersem
		
			C01 car2=new C01();
			
			car2.fiyat=15000;
			car2.ilanNo=1002;
			car2.marka="renault";
			car2.model="Clio";
			car2.yil=2019;
			
			System.out.println(car2.fiyat + ", " + car2.ilanNo + ", "+ car2.marka + ", "+ car2.model + ", "+ car2.yil);
			
			
	}

}
