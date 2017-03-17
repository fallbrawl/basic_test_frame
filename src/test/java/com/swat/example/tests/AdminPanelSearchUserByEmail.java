package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.AdminPages.Settings.AdminUsersPage;
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
    	AdminUsersPage adminUsersPage = BasePage.create(getDriver(),AdminUsersPage.class);
        adminUsersPage.open();
        adminUsersPage.searchAs(UserStorage.email);

        Assert.assertEquals(emailSearch, adminUsersPage.isUserFound(), "Email " + emailSearch + " succesfully found!");		
    }	
	
}
