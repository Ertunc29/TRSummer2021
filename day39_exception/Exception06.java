package day39_exception;

import java.util.ArrayList;
import java.util.List;

public class Exception06 {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,5,6};
		
		System.out.println(arr[1]); // 2
		System.out.println(arr[3]); // 6
	//	System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		
		List<String> list=new ArrayList<>();
		list.add("hasan");
		list.add("sevim");
		list.add("neco");
		
		System.out.println(list); // [hasan, sevim, neco]
		System.out.println(list.get(1)); // sevim
		System.out.println(list.get(3));  // IndexOutOfBoundsException

	}

}
