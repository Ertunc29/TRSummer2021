package day41_errors_GarbageCollector;

import java.util.Date;


public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime rt= Runtime.getRuntime();
		
		System.out.println("total memory :"+rt.totalMemory());
		System.out.println("looptan pnce memory :"+ rt.freeMemory());
		
		Date d=null;
		
		for (int i = 0; i < 100000; i++) {
			
			d= new Date(i);
			
			
		}
		
		System.out.println("looptan sonra free memory :"+rt.freeMemory());
		
		rt.gc();
		System.out.println("After GC Free Memory :"+ rt.freeMemory());
		
	}

}
