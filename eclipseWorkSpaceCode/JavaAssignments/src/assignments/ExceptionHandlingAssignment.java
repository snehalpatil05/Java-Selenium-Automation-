package assignments;

public class ExceptionHandlingAssignment {

	public static void main(String[] args) {

		System.out.println("Start of Method");

		try {
			String[] name = {"Snehal", "Apeksha", "Pooja", "Shwetha", "Amrutha"};
			for(int i=0; i<=name.length; i++) {
				System.out.println("value of array index"+i+" is "+name[i]);
			}

		}catch (Exception e) {
			System.out.println("In Catch Block");
			e.printStackTrace();
		}

		System.out.println("End of Method");
	}

}



