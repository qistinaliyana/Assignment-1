package ST;

import java.util.Scanner;

public class Customer { //Customer is predefined class
	Scanner s = new Scanner(System.in) ; 
	private  String name, no_hp, email, mode, course;
	private int num =10;
	private int percentage = 100; 
	
	
	//default constructer 	
	Customer (){
		    
		    System.out.println("\n===================Customer===================");
			System.out.println("\nInterested in this Course? y = yes / n = no : ");
			char o = s.next().charAt(0);
			
	         if ( o == 'y' ) {
			    System.out.println("\nEnter Your Name : " );
			    name = s.next();
			    System.out.println("Enter Your Mobile No. : " );
			    no_hp = s.next();
			    System.out.println("Enter Your Email : " );
			    email = s.next();
			    System.out.println("Enter your training mode either classroom or online : " );
			    mode = s.next();
			    System.out.println("Enter the Training course you want : " );
			    course = s.next();
			
			    System.out.println("\n===========Receipst============");
			    System.out.println("\nEnter Your Name : " + name);
			    System.out.println("Enter Your Mobile No. : " + no_hp);
			    System.out.println("Enter Your Email : " + email );
			    System.out.println("Enter your training mode either classroom or online : " + mode);
			    System.out.println("Enter the Training course you want : " + course);
			
	         } else {
	            System.out.println("\n=====================End=====================");
	         }   
		     }
	         //Constructer one arguments
	         Customer (double pr) { 	 
	        	 double total = pr - (num / percentage);
	        	 System.out.println("Amount = RM " + total);
	        	 
	         }
		     
		     //Constructer with two arguments
	          Customer (double p, double d){
	      	    double Finalprice = p - d ;
	        	System.out.println("Discount = 10%");
	     	    System.out.println("Final total price = RM " + Finalprice);
	     	    System.out.println("\n===============End================");
	       }

}
