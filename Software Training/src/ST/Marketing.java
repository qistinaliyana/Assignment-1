package ST;

import java.util.Scanner;

public class Marketing { //Marketing is predefined class
	    Scanner s = new Scanner(System.in);

        private String Publishing;
        private String Networking;
        private String Photo_based_Networking;
        private int adver, web, sal, rent;
        
        
        //default Constructer
        Marketing () {
        	Publishing = "Social publishing allows us to publish information in the content form(written text and videos).";
        	Networking = "Social Networking helps us to stay connected with our friends, business partners, relatives, and customers. ";
        	Photo_based_Networking = "Photo-based social networking is used to share photos using social networking sites.";
        	System.out.println("\n=================Marketing Info=================");
        	System.out.println("\nVisit our YouTube : IntelleqQSyt : " + Publishing);
        	System.out.println("Visit our TFacebook : IntelleqQS@J,P,C : " + Networking);
        	System.out.println("Visit our Instagram : IntelleqQS : " + Photo_based_Networking);
        	
        }
        //method
        void Cost_Marketing() {
	    	System.out.println("\nHow much do you spend on advertising ?: RM");
	    	adver = s.nextInt();
	    	System.out.println("How much do you spend on website development?: RM");
	    	web = s.nextInt();
	    	System.out.println("How much do you spend on salary of marketing staff ?: RM");
	    	sal = s.nextInt();
	    	System.out.println("How much do you spend on rent office space ?: RM");
	     	rent = s.nextInt();
        }
        //method
	    void printCostMarketing() {
	    	System.out.println("\nCost Advertising : RM " + adver);
	    	System.out.println("Cost Website development : RM " + web);
	    	System.out.println("Cost Salary of marketing staff : RM " + sal);
	    	System.out.println("Cost rent office space : RM " + rent);
	    	System.out.println("\n=====================End=====================");
	    	
	    	
	    }
    	   
}
