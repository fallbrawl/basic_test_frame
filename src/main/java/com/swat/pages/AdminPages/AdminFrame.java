package com.swat.pages.AdminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swat.BasePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

public class AdminFrame extends BasePage {
	
	@FindBy(id = "admin13")
	private WebElement btnAdminMenuLogout;		

	public AdminFrame(WebDriver driver, PageTitle title, PageUrl pageUrl) {
		super(driver, title, pageUrl);
	}

    public void adminMenuLogout() throws InterruptedException {
        btnAdminMenuLogout.click();

    }

	
	
}
