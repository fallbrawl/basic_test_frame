package com.swat.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.swat.BasePage;
import com.swat.pages.AdminMainPage;

/**
 * Created by Alex on 13.03.17.
 */

public class AdminPanelDeleteUser extends BaseTestCase {

    final static String message = "Данные не найдены.";	
    
    @Test
    public void adminPanelDeleteUser() throws InterruptedException {
    	AdminMainPage adminMainPage = BasePage.create(getDriver(),AdminMainPage.class);
        adminMainPage.delete();       
     
        Assert.assertEquals(message, adminMainPage.isDeletedUserFound(), "User was deleted!");	
        
        adminMainPage.adminMenuLogout();

    }	
	
}
