package ifAndIfElseAssignmentDay4;

public class IfElseSessionAssignment {
	
	public static void main(String[] args) {
		
		// write a code where interest rate is = 7 print ICICI Bank
		// 8 = HDFC bank
		// 9 = City Bank
		//10 = Axis bank
		
		int interestRate = 10;
		if(interestRate==7) {
			System.out.println("ICICI Bank");
		}
		if(interestRate==8) {
			System.out.println("HDFC Bank");
		}
		if(interestRate==9) {
			System.out.println("City Bank");
		}
		if(interestRate==10) {
			System.out.println("Axis Bank");
		}
		
		System.out.println("No Bank found");


	}

}
