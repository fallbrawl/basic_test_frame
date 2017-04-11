package com.swat.example.tests;

import org.testng.annotations.Test;

import com.swat.BasePage;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminGeneralPage;
import com.swat.pages.AdminPages.Restaurants.AdminListPage;
import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;
import com.swat.pages.AdminPages.Settings.AdminUsersPage;
import com.swat.staticdata.RestaurantStorage;

/**
 * Created by Alex on 23.03.17.
 */

public class AdminCreateRestaurantGeneralTest extends BaseTestCase {

    @Test
    public void adminCreateRestaurantGeneralTest() throws InterruptedException {

        AdminUsersPage adminUsersPage = BasePage.create(getDriver(),AdminUsersPage.class);
        adminUsersPage.adminMenuRestaurants();

        AdminListPage adminListPage = adminUsersPage.adminMenuDropdownList();

        /*Restaurant Page*/
        AdminRestaurantPage adminRestaurantPage = adminListPage.adminMenuAdd();

        /*General Page*/
        AdminGeneralPage adminGeneralPage = adminRestaurantPage.adminGeneralTab();
        adminGeneralPage.createRestaurantGeneral(RestaurantStorage.restaurantForRegistrationGeneral);

    }

}