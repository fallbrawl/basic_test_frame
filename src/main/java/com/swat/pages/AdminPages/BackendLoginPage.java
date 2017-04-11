package com.swat.pages.AdminPages;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.AdminPages.Settings.AdminUsersPage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Alex on 10.03.17.
 */
public class BackendLoginPage extends BasePage {

	@FindBy(id = "admin1")
	private WebElement fieldEmail;
	@FindBy(id = "admin2")
	private WebElement fieldPassword;


	public BackendLoginPage(WebDriver driver) {
		super(driver, PageTitle.BACKEND_LOGIN_PAGE, PageUrl.BACKEND_LOGIN_PAGE);
	}

	//Set email and password in textbox and click on button

	public AdminUsersPage loginAs(UserData admin) {
		getForm().set(fieldEmail, admin.getEmail()).set(fieldPassword, admin.getPassword()).submit();
		return BasePage.create(driver, AdminUsersPage.class);
	}

}
