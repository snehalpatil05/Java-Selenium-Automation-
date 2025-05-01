package controlFlows;

public class SwitchStatements {

	public static void main(String[] args) {

		int i = 500;

		switch(i) {
		case 100:
			System.out.println("Printing 100");
			break;
		case 200:
			System.out.println("Printing 200");
			break;
		case 300:
			System.out.println("Printing 300");
			break;
		default:
			System.out.println("Printing default");
			break;		
		}

		System.out.println("Out of Switch Loop");

	}

}
