package ST;

import java.util.Scanner;

public class Employee  { //Employee is predefined class
        Scanner s = new Scanner (System.in);
	    private String id;
	    private String name;
	    private String department;
	    private int age;
	    private int salary;
	 
	    //constructor with five arguments
	    Employee(String i, String n, String d, int a, int s){
	        id = i;
	        name = n;
	        department = d;
	        age = a;
	        salary = s;
	    }
	    //method 
	    void PutData()  {
	  
            System.out.print("\n\t\t\t\tEmployee Id     : "+id);
            System.out.print("\n\t\t\t\tEmployee Name   : "+name);
            System.out.print("\n\t\t\t\tEmployee Department : "+department);
            System.out.print("\n\t\t\t\tEmployee Age    : "+age);
            System.out.print("\n\t\t\t\tEmployee Salary : "+salary);
           
        }
	   
	}
