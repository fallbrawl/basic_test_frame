package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.UserPages.MainPageForms.LoginFormMainPage;
import com.swat.pages.UserPages.MainPage;
import com.swat.pages.UserPages.MainPageForms.SwitchFormMainPage;
import com.swat.staticdata.UserStorage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 10.03.17.
 */
public class UserAuthorizeTest extends BaseTestCase {

    final static String userName = "First";


    @Test

    public void userAuthorizeTest() throws InterruptedException {

        MainPage mainPage = BasePage.create(getDriver(),MainPage.class);
        mainPage.open();

        SwitchFormMainPage switchFormMainPage = mainPage.openLoginPane();
        LoginFormMainPage loginFormMainPage = (LoginFormMainPage) switchFormMainPage.chooseLoginOrRegistrationVariant("loginThroughEmail");
        loginFormMainPage.loginAs(UserStorage.userForLogin);

        Assert.assertEquals(userName, mainPage.getUserName(), "User succesfully logged in!");

    }
}
