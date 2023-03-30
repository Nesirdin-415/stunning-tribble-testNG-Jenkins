package testCases;

import Utilitiesz.BaseClass;
import Utilitiesz.CommonMethods;
import pages.LoginPage;

public class testingCommonMethods {
	
	static LoginPage lp;

    public static void main(String[] args) {
    	
        lp= new LoginPage();
        
        CommonMethods.sendText(lp.userTextBox, BaseClass.getProperty("username"));
        
     //   CommonMethods.waitForClickability(lp.LoginButton);
       CommonMethods.click(lp.LoginButton);
}
}
