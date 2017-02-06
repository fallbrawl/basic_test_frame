package com.swat.pages.Examples;

import com.swat.BasePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage extends BasePage {

	@FindBy(linkText = "Sign Out")
	private WebElement linkSignOut;

	public AdminHomePage(WebDriver driver) {
		super(driver, PageTitle.ADMIN_HOME, PageUrl.ADMIN_HOME);
	}

	public Boolean isLoggedIn() {
		return linkSignOut.isDisplayed();
	}

}
