package com.swat.pages.AdminPages.Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.AdminPages.AdminFrame;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

/**
 * Created by Alex on 13.03.17.
 */

public class AdminUsersPage extends AdminFrame {

	@FindBy(id = "admin5")
	private WebElement userNameSurname;

	@FindBy(id = "admin6")
	private WebElement searchInput;

	@FindBy(xpath = "//table/tbody/tr/td[3]")
	private WebElement emailUserFound;

	@FindBy(xpath = "//table/tbody[1]/tr/td[10]/div/div/a[3]/i")
	private WebElement deleteButton;

	@FindBy(xpath = "//table/tbody/tr/td[10]/div/div/div[2]/div/div/div[3]/button[2]")
	private WebElement confirmButton;

	@FindBy(xpath = "//table/tbody/tr/td")
	private WebElement dataNotFound;


	public AdminUsersPage(WebDriver driver) {
		super(driver);
	}

	public /*Boolean*/ String isLoggedIn() {
		return userNameSurname.getText();
	}
	public AdminUsersPage loginAs(UserData admin) {
		// TODO Auto-generated method stub
		return null;
	}


	//Set email in searchInput
	public AdminUsersPage searchAs(UserData email) throws InterruptedException  {
		getForm().set(searchInput, email.getEmail());
		Thread.sleep(1000);
		return BasePage.create(driver, AdminUsersPage.class);
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
	public AdminUsersPage delete() throws InterruptedException {
		deleteButton.click();
		confirmButton.click();
		Thread.sleep(500);
		return BasePage.create(driver, AdminUsersPage.class);
	}

	//Check the user is NOT found (is deleted)
	public String isDeletedUserFound() {
		return dataNotFound.getText();
	}


}