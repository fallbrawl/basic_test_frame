package com.swat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

public class AdminMainPage extends BasePage {

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div/b")
	private WebElement linkSignOut;

	public AdminMainPage(WebDriver driver) {
		super(driver, PageTitle.ADMIN_MAIN_PAGE, PageUrl.ADMIN_MAIN_PAGE);
	}

	public /*Boolean*/ String isLoggedIn() {
//		return linkSignOut.isDisplayed();	
		return linkSignOut.getText();		
	}

	public AdminMainPage loginAs(UserData admin) {
		// TODO Auto-generated method stub
		return null;
	}	
}
