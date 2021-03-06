package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.UserPages.MainPage;
import com.swat.pages.UserPages.UserCabinetPages.UserProfilePage;
import com.swat.staticdata.UserStorage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 16.03.17.
 */
public class UserProfileCheckTest extends BaseTestCase {

    @Test
    public void userProfileCheckTest() throws InterruptedException {

        MainPage mainPage = BasePage.create(getDriver(),MainPage.class);
        UserProfilePage userProfilePage = mainPage.getProfilePage();

        Assert.assertEquals(userProfilePage.getFieldFirstNameProfile(), UserStorage.userForRegistration.getFirstName());
        Assert.assertEquals(userProfilePage.getFieldLastNameProfile(), UserStorage.userForRegistration.getLastName());
        Assert.assertEquals(userProfilePage.getFieldEmailProfile(), UserStorage.userForRegistration.getEmail());
        Assert.assertEquals(userProfilePage.getFieldPhoneProfile(), UserStorage.userForRegistration.getTelephoneNumber());
        Assert.assertEquals(userProfilePage.getSex(),UserStorage.userForRegistration.getSex());

        //TODO: After fix bug add the date of birth

        userProfilePage.logout();
        Thread.sleep(500);
    }
}
