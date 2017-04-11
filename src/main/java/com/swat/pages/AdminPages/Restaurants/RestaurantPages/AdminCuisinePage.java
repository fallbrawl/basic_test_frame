package com.swat.pages.AdminPages.Restaurants.RestaurantPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;

/**
 * Created by Alex on 04.04.17.
 */

public class AdminCuisinePage extends AdminRestaurantPage {

    /*Armenian Cuisine*/
    @FindBy(name = "cuisines_list.0")
    private WebElement armenianCuisine;

    public AdminCuisinePage(WebDriver driver) {
        super(driver);
    }

    public void createArmenianCuisine() {
        armenianCuisine.click();
    }

}