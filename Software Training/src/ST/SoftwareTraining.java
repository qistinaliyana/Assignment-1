package ST;

import java.util.Scanner;
// Pre-Defined Class
public class SoftwareTraining { 
	Scanner s = new Scanner(System.in) ; 
	private int Contact_Us;
	private String Company_name;
	private String Email;
	private String languages, topic;
	
	 // Constructer with three arguments 
	 SoftwareTraining ( String N, int C, String E) {
		System.out.println("\n\t\t\t\t====WELCOME TO THE SOFTWARE TRAINING====");
		Company_name = N;
		Contact_Us = C;
		Email = E; 
		
	   }	
	 void printsofwaretraining() {
		 System.out.println("Name company : " + Company_name);
		 System.out.println("Contact us : " + Contact_Us);
		 System.out.println("Email : " + Email);	 
	 }
	    
     //method
	 void printlanguages(String lang, String tcover) {
	      languages = lang; 
	      topic = tcover;
	      System.out.println("\n++Course Details++");
	      System.out.println(languages + " Programming Language");
	      System.out.println(topic + " Programming Language");
	      
     }

       }

