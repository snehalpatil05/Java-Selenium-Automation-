package variables;

public class MyInstanceAndStaticVariables {
	
	
	int i = 10;  //instance variable /global variable/class variable
	static int abc = 20; //Static variable
	public void method() {
		i++;
		abc++;
		System.out.println("Value of i is: "+i);
		System.out.println("Value of abc is: "+abc);

	}

	
}
