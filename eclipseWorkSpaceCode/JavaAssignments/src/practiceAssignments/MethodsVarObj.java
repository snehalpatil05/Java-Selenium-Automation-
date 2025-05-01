package practiceAssignments;

public class MethodsVarObj {
	
	String watch = "tv in the hall and accessible by family and guests"; // global variable
	
	public void watch1(){  // private method
		String var = "Tv in the bedroom is private for the family";
		System.out.println(var);
	}
	
	public void study() { // private method
		int books = 2;
		System.out.println("a person from the family can read the "+books+ " books in the study room");
	}

	public static void main(String[] args) {
		
		System.out.println("This is in the main method");
		
		MethodsVarObj obj = new MethodsVarObj();
		System.out.println(obj.watch);
		obj.watch1();
		obj.study();
		
		
		
		
	}

}
