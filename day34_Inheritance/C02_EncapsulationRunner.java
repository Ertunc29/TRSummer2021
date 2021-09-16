package day34_Inheritance;

public class C02_EncapsulationRunner {

	public static void main(String[] args) {
		
		C01_Encapsulation obj1=new C01_Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getokulAcikMi());
		System.out.println(obj1.getOkulHesapNo());
		
		obj1.setOkulIsmi("mehmet koleji");
		System.out.println(obj1.getOkulIsmi());
		C01_Encapsulation obj2=new C01_Encapsulation();
		System.out.println(obj2.getOkulIsmi());

	}

}
