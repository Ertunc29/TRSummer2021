package day41_errors_GarbageCollector;

import java.util.ArrayList;
import java.util.List;

public class Errors {

	public static void main(String[] args) {
	
	//	System.out.println(20/0); // RTE degil RunTimeException
		
		// String str="sdf; // CTE ... cunku tirnak kapanmadikca kod calismaz
        // bu tur hatalar kolayca duzeltilebilir 
		
		// java da Error denildiginde pnune gecilemeyen duzeltilemeyn hata 
		// sistemden kaynakli buyuk hatalar
		
		// Error'lar unchecked'dir ve java bunlari ongoremez
		// ancak gercklestiginde kodun calismasi durdurulur
		
		String str="";
		
			for (int i = 0; i < 100000; i++) {
				str+=i;
				
			}
		

	
	}
	

}
