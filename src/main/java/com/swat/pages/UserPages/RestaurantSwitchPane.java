package com.swat.pages.UserPages;

import com.swat.BasePage;
import com.swat.pages.UserPages.RestaurantPages.RestaurantPhotoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 05.04.17.
 */
public class RestaurantSwitchPane extends UserTopPaneFrame {
    public RestaurantSwitchPane(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "trigger_restaurant_8")
    WebElement linkPhoto;

    @FindBy(id = "trigger_restaurant_7")
    WebElement linkReviews;

    public RestaurantPhotoPage openPhotos() {
        linkPhoto.click();
        return BasePage.create(driver, RestaurantPhotoPage.class);
    }

    public void openReview() {
        linkReviews.click();
    }
}
