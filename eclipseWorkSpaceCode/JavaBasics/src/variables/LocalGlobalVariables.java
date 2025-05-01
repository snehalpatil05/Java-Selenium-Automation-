package variables;

public class LocalGlobalVariables {		
		
	
		static int i = 50; //global variable
		static double pi = 3.14; //global variable
		
		public void areaOfCircle() {
			int r = 10; // local variable
			System.out.println("Area Of Circle: "+i);
			System.out.println(pi*r*r);
		}
		
		public void circumferenceOfCircle() {
			int r = 20; // local variable
			System.out.println("Circumference Of Circle: "+i);
			System.out.println(2*pi*r);

		}
				
		public static void main(String[] args) {
			int i=30;  // local variable to main method
			System.out.println(i);
			
//			Create object to call the class:
			LocalGlobalVariables obj = new LocalGlobalVariables();
			obj.areaOfCircle();
			obj.circumferenceOfCircle();
			
	}

}
