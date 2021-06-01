package ST;

public class Advertisement { //Advertisement is predefined class
	  
	    private String Ads;
	    private String Ads1;
	    
	    // default constructer
	    Advertisement (){
		Ads = "\t\t\t\tBest Training Centers in Gombak\r\n"
				+ "\t\tThose candidates who wish to enroll and attend the Training programe," + "\t\nPlease Communicate with us Call 7676765421 , 080-42108236 , 080-42024661 and Book your Seat Now!\r\n"
				+ "We Provide PYTHON, JAVA, C/C++ Certification Training Courses with Placement Support till you get Job !\r\n"
				+ "";	
		System.out.println("\n" + Ads);
	    
		System.out.println("\n\t\t\t\t======================================");
		System.out.println("\t\t\t\t-------SOFTWARE TRAINING COURSE--------");
		System.out.println("\n\t\t\t\tCLASS     COURSE DURATION     PRICE");
		System.out.println("\t\t\t\t JAVA          3 MONTH          RM 800");
		System.out.println("\t\t\t\t PYTHON        2 MONTH          RM 800");
		System.out.println("\t\t\t\t C++           4 MONTH          RM 800");
		System.out.println("\t\t\t\t======================================");
		System.out.println("\t\t\t\tBook your Seat Now!");
	    }
	    //method
	    void Advers() {
	    	Ads1 = "\tTheory + Practicals + Assignment + Certification + Resume Preparation + Attend Interview = you got job!";
    		System.out.println("\n\t\t\t\t----------TRAINING METHODOLOGY---------");
    		System.out.println(Ads1);
	    }
}
