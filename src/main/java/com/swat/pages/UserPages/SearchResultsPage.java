package com.swat.pages.UserPages;

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
}
