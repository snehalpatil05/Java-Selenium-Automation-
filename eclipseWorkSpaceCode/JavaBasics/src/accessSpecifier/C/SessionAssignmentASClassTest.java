package accessSpecifier.C;


public class SessionAssignmentASClassTest {

	public static void main(String[] args) {
		
		
		accessSpecifier.A.SessionAssignmentASClass1 obj1 = new accessSpecifier.A.SessionAssignmentASClass1();  // specify the path of the package
		System.out.println(obj1.i);      // Package A 
		
		accessSpecifier.A.SessionAssignmentASClass2 obj2 = new accessSpecifier.A.SessionAssignmentASClass2();
		System.out.println(obj2.i);     // Package A 
		 
		accessSpecifier.B.SessionAssignmentASClass1 obj3 = new accessSpecifier.B.SessionAssignmentASClass1();
		System.out.println(obj3.i);     // Package B
 
		
	}

}


//Session assignment:
//
//in packageA -> create 3 classes:
//Class1 > create a public variable int i=10;
//Class2 > create a public variable int i=20;
//ClassTest > create obj1 of class1 & obj2 of class2 & access I values.
//
//
//
//In PackageB -->
//Class1 --> Public int i = 30;
//
//In packageC -->
//ClassTest ---> print all 3 i's output => 10, 20, 30
