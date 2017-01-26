package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.AdminHomePage;
import com.swat.pages.AdminLoginPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginPositiveTest extends BaseTestCase {

	private UserData admin = new UserData("admin", "admin");
	
	@Test
	public void loginAsAdminPositive() {
		AdminLoginPage adminLoginPage = BasePage.create(getDriver(), AdminLoginPage.class);
		adminLoginPage.open();
		AdminHomePage adminHomePage = adminLoginPage.loginAs(admin);
		assertTrue(adminHomePage.isLoggedIn());
	}
	
}
