package com.swat.pages.Examples;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;

public class AdminLoginPage extends BasePage {

	public AdminLoginPage(WebDriver driver) {
		super(driver, PageTitle.ADMIN_LOGIN, PageUrl.ADMIN_LOGIN);
	}

	public AdminHomePage loginAs(UserData admin) {
		getForm().set("username", admin.getEmail()).set("password", admin.getPassword()).submit();
		return BasePage.create(driver, AdminHomePage.class);
	}

}
