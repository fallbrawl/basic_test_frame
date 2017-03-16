package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.MainPage.MainPage;
import com.swat.pages.MainPage.RegistrationFormMainPage;
import com.swat.pages.MainPage.SwitchFormMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 13.03.17.
 */
public class UserRegistrationTest extends BaseTestCase {

    final static String userName = "First";
    private UserData user = new UserData("First", "Last", "test1@test1.test1", "111111", "+380501234567", "21", "май", "1950", "female");

    @Test

    public void userRegistrationTest() throws InterruptedException {

        MainPage mainPage = BasePage.create(getDriver(),MainPage.class);
        mainPage.open();

        SwitchFormMainPage switchFormMainPage = mainPage.openLoginPane();

        RegistrationFormMainPage registrationFormMainPage = (RegistrationFormMainPage) switchFormMainPage.chooseLoginOrRegistrationVariant("registration");

        registrationFormMainPage.registerAs(user);

        Assert.assertEquals(userName, mainPage.getUserName(), "User " + userName + " succesfully registered!");

        mainPage.logout();
        Thread.sleep(500);
        
    }
}
