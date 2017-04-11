package com.swat.pages.AdminPages.Restaurants.RestaurantPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;

/**
 * Created by Alex on 04.04.17.
 */

public class AdminServicesPage extends AdminRestaurantPage {

    /*Type of ''*/
    @FindBy(name = "services_list.0")
    private WebElement restaurantWifiService;

    public AdminServicesPage(WebDriver driver) {
        super(driver);
    }

    public void createWifiService() {
        restaurantWifiService.click();
    }

}