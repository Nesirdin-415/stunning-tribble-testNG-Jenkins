package Utilitiesz;

import org.testng.annotations.BeforeMethod;

import pages.AdminPage;
import pages.LoginPage;
import pages.navigationMenuPage;

public class PageInitializer extends BaseClass {
	
	public static LoginPage lp;
	public static navigationMenuPage nmp;
	public static AdminPage ap;
	//nationalityPage np;
	
	@BeforeMethod
	public static void initialize() {
		
	
		lp = new LoginPage(); 
		nmp = new navigationMenuPage();
		ap = new AdminPage();
	 //   np= new nationalityPage();
			}
	
	
	
	

}
