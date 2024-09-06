package org.example;
import java.util.Scanner;
class Employee{
     String name;
     int emp_id;
     float salary;
     String add;
     int dept_code;
     
    public void accept(){
	Scanner sc= new Scanner(System.in);
	System.out.print("enter the employee name: ");
	name =  sc.nextLine();
	
	
	System.out.print("enter the employee id: ");
	emp_id = sc.nextInt();
	sc.nextLine();
	System.out.print("enter the employee add: ");
	  add = sc.nextLine();
	
	System.out.print("enter the employee salary: ");
	  salary  = sc.nextFloat();
	

	System.out.print("enter the employee dept_code: ");
	  dept_code = sc.nextInt();
    }
     void print(){
    	 System.out.println( "name: "+ name);
    	 System.out.println( "salary: "+ salary);
    	 System.out.println( "add: "+ add);
    	 System.out.println( "dept_code: "+ dept_code);
            
         

     }}

class program{
	
 public static  void main(String[] args) 
 {
	 
	 Employee emp1 = new Employee(); 
 	 emp1.accept();
	 emp1.print();
    }

}



