package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.MainPage;
import org.testng.annotations.Test;

/**
 * Created by paul on 07.03.17.
 */
public class AdminPanelAuthorizeTest extends BaseTestCase {

    private UserData admin = new UserData("admin", "admin");
    @Test
    public void adminPanelAuthorizeTest(){
        MainPage mainPage = BasePage.create(getDriver(),MainPage.class);
        mainPage.open();
        

    }

}
