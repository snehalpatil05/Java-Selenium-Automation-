package MyTestNG;

import org.testng.annotations.Test;
import org.testng.Assert;

public class MyDependencyTest {
	
	
	
	@Test(dependsOnMethods={"mySetup"})
	public void test1() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("my test method1");
	}
	
	@Test(dependsOnMethods={"test2"})
	public void test2() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("my test method2");
	}
	
	@Test
	public void mySetup() throws InterruptedException{
		System.out.println(" in setup ");
		Assert.assertTrue(true);
		Thread.sleep(2000);
	}
}
