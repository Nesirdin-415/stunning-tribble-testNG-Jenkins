package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilitiesz.BaseClass;
import Utilitiesz.CommonMethods;
import pages.AdminPage;
import pages.LoginPage;
import pages.nationalityPage;
import pages.navigationMenuPage;

public class LoginTestCases extends CommonMethods {

	
	
	@BeforeMethod
	public void beforeTest() {
		
		BaseClass.getDriver();
		
			}

	@Test
	public void testAdminSystemUserSearch() throws InterruptedException  { 

//		lp.userTextBox.sendKeys(BaseClass.getProperty("username"));
//		lp.passwordTextBox.sendKeys(BaseClass.getProperty("password"));
//		lp.LoginButton.click();
		
		
		lp.loginMethod();
		nmp.chooseleftMenuBarOption(BaseClass.getProperty("admin"));
		ap.systemUsersUsernameTextBox.sendKeys(BaseClass.getProperty("SystemUserUsername"));
        ap.userRoleDropDownToExpand.click();
        ap.chooseUserRoleOption(BaseClass.getProperty("SystemRole"));
        
        ap.statusDropDownToExpand.click();
        ap.chooseUserRoleOption(BaseClass.getProperty("enabled"));
        ap.SearchButton.click();
        
        Assert.assertTrue(ap.recordsTable.size()==1);
        
        //nationality page test code,optional
        /*   np.nationalitiesButton.click();
         np.AddButon.click();
         String Nationality ="Aryan";
         np.sendKeyBox.sendKeys(BaseClass.getProperty(Nationality));
         np.SaveButon.click();
       
         
         
        //nationality page test code//she
        	ap.nationalitiesButton.click();
        String nationality = "Aussila";
        ap.addNationality(nationality);
      //  ap.saveButton.click();
     
        ap.deleteNationality(nationality);
      //  ap.confirmButton.click();
        Thread.sleep(3000);
      */   
        
        
      
      
  
   
        //	Assert.assertTrue(ap.recordsTable.size()!=1);
        
	}   
        
}  
	












