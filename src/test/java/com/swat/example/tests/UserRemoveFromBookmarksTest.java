package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.UserPages.RestaurantPages.RestaurantOverviewPage;
import com.swat.pages.UserPages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alex on 12.04.17.
 */
public class UserRemoveFromBookmarksTest extends BaseTestCase {
    @Test
    public void userRemoveFromBookmarksTest() throws InterruptedException {

        SearchResultsPage searchResultsPage = BasePage.create(getDriver(), SearchResultsPage.class);
        RestaurantOverviewPage restaurantOverviewPage = searchResultsPage.openRestaurant();

        restaurantOverviewPage.addToBookmarks();

        Assert.assertFalse(restaurantOverviewPage.isAddedToBookmarks());

    }
}
