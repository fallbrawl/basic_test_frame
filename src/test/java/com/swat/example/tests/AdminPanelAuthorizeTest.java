package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.AdminMainPage;
import com.swat.pages.BackendLoginPage;
import com.swat.pages.MainPage;
import com.swat.pages.Examples.AdminHomePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * Created by paul on 07.03.17.
 */

public class AdminPanelAuthorizeTest extends BaseTestCase {

    private UserData admin = new UserData("environmentfortesting@gmail.com", "111111");
    @Test
    public void adminPanelAuthorizeTest(){
    	BackendLoginPage backendLoginPage = BasePage.create(getDriver(),BackendLoginPage.class);
        backendLoginPage.open();
        
		AdminMainPage adminMainPage = backendLoginPage.loginAs(admin);
		assertTrue(adminMainPage.isLoggedIn().contains("Name Surname"));		
           
    }

}
