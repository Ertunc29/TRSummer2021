package day36_inheritance;

public class Mammal extends Animal {

	public void mA() {
		
		System.out.println("mammal");
		
	}
		
		
		public void mC() {
			System.out.println("cat"+"mammal");
			
		}
		int c=7;
		int m=4;
		
		public Mammal() {
			this('A');
			System.out.println("p'siz mammal cons.");
			
	}
		public Mammal(char c) {
			
			System.out.println("char p'li mammal cons.");
		}

}
