package scannar;

import java.util.Scanner;
public class employe {

public void sample(){
	Scanner s=new Scanner (System.in);
	
	System.out.println("enter the empId");
	long empId=s.nextLong();
	System.out.println(empId);
	
	System.out.println("enter the empName");
	String empName=s.next();
	System.out.println(empName);
	
	System.out.println("enter the empMail");
	String empMail=s.next();
	System.out.println(empMail);
	
	System.out.println("enter the empPhoneno");
	long empPhoneno=s.nextLong();
	System.out.println(empPhoneno);
	
	System.out.println("enter the empSalary");
    float empSalary=s.nextFloat();
	System.out.println(empSalary);
	
	System.out.println("enter the empGender");
	String empGender=s.next();
	System.out.println(empGender);
	}
	
public static void main(String[] args) {
	
	employe e=new employe();
	e.sample();
	
}
}
