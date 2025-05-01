package assignments;

public class ForLoopStarPatternAssignment {

	public static void main(String[] args) {
//		for (int i = 5; i>0; i--) {  // Outer loop for rows
//            for (int j = 1; j <= i; j++) {  // Inner loop for stars
//                System.out.print("*");
//            }
//            System.out.println();  // next  line
//        }
		
		
		for (int i = 1; i<=5; i++) {  // Outer loop for rows
            for (int j = 1; j <= i; j++) {  // Inner loop for stars
                System.out.print("*");
            }
            System.out.println();  // next  line
        }
		
	}

}




