package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.UserPages.RestaurantPages.RestaurantOverviewPage;
import com.swat.pages.UserPages.RestaurantPages.RestaurantPhotoPage;
import com.swat.pages.UserPages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 05.04.17.
 */
public class UserAddPhotoTest extends BaseTestCase {
    @Test
    public void userAddPhotoTest(){
        SearchResultsPage searchResultsPage = BasePage.create(getDriver(), SearchResultsPage.class);
        RestaurantOverviewPage restaurantOverviewPage = searchResultsPage.openRestaurant();

        RestaurantPhotoPage restaurantPhotoPage = restaurantOverviewPage.openPhotos();
        restaurantPhotoPage.addPhoto();

        Assert.assertTrue(restaurantPhotoPage.isUploaded());

    }
}
