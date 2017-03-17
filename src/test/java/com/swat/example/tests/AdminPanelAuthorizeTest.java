package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.AdminPages.BackendLoginPage;
import com.swat.pages.AdminPages.Settings.AdminUsersPage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/**
 * Created by Alex on 10.03.17.
 */

public class AdminPanelAuthorizeTest extends BaseTestCase {

    final static String userNameSurname = "Name Surname";	
    private UserData admin = new UserData("environmentfortesting@gmail.com", "111111");
    
    @Test
    public void adminPanelAuthorizeTest(){
    	BackendLoginPage backendLoginPage = BasePage.create(getDriver(),BackendLoginPage.class);
        backendLoginPage.open();
        
		AdminUsersPage adminMainPage = backendLoginPage.loginAs(admin);
		assertTrue(adminMainPage.isLoggedIn().contains(userNameSurname));
           
    }

}
