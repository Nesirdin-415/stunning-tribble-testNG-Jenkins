package package1Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {

	@Test
	public void test1() {
		
		System.out.println("Inside test1");
		AssertJUnit.assertTrue(true);
	}
	
	
	@Test(dependsOnMethods = {"test1", "test4"})
	//@Test(dependsOnMethods = {"test1"})
	public void test2() {
		
		System.out.println("Inside test2");
		
	}
	
	
	

	@Test(dependsOnMethods = "test2")
	public void test3() {
		
		System.out.println("Inside test3");
		
	}
	@Test
	public void test4() {
		
		System.out.println("Inside test4");
		AssertJUnit.assertTrue(true);
	}
	
}
