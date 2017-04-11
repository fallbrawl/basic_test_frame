package com.swat.example.tests;

import org.testng.annotations.Test;
import com.swat.BasePage;
import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminTypePage;

/**
 * Created by Alex on 04.04.17.
 */

public class AdminCreateRestaurantTypeTest extends BaseTestCase {

    @Test
    public void adminCreateRestaurantTypeTest() throws InterruptedException {

        AdminRestaurantPage adminRestaurantPage = BasePage.create(getDriver(),AdminRestaurantPage.class);
        /*Type Page*/
        AdminTypePage adminTypePage = adminRestaurantPage.adminTypeTab();
        adminTypePage.createRestaurantType();

    }

}