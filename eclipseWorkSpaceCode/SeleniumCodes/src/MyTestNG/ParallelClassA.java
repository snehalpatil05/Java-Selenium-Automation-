package MyTestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelClassA {
	
	@Test
	public void myTest1() throws InterruptedException{
		System.out.println("ClassA : I am in test 1");
		Thread.sleep(3000);
	}
	
	@Test
	public void myTest2() throws InterruptedException{
		System.out.println("ClassA :  I am in test 2");
		Thread.sleep(3000);
	}
	
	@Test
	public void myTest3() throws InterruptedException{
		System.out.println("ClassA :  I am in test 3");
		Thread.sleep(3000);
	}
	
	@Test
	public void myTest4() throws InterruptedException{
		System.out.println("ClassA :  I am in test 4");
		Thread.sleep(3000);
	}
	
	@Test
	public void myTest5() throws InterruptedException{
		System.out.println("ClassA :  I am in test 5");
		Thread.sleep(3000);
	}

}
