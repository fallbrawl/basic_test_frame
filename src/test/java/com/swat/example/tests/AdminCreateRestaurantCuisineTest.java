package com.swat.example.tests;

import org.testng.annotations.Test;
import com.swat.BasePage;
import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminCuisinePage;

/**
 * Created by Alex on 04.04.17.
 */

public class AdminCreateRestaurantCuisineTest extends BaseTestCase {

    @Test
    public void adminCreateRestaurantCuisineTest() throws InterruptedException {

        AdminRestaurantPage adminRestaurantPage = BasePage.create(getDriver(),AdminRestaurantPage.class);
	        /*Cuisine Page*/
        AdminCuisinePage adminCuisinePage = adminRestaurantPage.adminCuisineTab();
        adminCuisinePage.createArmenianCuisine();

    }

}