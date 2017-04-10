package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.UserPages.MainPage;
import com.swat.pages.UserPages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 23.03.17.
 */
public class UserKitchenFilterTest extends BaseTestCase {

    @Test

    public void userKitchenFilterTest() throws InterruptedException {

        MainPage mainPage = BasePage.create(getDriver(),MainPage.class);
        mainPage.open();

        mainPage.selectCity("Одесса");
        SearchResultsPage searchResultsPage = mainPage.searchFor("");

        searchResultsPage.selectKitchen("Армянская");
        Assert.assertTrue(searchResultsPage.isRestarauntPresent());

    }
}
