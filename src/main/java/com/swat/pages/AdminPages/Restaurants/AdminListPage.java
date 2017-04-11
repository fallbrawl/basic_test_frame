package com.swat.pages.AdminPages.Restaurants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.swat.BasePage;
import com.swat.data.RestaurantData;
import com.swat.pages.AdminPages.AdminFrame;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminGeneralPage;


/**
 * Created by Alex on 23.03.17.
 */

public class AdminListPage extends AdminFrame {

    @FindBy(id = "admin6")
    private WebElement searchInput;
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div[4]/table/tbody/tr/td[2]")
    private WebElement nameRestaurantFound;
    /*Button for Add new restaurant*/
    @FindBy(id = "action-0b658e52c9c5fc9949e0025b89270520")
    private WebElement btnAdminMenuAdd;

    public AdminListPage(WebDriver driver) {
        super(driver);
    }

    /*Transfer on the General page for create new restaurant*/
    public AdminGeneralPage adminMenuAdd() throws InterruptedException {
        Thread.sleep(1000);
        btnAdminMenuAdd.click();
        return BasePage.create(driver, AdminGeneralPage.class);
    }

    //Set email in searchInput
    public AdminListPage searchAs(RestaurantData restaurantNameRu) throws InterruptedException  {
        getForm().set(searchInput, restaurantNameRu.getNameRu());
        Thread.sleep(1000);
        return BasePage.create(driver, AdminListPage.class);
    }
    //Check the restaurant is found
    public String isRestaurantFound() {
        return nameRestaurantFound.getText();
    }


}