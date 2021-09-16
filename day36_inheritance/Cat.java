package day36_inheritance;

public class Cat extends Mammal {
	
	public void mC () {
		System.out.println("cat");
		
	}
	int c=9;
	int d=5;
	
	Cat() {
		System.out.println("p'siz cons.");
	}
	
	Cat(String s) {
		this();
		System.out.println(super.c);
		System.out.println("p'li cons.");
	}
	
	
	
		

	

}
