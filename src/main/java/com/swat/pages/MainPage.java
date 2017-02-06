package com.swat.pages;

import com.swat.BasePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 30.01.17.
 */
public class MainPage extends BasePage {

    @FindBy (className = "header_sign_in")
    WebElement btnSignIn;

    public MainPage(WebDriver driver, PageTitle title, PageUrl pageUrl) {
        super(driver, title, pageUrl);
    }

    public MainPage(WebDriver driver) {
        super(driver, PageTitle.MAIN_PAGE_RU, PageUrl.MAIN_PAGE);
    }

    public void showMe(){
        System.out.print(btnSignIn.getText());
    }

}
