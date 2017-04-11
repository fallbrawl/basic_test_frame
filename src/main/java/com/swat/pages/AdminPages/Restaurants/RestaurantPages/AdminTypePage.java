package com.swat.pages.AdminPages.Restaurants.RestaurantPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;

/**
 * Created by Alex on 03.04.17.
 */

public class AdminTypePage extends AdminRestaurantPage {

    /*Type of 'Restaurant'*/
    @FindBy(name = "types_list.0")
    private WebElement restaurantType;

    public AdminTypePage(WebDriver driver) {
        super(driver);
    }

    public void createRestaurantType() {
        restaurantType.click();
    }
}