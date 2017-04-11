package com.swat.example.tests;

import org.testng.annotations.Test;
import com.swat.BasePage;
import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;

/**
 * Created by Alex on 04.04.17.
 */

public class AdminCreateRestaurantSaveTest extends BaseTestCase {

    final static String buttonNameSearch = "Сохранить";

    @Test
    public void adminCreateRestaurantSaveTest() throws InterruptedException {

        AdminRestaurantPage adminRestaurantPage = BasePage.create(getDriver(),AdminRestaurantPage.class);
	        /*Restaurant Page*/
        adminRestaurantPage.clickSaveButton();

    }

}