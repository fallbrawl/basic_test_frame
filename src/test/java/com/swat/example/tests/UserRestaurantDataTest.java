package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.data.RestaurantData;
import com.swat.pages.UserPages.RestaurantPages.RestaurantOverviewPage;
import com.swat.pages.UserPages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 24.03.17.
 */
public class UserRestaurantDataTest extends BaseTestCase {

    RestaurantData restaurant = new RestaurantData("Вай-фай", "+380501234567", "Армянская", "Текстовое описание о ресторане.", "restaurant1.od.ua", "restaurant1@restaurant1.restaurant1");

    @Test
    public void restaurantDataTest() throws InterruptedException {
        SearchResultsPage searchResultsPage = BasePage.create(getDriver(), SearchResultsPage.class);
        RestaurantOverviewPage restaurantOverviewPage = searchResultsPage.openRestaurant();
        restaurantOverviewPage.getTrait();

        Assert.assertEquals(restaurantOverviewPage.getTrait(), restaurant.getTraits());
        Assert.assertEquals(restaurantOverviewPage.getPhone(), restaurant.getRestaurantPhone());
        Assert.assertEquals(restaurantOverviewPage.getCuisine(), restaurant.getCuisine());
        Assert.assertEquals(restaurantOverviewPage.getDescription(), restaurant.getTextDescriptionRu());
        Assert.assertEquals(restaurantOverviewPage.getWebsite(), restaurant.getRestaurantSite());
        Assert.assertEquals(restaurantOverviewPage.getEmail(), restaurant.getRestaurantEmail());



    }
}
