package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.UserPages.RestaurantPages.RestaurantOverviewPage;
import com.swat.pages.UserPages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 10.04.17.
 */
public class UserAddToBookmarksTest extends BaseTestCase {
    @Test
    public void userAddToBookmarksTest() throws InterruptedException {

        SearchResultsPage searchResultsPage = BasePage.create(getDriver(), SearchResultsPage.class);
        RestaurantOverviewPage restaurantOverviewPage = searchResultsPage.openRestaurant();

        restaurantOverviewPage.addToBookmarks();

        Assert.assertTrue(restaurantOverviewPage.isAddedToBookmarks());

    }
}
