package com.swat.example.tests;

import org.testng.annotations.Test;
import com.swat.BasePage;
import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminServicesPage;

/**
 * Created by Alex on 04.04.17.
 */

public class AdminCreateRestaurantServicesTest extends BaseTestCase {

    @Test
    public void adminCreateRestaurantServicesTest() throws InterruptedException {

        AdminRestaurantPage adminRestaurantPage = BasePage.create(getDriver(),AdminRestaurantPage.class);
        /*Services Page*/
        AdminServicesPage adminServicesPage = adminRestaurantPage.adminServicesTab();
        adminServicesPage.createWifiService();

    }

}