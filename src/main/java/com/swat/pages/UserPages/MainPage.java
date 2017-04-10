package com.swat.pages.UserPages;

import com.swat.BasePage;
import com.swat.pages.UserPages.MainPageForms.SwitchFormMainPage;
import com.swat.pages.UserPages.UserCabinetPages.UserProfilePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

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

    @FindBy(id = "city_select_chosen")
    WebElement dropdownCitySelect;

    @FindBy(className = "chosen-single")
    WebElement fieldCity;

    @FindBy(name = "query")
    WebElement textfieldSearch;

    public MainPage(WebDriver driver) {
        super(driver, PageTitle.MAIN_PAGE_RU, PageUrl.MAIN_PAGE);
    }

    public String getUserName() {
        return btnUserMenuDropdown.getText();
    }

    public void logout() throws InterruptedException {
        Thread.sleep(500);
        btnUserMenuDropdown.click();
        btnUserMenuLogout.click();

    }

    public void selectCity(String cityName){
        if (!fieldCity.getText().equals(cityName)) {

            dropdownCitySelect.click();
            ArrayList<WebElement> cities = new ArrayList<>(driver.findElements(By.className("active-result")));

            for (WebElement a : cities) {

                if (a.getText().equals(cityName)) {
                    a.click();
                    return;
                }
            }
        }
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

    public SearchResultsPage searchFor(String restaurantName) {
        if (restaurantName!=""){
            textfieldSearch.sendKeys(restaurantName);
        }

        textfieldSearch.submit();
        return BasePage.create(driver, SearchResultsPage.class);
    }
}
