package com.swat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

public class AdminMainPage extends BasePage {

	@FindBy(id = "admin5")
	private WebElement userNameSurname;

	@FindBy(id = "admin6")
	private WebElement searchInput;
	
	@FindBy(id = "admin13")
	private WebElement btnAdminMenuLogout;	
	
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
		return userNameSurname.getText();		
	}
	public AdminMainPage loginAs(UserData admin) {
		// TODO Auto-generated method stub
		return null;
	}
	
    public void adminMenuLogout() throws InterruptedException {
        btnAdminMenuLogout.click();

    }	

	//Set email in searchInput
	public AdminMainPage searchAs(UserData email) throws InterruptedException  {
		getForm().set(searchInput, email.getEmail());
        Thread.sleep(500);
		return BasePage.create(driver, AdminMainPage.class);
	}	
    //Check the user is found
/*	public Boolean isUserFound() {
		return (new WebDriverWait(driver, 20)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return emailUserFound.getText().contains("test1@test1.test1");
            }
        });	
	}*/
    public String isUserFound() {
        return emailUserFound.getText();
    }	
	
	//Delete user
	public AdminMainPage delete() throws InterruptedException {
		deleteButton.click();
		confirmButton.click();
        Thread.sleep(500);		
		return BasePage.create(driver, AdminMainPage.class);
	}	

	//Check the user is NOT found (is deleted)
    public String isDeletedUserFound() {
        return dataNotFound.getText();
    }	
	
	
}
