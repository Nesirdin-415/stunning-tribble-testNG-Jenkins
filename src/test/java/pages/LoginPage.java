package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiesz.BaseClass;

public class LoginPage {

	public LoginPage() {

		PageFactory.initElements(BaseClass.getDriver(), this);

	}

	@FindBy(name = "username")
	public WebElement userTextBox;

	@FindBy(name = "password")
	public WebElement passwordTextBox;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public WebElement LoginButton;

	public void loginMethod() {

		userTextBox.sendKeys(BaseClass.getProperty("username"));
		passwordTextBox.sendKeys(BaseClass.getProperty("password"));
		LoginButton.click();
	} 
} 



