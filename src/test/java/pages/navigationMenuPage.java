package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiesz.BaseClass;

public class navigationMenuPage {

	// this constructor/factory utilise by annotation store webElements to call it
	// from different interfaces

	public navigationMenuPage() {

		PageFactory.initElements(BaseClass.getDriver(), this);

	}
	 
	
    
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li")
	public List<WebElement> leftMenuBar;
	
	

	public void chooseleftMenuBarOption(String menuValue) {

		for (WebElement eachMenuOption :leftMenuBar) {
		
		

			if (eachMenuOption.getText().equalsIgnoreCase(menuValue)) {
				eachMenuOption.click();
				
			//	System.out.println(eachMenuOption.getText());
				break;
			}

		} 

	} 
}
