package com.swat.example.tests;

import org.testng.annotations.Test;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.AdminMainPage;

/**
 * Created by Alex on 13.03.17.
 */

public class AdminPanelDeleteUser extends BaseTestCase {

//  private UserData email = new UserData("test1@test1.test1");
    @Test
    public void adminPanelDeleteUser(){
    	AdminMainPage adminMainPage = BasePage.create(getDriver(),AdminMainPage.class);
//      adminMainPage.open();       

    	adminMainPage.isUserFound();
        adminMainPage.delete();       
        
		adminMainPage.isDeletedUserFound();		
    }	
	
}
