package controlFlows;

public class ElseIfStatement {

	public static void main(String[] args) {
		// if there are more than 2 conditions to validate then we go for else if statement.
		
		int interestRate = 7;
		if(interestRate==7) {
			System.out.println("ICICI Bank");
		}else if (interestRate==8) {
			System.out.println("HDFC Bank");
		}else if(interestRate==9) {
			System.out.println("City Bank");
		}else if (interestRate==10) {
			System.out.println("Axis Bank");
		}else {
		System.out.println("No Bank found");
		}
		
		System.out.println("Execution completed");
	}

}

	