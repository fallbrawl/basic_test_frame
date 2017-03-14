package com.swat.example.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.AdminMainPage;

/**
 * Created by Alex on 13.03.17.
 */

public class AdminPanelSearchUserByEmail extends BaseTestCase {

    private UserData email = new UserData("test1@test1.test1");
    @Test
    public void adminPanelSearchUserByEmail(){
    	AdminMainPage adminMainPage = BasePage.create(getDriver(),AdminMainPage.class);
        adminMainPage.open();
        adminMainPage.searchAs(email); 
//		assertTrue(adminMainPage.isUserFound().contains("test1@test1.test1"));
		adminMainPage.isUserFound();		
    }	
	
}
