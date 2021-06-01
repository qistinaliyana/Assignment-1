package ST;

public class MainST {

	public static void main(String[] args) {
		
		SoftwareTraining st = new SoftwareTraining ("Intelllect QS", 783478249, "IntellectQS@gmail.com");
		st.printsofwaretraining();
		st.printlanguages("\nJAVA", "\nCore Java\r\n"
				+ "Advanced Java\r\n"
				+ "Web Services\r\n"
				+ "Android Development\r\n"
				+ "html5, eclipse, oracle, mysql\r\n"
				+ "Java Scripts, Jquery\r\n"
				+ "Web Application development");
		
		st.printlanguages("\nPython", "\nFundamentals of Python\r\n"
				+ "Working with Data\r\n"
				+ "Python Date & Time\r\n" 
				+ "Python Advanced Topics\r\n"
				+ "Python Object & Class\r\n"
				+ "Python Files\r\n" 
				+ "Python Datatypes");
		
		st.printlanguages("\nC++", "\nIntroduction to C++\r\n" 
		        + "Data Types and Variables\r\n" 
				+ "Input/Output Management\r\n" 
		        + "Control-Flow Statements\r\n"
				+ "Control-Flow Statements\r\n" 
		        + "Arrays, Pointers, and Strings\r\n" 
				+ "Structures");
		
		Advertisement a = new Advertisement();
		a.Advers();
		
		Customer c = new Customer();
		Customer c1 = new Customer(800);
		Customer c2 = new Customer(800,80);
					
        Employee e1 = new Employee ("103", "adrina", "Java", 34, 4000);
        System.out.println("\n\t\t\t\t==============Employer information================");
        e1.PutData();
        
        Employee e2 = new Employee ("890", "FarisAiman", "Python", 45, 4000);
        e2.PutData();
        
        Employee e3 = new Employee ("345", "HaiqalAmran", "C++", 42, 3700);
        e3.PutData();
        System.out.println("\n\t\t\t\t===================End=====================");
        
        Marketing m = new Marketing ();
        m.Cost_Marketing();
        m.printCostMarketing();
        
		Sales t = new Sales () ;
		t.printsales();
		
		Finance f = new Finance () ;
		f.profitAndloss();
		
		
	}

}
