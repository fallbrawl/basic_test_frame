package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.UserPages.MainPage;
import com.swat.pages.UserPages.MainPageForms.RegistrationFormMainPage;
import com.swat.pages.UserPages.MainPageForms.SwitchFormMainPage;
import com.swat.staticdata.UserStorage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 13.03.17.
 */
public class UserRegistrationTest extends BaseTestCase {

    final static String userName = "First";

    @Test

    public void userRegistrationTest() throws InterruptedException {

        MainPage mainPage = BasePage.create(getDriver(),MainPage.class);
        mainPage.open();

        SwitchFormMainPage switchFormMainPage = mainPage.openLoginPane();

        RegistrationFormMainPage registrationFormMainPage = (RegistrationFormMainPage) switchFormMainPage.chooseLoginOrRegistrationVariant("registration");

        registrationFormMainPage.registerAs(UserStorage.userForRegistration);

        Assert.assertEquals(userName, mainPage.getUserName(), "User " + userName + " succesfully registered!");

        mainPage.logout();
        Thread.sleep(500);
        
    }
}
