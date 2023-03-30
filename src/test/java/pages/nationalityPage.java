package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiesz.BaseClass;

public class nationalityPage {

	public nationalityPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
}

@FindBy(xpath = "//*[@class='oxd-topbar-body']/nav/ul/li")
public List<WebElement> AdminPageMenuLists;

@FindBy(xpath = "//*[@class=\"oxd-table-body\"]/div")
public List<WebElement> NationalitiesList;


@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")
public WebElement nationalitiesButton;

@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--secondary'] ")
public WebElement AddButon;

@FindBy(xpath = "(//*[@id=\"app\"])/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]")
public WebElement sendKeyBox;

@FindBy(xpath = "//*[@type='submit']")
public WebElement SaveButon;

//@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[11]/div/div[3]/div/button[1]\n")//?
	//    public WebElement  deleteButton;

// @FindBy(xpath="//*[@id=\"app\"]/div[3]//div[3]/button[2]/i")
// public WebElement confirmButton;

public void AdminPageMenu(String PageValue) {
	 
    for (WebElement Nationalities:  AdminPageMenuLists) {
        System.out.println(Nationalities);
    	if( Nationalities.getText().equalsIgnoreCase(PageValue)) {
    		Nationalities.click();
    	
    		
    	for (WebElement Nationality :  NationalitiesList) {
    		 
        if (!Nationality.getText().contains("Aryan")) {
        	AddButon.click();
        	
        	sendKeyBox.sendKeys("Nationality");
        	SaveButon.click();
        	
        	
        } else {
        	
        	System.out.println("This nationality is "+ Nationality.getText());
            
            break;
        }
        
    }
    	}
    	 
    }
}
}

/*
 * public void deleteNationality(String targetNationality) {
         
         boolean targetFound = false;
         
         outer:
         for (int i = 0; i <= pages.size(); i++) {
             
             if (i!=0) nextPageButton.click();
             
             for (WebElement each: nationalitiesEachPage) {        
                    if (each.getText().contains(targetNationality)) {
                        System.out.println(each.getText());
                        each.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
                        BaseClass.getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
                        break outer;
                    } 
              }//div[@class='orangehrm-card-container']//input[@class='oxd-input oxd-input--active']  
 */









