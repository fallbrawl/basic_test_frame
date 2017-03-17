package com.swat.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swat.BasePage;
import com.swat.pages.UserPages.MainPage;

/**
 * Created by Alex on 16.03.17.
 */

public class UserMenuDropdownTest extends BaseTestCase {
	
	final static String ItemProfile = "Профиль";

    @Test
    public void userMenuDropdownTest() throws InterruptedException {

        MainPage mainPage = BasePage.create(getDriver(),MainPage.class);
        mainPage.menuDropDown();

        Assert.assertEquals(ItemProfile, mainPage.getItemProfileText(), "Item " + ItemProfile + " is present in the dropdown menu");

    }	
	
}
