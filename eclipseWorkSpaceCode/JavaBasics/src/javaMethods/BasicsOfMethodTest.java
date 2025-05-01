package javaMethods;

public class BasicsOfMethodTest {

	public static void main(String[] args) {
		
		BasicsOfMethod obj = new BasicsOfMethod();
		obj.createUser("Snehal");
		obj.createUser("Sourabh");
		obj.createUser("Ankit");
//		obj.getAllUsers();
		
		obj.deletedUser(51);
		obj.deletedUser(100);
		
	}

}
