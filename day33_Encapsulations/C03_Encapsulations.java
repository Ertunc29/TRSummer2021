package day33_Encapsulations;

public class C03_Encapsulations {

	public static void main(String[] args) {
		
		// C02_Encapsulation class'inda ki class member'a ulasmaya calisalim
		
		
		C02_Encapsulations obj1=new C02_Encapsulations();
		
		// biz erisim yetkisini ikiye ayiriyoruz
		//1-okuyabilme get()
		// 2- degistirip kullanabilme set();
		
		System.out.println(obj1.getOkulIsmi()); // yildiz koleji
		System.out.println(obj1);
		System.out.println(obj1.getOkulIsmi()); // yildiz koleji
		
		System.out.println(obj1.sayi); // public oldugundan hem okurum hem deger atarim
		obj1.sayi=23;
		System.out.println(obj1.sayi);
		
		obj1.setTcNo("01234567891");
		// System.out.println(obj1.setTcNo("11223344556")); set method'u okumaya izin vermez
		
		obj1.setHesapNo(231770);
		
		// bir class icinde class member olsutururken bunu diger class'lar ile ne oranda 
		// paylasacagimiza karar vermemiz lazim
		// 1- herkes okuyabilsin ve deger atayabilsin dersek== public
		// 2- herkes okuyabilsin ama deger atayamasin public==>private
		// 3- kimse goremesin dersek private 
		

	}

}
