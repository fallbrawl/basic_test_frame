package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.AdminMainPage;
import com.swat.staticdata.UserStorage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alex on 13.03.17.
 */

public class AdminPanelSearchUserByEmail extends BaseTestCase {

    final static String emailSearch = "test1@test1.test1";

    @Test
    public void adminPanelSearchUserByEmail() throws InterruptedException {
    	AdminMainPage adminMainPage = BasePage.create(getDriver(),AdminMainPage.class);
        adminMainPage.open();
        adminMainPage.searchAs(UserStorage.email);

        Assert.assertEquals(emailSearch, adminMainPage.isUserFound(), "Email " + emailSearch + " succesfully found!");		
    }	
	
}
