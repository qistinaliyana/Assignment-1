package ST;

import java.util.Scanner;

public class Sales { //Sales is predefined class
        Scanner s = new Scanner(System.in);
        private int salesc;
        private int bestseller = 0;
        private int worstseller = 0;
        private int sum = 0;
       
        //default constructer
         Sales (){ 
        	 
        System.out.println("\n=======================Sales======================");
        System.out.println("Enter the number of available training courses : "); 
        salesc = s.nextInt();
         }
         
      //method
      void printsales() {
    	  
        int[] sales = new int[salesc];
        for (int i=0; i < sales.length; i++) {
        System.out.print("Enter sales for course training " + i + " : ");
        sales[i] = s.nextInt();
        }
        
        System.out.println("\n----------------------Sales----------------------");
 
        for (int i=0; i < sales.length; i++)  {
         //Finding best and worst sales:  
         if(sales[i] > sales[bestseller]) {
             bestseller = i;
            }
             
            if(sales[i] < sales[worstseller]) {
                worstseller = i;
             }
                  
            System.out.println("\t " + i + "\t\t\t" + sales[i]);
            sum += sales[i];
            }

           System.out.println("\nTotal sales: " + sum);
           //Print best and worst sales:
           System.out.println("The Best Seller " + bestseller + " sold the most: " + sales[bestseller]);
           System.out.println("The worst Seller " + worstseller + " sold the least: " + sales[worstseller]);
 
           
            System.out.println("\n=======================End======================");
  }  
         
}