package com.swat.pages.UserPages.RestaurantPages;

import com.swat.pages.UserPages.RestaurantSwitchPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 05.04.17.
 */
public class RestaurantPhotoPage extends RestaurantSwitchPane {

    @FindBy (className = "add_photo_btn")
    WebElement btnAddPhoto;

    @FindBy (name = "qqfile")
    WebElement fileUploadPhoto;

    @FindBy (css = "#file_name-uploader > div > div:nth-child(2) > button")
    WebElement btnConfirmUpload;

    public RestaurantPhotoPage(WebDriver driver) {
        super(driver);
    }

    public void addPhoto(){
        try {
            Thread.sleep(505);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        btnAddPhoto.click();
        fileUploadPhoto.sendKeys("/home/paul/testin1/tomato-automation/src/main/resources/photo.jpg");
        btnConfirmUpload.click();
    }

    public boolean isUploaded(){
        return driver.findElement(By.className("image_block")).isDisplayed();
    }
}
