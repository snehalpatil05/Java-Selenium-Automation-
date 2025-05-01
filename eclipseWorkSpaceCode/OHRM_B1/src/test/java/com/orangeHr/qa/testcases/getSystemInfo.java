package com.orangeHr.qa.testcases;

public class getSystemInfo {

	public static void main(String[] args) {
		
//		System.getProperties().list(System.out);
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		
	}
}
