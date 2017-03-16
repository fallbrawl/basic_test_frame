package com.swat.example.tests.Examples;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.example.tests.BaseTestCase;
import com.swat.pages.Examples.AdminHomePage;
import com.swat.pages.Examples.AdminLoginPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginPositiveTest extends BaseTestCase {

	private UserData admin = new UserData("admin", "admin");
	
	@Test(enabled = false)
	public void loginAsAdminPositive() {
		AdminLoginPage adminLoginPage = BasePage.create(getDriver(), AdminLoginPage.class);
		adminLoginPage.open();
		AdminHomePage adminHomePage = adminLoginPage.loginAs(admin);
		assertTrue(adminHomePage.isLoggedIn());
	}
	
}
