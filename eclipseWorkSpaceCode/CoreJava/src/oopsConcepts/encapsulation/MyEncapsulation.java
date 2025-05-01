package oopsConcepts.encapsulation;

public class MyEncapsulation {

	// to make the java class fully encapsulated we use private access specifier.
	private String fname;
	private String lname;
	private String mobile;
	// few more fields added
	private String address;
	private String email;
	private int age;
	
	// setter and getter method  - For one variable we create 2 methods.
	// one to set the value and another to get the value
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
