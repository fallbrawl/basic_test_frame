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

    RestaurantData restaurant = new RestaurantData("Вай-фай", "restaurant1@restaurant1.restaurant1", "Текст описания ресторана", "Кухня", "+380501234567", "Одесса, Конная, 1", "restaurant1.od.ua");

    @Test
    public void restaurantDataTest() throws InterruptedException {
        SearchResultsPage searchResultsPage = BasePage.create(getDriver(), SearchResultsPage.class);
        RestaurantOverviewPage restaurantOverviewPage = searchResultsPage.openRestaurant();
        restaurantOverviewPage.getTrait();

        Assert.assertEquals(restaurantOverviewPage.getTrait(), restaurant.getTraits());
        Assert.assertEquals(restaurantOverviewPage.getPhone(), restaurant.getTelephoneNumber());
        Assert.assertEquals(restaurantOverviewPage.getCuisine(), restaurant.getCuisine());
        Assert.assertEquals(restaurantOverviewPage.getDescription(), restaurant.getDescription());
        Assert.assertEquals(restaurantOverviewPage.getWebsite(), restaurant.getWebsite());
        Assert.assertEquals(restaurantOverviewPage.getEmail(), restaurant.getEmail());



    }
}
