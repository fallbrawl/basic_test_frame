package com.swat.pages.UserPages;

import com.swat.BasePage;
import com.swat.pages.UserPages.MainPageForms.SwitchFormMainPage;
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

    @FindBy(id = "front37")
    WebElement btnUserMenuLogout;
    
    @FindBy(id = "front30")
    WebElement btnUserMenuProfile;    

    public MainPage(WebDriver driver) {
        super(driver, PageTitle.MAIN_PAGE_RU, PageUrl.MAIN_PAGE);
    }

    public String getUserName() {
        return btnUserMenuDropdown.getText();
    }

    public void logout() throws InterruptedException {
        Thread.sleep(1000);
        btnUserMenuDropdown.click();
        btnUserMenuLogout.click();

    }

    public SwitchFormMainPage openLoginPane() {
        btnSignIn.click();
        return BasePage.create(driver, SwitchFormMainPage.class);
    }
    
    public void menuDropDown() {
        btnUserMenuDropdown.click();
    }    

    public String getItemProfileText() {
        return btnUserMenuProfile.getText();
    }

    public UserProfilePage getProfilePage(){
        btnUserMenuProfile.click();
        return BasePage.create(driver, UserProfilePage.class);
    }
    
}
