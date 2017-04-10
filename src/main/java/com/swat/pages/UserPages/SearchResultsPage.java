package com.swat.pages.UserPages;

import com.swat.BasePage;
import com.swat.pages.UserPages.RestaurantPages.RestaurantOverviewPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by paul on 23.03.17.
 */
public class SearchResultsPage extends UserTopPaneFrame {

    @FindAll(@FindBy (className = "title"))
    List<WebElement> linkSearchResults;

    @FindBy (className = "popup_close")
    WebElement btnClosePopup;

    @FindBy (className = "modal_background")
    WebElement back;

    @FindAll(@FindBy(className = "filter_item"))
    List<WebElement> btnFilters;

    @FindBy(linkText = "Тестовый ресторан")
    WebElement linkRestaurant;



    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isRestarauntPresent(){

        for (WebElement link : linkSearchResults){
            if (link.getText().equals("Тестовый ресторан")) {
                System.out.println(link.getText());
                return true;
            }
        }
        return false;
    }

    public void selectKitchen(String kitchen) throws InterruptedException {
        switch (kitchen){
            case "Румынская":
                driver.findElement(By.id("gtm_id_filter_cuisine_romaniamn")).click();
                break;
            case "Армянская":
                driver.findElement(By.id("gtm_id_filter_cuisine_armenian")).click();
                break;
        }

//        driver.findElement(By.linkText(kitchen)).click();
//        Thread.sleep(1000);
//        Actions builder = new Actions(driver);
//        builder.moveToElement(back, 10, 25).click().build().perform();
//        btnClosePopup.click();

    }

    public RestaurantOverviewPage openRestaurant() {
        linkRestaurant.click();
        return BasePage.create(driver, RestaurantOverviewPage.class);

    }
}
