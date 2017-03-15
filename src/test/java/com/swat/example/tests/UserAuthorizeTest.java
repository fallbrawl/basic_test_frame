package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.MainPage.LoginFormMainPage;
import com.swat.pages.MainPage.MainPage;
import com.swat.pages.MainPage.SwitchFormMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 10.03.17.
 */
public class UserAuthorizeTest extends BaseTestCase {

    final static String userName = "First";
    private UserData user = new UserData("test1@test1.test1", "111111");

    @Test

    public void userAuthorizeTest() throws InterruptedException {

        MainPage mainPage = BasePage.create(getDriver(),MainPage.class);
        mainPage.open();

        SwitchFormMainPage switchFormMainPage = mainPage.openLoginPane();
        LoginFormMainPage loginFormMainPage = (LoginFormMainPage) switchFormMainPage.chooseLoginOrRegistrationVariant("loginThroughEmail");
        loginFormMainPage.loginAs(user);

        Assert.assertEquals(userName, mainPage.getUserName(), "User succesfully logged in!");

    }
}
