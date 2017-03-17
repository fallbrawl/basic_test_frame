package com.swat.pages.UserPages.UserCabinetPages;

import com.swat.pages.UserPages.UserTopPaneFrame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 17.03.17.
 */
public class UserMenuFrame extends UserTopPaneFrame {

    @FindBy(id ="front38")
    WebElement btnChangeAvatar;

    @FindBy(id ="front39")
    WebElement textUserName;

    @FindBy(id ="front40")
    WebElement btnProfile;

    @FindBy(id ="front41")
    WebElement btnChangePassword;

    @FindBy(id ="front42")
    WebElement btnBookmarks;

    @FindBy(id ="front43")
    WebElement btnBooking;

    @FindBy(id ="front44")
    WebElement btnReviews;

    @FindBy(id ="front45")
    WebElement btnPhotos;

    @FindBy(id ="front46")
    WebElement btnFeedback;

    @FindBy(id ="front47")
    WebElement btnLogout;

    public UserMenuFrame(WebDriver driver) {
        super(driver);
    }
}
