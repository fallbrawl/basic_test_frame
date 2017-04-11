package com.swat.pages.AdminPages.Restaurants;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swat.BasePage;
import com.swat.pages.AdminPages.AdminFrame;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminCuisinePage;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminGeneralPage;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminSEOPage;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminServicesPage;
import com.swat.pages.AdminPages.Restaurants.RestaurantPages.AdminTypePage;

/**
 * Created by Alex on 03.04.17.
 */

public class AdminRestaurantPage extends AdminFrame {

    /*Tab for General page*/
    @FindBy(linkText = "Основное")
    private WebElement btnAdminGeneralTab;
    /*Tab for Type page*/
    @FindBy(linkText = "Тип")
    private WebElement btnAdminTypeTab;
    /*Tab for Services page*/
    @FindBy(linkText = "Услуги")
    private WebElement btnAdminServicesTab;
    /*Tab for Cuisine page*/
    @FindBy(linkText = "Кухня")
    private WebElement btnAdminCuisineTab;
    /*Tab for SEO page*/
    @FindBy(linkText = "СЕО")
    private WebElement btnAdminSEOTab;
	/*Save buttons*/

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div[5]/form/button[2]")
    private WebElement btnAdminSaveButton;


    public AdminRestaurantPage(WebDriver driver) {
        super(driver);
    }
    /*Transfer on the General page*/
    public AdminGeneralPage adminGeneralTab() throws InterruptedException {
        Thread.sleep(500);
        /*Scroll on the top page*/
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.head.scrollHeight)");
        Thread.sleep(1000);

        btnAdminGeneralTab.click();
        Thread.sleep(500);
        return BasePage.create(driver, AdminGeneralPage.class);
    }

    /*Transfer on the Type page*/
    public AdminTypePage adminTypeTab() throws InterruptedException {
        Thread.sleep(500);
        /*Scroll on the top page*/
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.head.scrollHeight)");
        Thread.sleep(1000);

        btnAdminTypeTab.click();
        Thread.sleep(500);
        return BasePage.create(driver, AdminTypePage.class);
    }

    /*Transfer on the Services page*/
    public AdminServicesPage adminServicesTab() throws InterruptedException {
        Thread.sleep(500);
        /*Scroll on the top page*/
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.head.scrollHeight)");
        Thread.sleep(1000);

        btnAdminServicesTab.click();
        Thread.sleep(500);
        return BasePage.create(driver, AdminServicesPage.class);
    }

    /*Transfer on the Cuisine page*/
    public AdminCuisinePage adminCuisineTab() throws InterruptedException {
        Thread.sleep(500);
        /*Scroll on the top page*/
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.head.scrollHeight)");
        Thread.sleep(1000);

        btnAdminCuisineTab.click();
        Thread.sleep(500);
        return BasePage.create(driver, AdminCuisinePage.class);
    }

    /*Transfer on the SEO page*/
    public AdminSEOPage adminSEOTab() throws InterruptedException {
        Thread.sleep(500);
        /*Scroll on the top page*/
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.head.scrollHeight)");
        Thread.sleep(1000);

        btnAdminSEOTab.click();
        Thread.sleep(500);
        return BasePage.create(driver, AdminSEOPage.class);
    }

    /*Click on the 'Save' buttons*/
    public void clickSaveButton() {
        btnAdminSaveButton.click();
    }

}