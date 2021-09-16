package day17_nestedForLoopsWhileLoops;

public class C04_WhileLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* soru 2: For loop ve while loop kullanarak
		  3 basamakli sayilardan 15, 20 ve 90'na tam bolunebilen sayilari yazdirin
		 */
	
		
		int i=100;
		while(i<1000) {
			if(i%15==0 && i%20==0 && i%90==0) {
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
