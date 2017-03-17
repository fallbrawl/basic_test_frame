package com.swat.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.swat.BasePage;
import com.swat.pages.AdminPages.Settings.AdminUsersPage;

/**
 * Created by Alex on 13.03.17.
 */

public class AdminPanelDeleteUser extends BaseTestCase {

    final static String message = "Данные не найдены.";	
    
    @Test
    public void adminPanelDeleteUser() throws InterruptedException {
    	AdminUsersPage adminUsersPage = BasePage.create(getDriver(),AdminUsersPage.class);
        adminUsersPage.delete();       
     
        Assert.assertEquals(message, adminUsersPage.isDeletedUserFound(), "User was deleted!");	
        
        adminUsersPage.adminMenuLogout();

    }	
	
}
