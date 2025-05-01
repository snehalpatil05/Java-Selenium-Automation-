package assignments;

public class MultiplicationTableOf5 {

	public static void main(String[] args) {
		int a = 5; // The number for which we print the table
        System.out.println("Multiplication Table of " + a + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
	}
}
