package day43_interfaces;

public class InterfaceRunner implements Interfaces02, Interface01 {

	public static void main(String[] args) {
		
		
		// static olarak tanimlanmis bir variable veya method baska bir class'dan
		// class ismi.method ismi seklinde cagrilabilir.
		
		Interfaces02.deneme2();
		
		// default keyword ile olusturdugumuz method ise
		// obje uzerinden cagrilabilir 
		
		InterfaceRunner obj1=new InterfaceRunner();
		
		obj1.deneme();
		
		System.out.println("interface 01 variable :"+ Interface01.isim);
		System.out.println("interface02 variable :"+ Interfaces02.isim);
		
		

	}

	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vites() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kasa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jant() {
		// TODO Auto-generated method stub
		
	}

}
