package package1Test;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class dataProviderTesting {
	
	
//	@DataProvider(name = "names")
//	public String [][] dpMethod(){
//		return new  String [][] {{"Nesirdin"}, {"Ali"},{"Yummy"},{"false"},{"33"}};
//	}
//	
//	
//	
//	
//	@Test(dataProvider="names")
//	public void test(String val) {
//		System.out.println("The Parameter being passed is: -->" + val);
//	}
//	
	
	

	@DataProvider(name="names")
	public String  [][] dpMethod2(){
		return new String [][] {{"Nasa"},{"Skot"}};	
	}
	
	@Test(dataProvider="names")
	public void test1(String name) {
		System.out.println(name);
	}
	
	
	
	
	
	
//	@DataProvider(name = "names")
//    public Object[][] dpMethod1(){
//        return new Object[][] {{"Shafkat"}, {"Ali"}, {false}, {33}, {44.22}};
//    }
//    
//    
//    
//   
//    @Test(dataProvider="names")
//    public void myTest(Object val) {
//        System.out.println("The Parameter being passed is: --> " + val );
//    }
 
    
}
	
	
	

 
