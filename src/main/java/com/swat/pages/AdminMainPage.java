package com.swat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

public class AdminMainPage extends BasePage {

	@FindBy(id = "admin5")
	private WebElement userNameSurname;

	@FindBy(id = "admin6")
	private WebElement searchInput;	
	
//	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div[4]/table/tbody/tr/td[3]")
	@FindBy(xpath = "//table/tbody/tr/td[3]")	
	private WebElement emailUserFound;	
	
//	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div[4]/table/tbody/tr/td[9]/div/a[3]/i")
	@FindBy(xpath = "//table/tbody/tr/td[9]/div/a[3]/i")
	private WebElement deleteButton;	
	
//	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div[4]/table/tbody/tr/td[9]/div/div[2]/div/div/div[3]/button[2]")
	@FindBy(xpath = "//table/tbody/tr/td[9]/div/div[2]/div/div/div[3]/button[2]")
	private WebElement confirmButton;	
	
//	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div[4]/table/tbody/tr/td")
	@FindBy(xpath = "//table/tbody/tr/td")	
	private WebElement dataNotFound;	
	
	
	public AdminMainPage(WebDriver driver) {
		super(driver, PageTitle.ADMIN_MAIN_PAGE, PageUrl.ADMIN_MAIN_PAGE);
	}

	public /*Boolean*/ String isLoggedIn() {
//		return linkSignOut.isDisplayed();	
		return userNameSurname.getText();		
	}
	public AdminMainPage loginAs(UserData admin) {
		// TODO Auto-generated method stub
		return null;
	}	

	//Set email in searchInput
	public AdminMainPage searchAs(UserData email) {
		getForm().set(searchInput, email.getEmail());
		return BasePage.create(driver, AdminMainPage.class);
	}	
    //Check the user is found
	public Boolean isUserFound() {
		return (new WebDriverWait(driver, 20)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return emailUserFound.getText().contains("test1@test1.test1");
            }
        });	
	}
	
	//Delete user
	public AdminMainPage delete() {
		deleteButton.click();
		confirmButton.click();
		return BasePage.create(driver, AdminMainPage.class);
	}	
    //Check the user is NOT found (is deleted)
	public Boolean isDeletedUserFound() {
		return (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return dataNotFound.getText().contains("Данные не найдены.");
            }
        });	
	}	
	
	
	
}
