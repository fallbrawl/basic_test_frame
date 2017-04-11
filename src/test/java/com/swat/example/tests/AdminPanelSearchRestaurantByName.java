package com.swat.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.swat.BasePage;
import com.swat.pages.AdminPages.Restaurants.AdminListPage;
import com.swat.pages.AdminPages.Settings.AdminUsersPage;
import com.swat.staticdata.RestaurantStorage;

/**
 * Created by Alex on 04.04.17.
 */

public class AdminPanelSearchRestaurantByName extends BaseTestCase {

    final static String restaurantNameSearch = "Тестовый ресторан";

    @Test
    public void adminPanelSearchRestaurantByName() throws InterruptedException {
    	/*Admin User Page*/
        AdminUsersPage adminUsersPage = BasePage.create(getDriver(),AdminUsersPage.class);
        adminUsersPage.adminMenuRestaurants();
       	/*Admin Restaurant List Page*/
        AdminListPage adminListPage = adminUsersPage.adminMenuDropdownList();
        adminListPage.searchAs(RestaurantStorage.restaurantNameRu);
        Assert.assertEquals(restaurantNameSearch, adminListPage.isRestaurantFound(), "Name of the restaurant " + restaurantNameSearch + " succesfully found!");

        adminUsersPage.adminMenuLogout();
    }

}