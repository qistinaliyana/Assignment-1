package ST;
import java.util.Scanner;

public class Finance  {// Finance is predefined class
	
	   Scanner s= new Scanner(System.in);
	   private double costprice,sellprice;	
	   
	 
	   //method 
       void profitAndloss(){
	   	   
	   System.out.println("\n==================Finance=================");
	   System.out.println("Enter the Costprice: ");
	    costprice=s.nextDouble();
	   System.out.println("Enter the Selling price: ");
	    sellprice=s.nextDouble();
	 
	   if(costprice-sellprice > 0 )  {
	      System.out.println("Loss: RM " +(costprice-sellprice));
	      System.out.println("\n====================End===================");
			}
	   else if(costprice-sellprice<0) {
		    System.out.println("Profit: RM " +(sellprice-costprice));
		    System.out.println("\n===================End===================");
			}
			else
			  System.out.println("NEUTRAL");
	          System.out.println("\n================Thank You================");
	}
}
