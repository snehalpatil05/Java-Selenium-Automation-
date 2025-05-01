package classesObjectsMethods;

public class MethodsWithAllReturnTypes {
	
	//3 methods - isEven, toLowerCase, calculateAge
	//isEven returns boolean data type.
	
	public boolean isEven(int num) {
		
	boolean result;
	if(num%2==0) {
		result = true;
	}else {
		result = false;
	}
	return result;
	}
	
	public String toSmallerCase(String text) {
		String lowerText = text.toLowerCase();
		return lowerText;
	}
	
	public int calculateAge(int birthYear) {
		int age = 2025-birthYear;
		return age;
		
	}

}
