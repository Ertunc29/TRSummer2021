package day33_enCapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C10_EmployeesMain {
	
	public static void main(String[] args) {
		
	
	

	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen adinizi giriniz");
	String name=scan.next();
	
	System.out.println("Lutfen dogum tarihinizi giriniz");
	String dob=scan.next();
	
	System.out.println("Lutfen maasinizi  giriniz");
	int salary=scan.nextInt();
	
	
	C09_Employees calisan=new C09_Employees();
	
	calisan.setDob(dob);
	calisan.setName(name);
	calisan.setSalary(salary);
	
	int calisanYas=calisan.yasHesapla(dob);
	
	if(calisanYas>18) {
		
		System.out.println("welcome to our company "+ name + " your salary is :"+ salary);
	}else if (calisanYas<18) {
		System.out.println("come bask when you are 18 years old");
	}else if(calisanYas==18) {
		System.out.println("we can have inter with you that you can have a");
	}
	
		
	
	
	
    
    
    
    
    
    
    
    
	}
    

}
