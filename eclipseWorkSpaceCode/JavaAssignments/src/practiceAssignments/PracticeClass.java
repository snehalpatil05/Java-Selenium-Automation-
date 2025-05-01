package practiceAssignments;

public class PracticeClass {
	
	public static void main(String[] args) {
		
//		for(int i=0; i<10; i++) {
//			for(int j=9; j>=0; j--) {
//				if(i==9-j) {
//				System.out.println(i+" "+j);
//				}
//			}
//		}
		
//		for(int i = 0, j = 9; i<10; i++, j--) {
//			System.out.println(i+" "+j);	
//		}
		
		
//*****
//****
//***
//**
//*
		for(int i=5; i>0; i--) { //rows
			for(int j=1; j<=i; j++) { //Stars
				System.out.print("*");				
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
//*
//**
//***
//****
//*****
		
		for(int i=1; i<=5; i++) { //rows
			for(int j=1; j<=i; j++) { //Stars
				System.out.print("*");				
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
	
	}

}
	
