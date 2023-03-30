package package1Test;

import org.testng.annotations.Test;

public class descriptionTest {
	
	
	
	/*
	 Authored : Nesirdin
	 Edited: Edie
	 */
	
	@Test (description= "Checking for engine light status")
	public void Test1() {
		
	}

	@Test (timeOut= 3000) //especially (API testing) test should be run within this time 
	                       //otherwise runOUt/stop and move on next
	public void Test2() {

}
}
