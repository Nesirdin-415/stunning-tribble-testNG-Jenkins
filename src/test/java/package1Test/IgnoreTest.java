package package1Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	
	String message ="juret aka";
	String name = "Rimer";
	
	@Test (enabled = false) 
	public void testPrint0() {
		
		System.out.println(message);
		
	}
	
	
	
	@Test (enabled = true, groups = "smokeTestSuite")
	public void testPrint() {
		
		System.out.println(message);
		
	}
	
	@Test(groups = "smokeTestSuite")
	public void testPrint2() {
		
		System.out.println("Second Test -- " + name);
		
	}
}
