package assignments;

public class SwitchStatementSessionAssignment {

	public static void main(String[] args) {
		
//		write a code with switch for below conditions
//		if interest rate is 7 than print ICICI bank
//		                  8 than print HDFC bank
//		                  9 than print City bank
//		                  10 than print Axis bank
//		                any other value print No bank
		
		int interestRate = 11;

		switch(interestRate) {
		case 7:
			System.out.println("ICICI Bank");
			break;
		case 8:
			System.out.println("HDFC Bank");
			break;
		case 9:
			System.out.println("City Bank");
			break;
		case 10:
			System.out.println("Axis Bank");
			break;
		default:
			System.out.println("No Bank providing this interest rate");
			break;		
		}

		System.out.println("Out of Switch Loop");


	}

}
