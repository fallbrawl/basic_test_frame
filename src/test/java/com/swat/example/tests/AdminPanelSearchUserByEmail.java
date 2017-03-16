package com.swat.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.AdminMainPage;

/**
 * Created by Alex on 13.03.17.
 */

public class AdminPanelSearchUserByEmail extends BaseTestCase {

    final static String emailSearch = "test1@test1.test1";
    private UserData email = new UserData("test1@test1.test1");
    
    @Test
    public void adminPanelSearchUserByEmail() throws InterruptedException {
    	AdminMainPage adminMainPage = BasePage.create(getDriver(),AdminMainPage.class);
        adminMainPage.open();
        adminMainPage.searchAs(email); 

        Assert.assertEquals(emailSearch, adminMainPage.isUserFound(), "Email " + emailSearch + " succesfully found!");		
    }	
	
}
