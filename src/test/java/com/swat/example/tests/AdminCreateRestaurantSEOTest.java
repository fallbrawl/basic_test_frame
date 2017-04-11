package com.swat.example.tests;

import org.testng.annotations.Test;

import com.swat.BasePage;
import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminSEOPage;

/**
 * Created by Alex on 04.04.17.
 */

public class AdminCreateRestaurantSEOTest extends BaseTestCase {

    @Test
    public void adminCreateRestaurantSEOTest() throws InterruptedException {

        AdminRestaurantPage adminRestaurantPage = BasePage.create(getDriver(),AdminRestaurantPage.class);
	        /*SEO Page*/
        AdminSEOPage adminSEOPage = adminRestaurantPage.adminSEOTab();
        adminSEOPage.createSEO();

    }

}