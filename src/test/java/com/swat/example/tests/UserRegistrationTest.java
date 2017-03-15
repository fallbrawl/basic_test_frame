package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.pages.MainPage.MainPage;
import com.swat.pages.MainPage.RegistrationFormMainPage;
import com.swat.pages.MainPage.SwitchFormMainPage;
import org.testng.annotations.Test;

/**
 * Created by paul on 13.03.17.
 */
public class UserRegistrationTest extends BaseTestCase {

    private UserData user = new UserData("First", "Last", "test1@test1.test1", "111111");

    @Test

    public void userRegistrationTest() throws InterruptedException {

        MainPage mainPage = BasePage.create(getDriver(),MainPage.class);
        mainPage.open();

        SwitchFormMainPage switchFormMainPage = mainPage.openLoginPane();
        RegistrationFormMainPage registrationFormMainPage = (RegistrationFormMainPage) switchFormMainPage.chooseLoginOrRegistrationVariant("registration");

        registrationFormMainPage.registerAs(user);

        //Assert.assertEquals(userName, mainPage.getUserName(), "User succesfully logged in!");

    }
}
