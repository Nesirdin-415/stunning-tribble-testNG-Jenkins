package package1Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizedTest1 {

	@Test
	@Parameters("myName")
	public void parameterTest(String myName) {
		System.out.println("Parameterized value is : " + myName);
	}
	
	
	@Test
	@Parameters("myCareer")
	public void parameterTest1(String myCareer) {
		System.out.println("Parameterized value is : " + myCareer);
	}
	
	@Test
	@Parameters({ "suite-param" })

	   public void parameterTestOne(String param) {
	   System.out.println("Test one suite param is: " + param);
	}
	
	
}
