package com.swat.pages.AdminPages.Restaurants.RestaurantPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;

/**
 * Created by Alex on 04.04.17.
 */

public class AdminSEOPage extends AdminRestaurantPage {

    /*Popular*/
    @FindBy(name = "is_popular")
    private WebElement popularSEO;
    /*Recommended*/
    @FindBy(name = "is_recommended")
    private WebElement recommendedSEO;

    /*Button*/
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div[5]/form/button[2]")
    private WebElement buttonSave;

    public AdminSEOPage(WebDriver driver) {
        super(driver);
    }

    public void createSEO() {
        popularSEO.click();
        recommendedSEO.click();
    }

}