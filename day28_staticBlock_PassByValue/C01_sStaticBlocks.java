package day28_staticBlock_PassByValue;

public class C01_sStaticBlocks {
	
	static int sayi=10;
	
	static {
		
		System.out.println("1.static block calisti");
		sayi=20;
	}
	
	
	static {
		System.out.println("2.static block calisti");
		sayi=15;
	}
	
	static {
		System.out.println("3.static block calisti");
		sayi=30;
	}

	public static void main(String[] args) {
		
		System.out.println("main method'un ilk satirindan sayi :"+ sayi); // 

	}
	
	static {
		System.out.println("main method'dan sonraki static block calisti");
		sayi=100;
	}  

}


