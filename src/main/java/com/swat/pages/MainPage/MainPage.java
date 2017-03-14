package com.swat.pages.MainPage;

import com.swat.BasePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 30.01.17
 */
public class MainPage extends BasePage {

    @FindBy (className = "header_sign_in")
    WebElement btnSignIn;

    @FindBy(className = "user_menu_link")
    WebElement btnUserMenuDropdown;

    public MainPage(WebDriver driver) {
        super(driver, PageTitle.MAIN_PAGE_RU, PageUrl.MAIN_PAGE);
    }

    public String getUserName() {
        return btnUserMenuDropdown.getText();
    }

    public SwitchFormMainPage openLoginPane() {
        btnSignIn.click();
        return BasePage.create(driver, SwitchFormMainPage.class);
    }
}
