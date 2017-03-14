package com.swat.pages.MainPage;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 13.03.17.
 */
public class LoginFormMainPage extends BasePage {

    public LoginFormMainPage(WebDriver driver) {
        super(driver, PageTitle.MAIN_PAGE_RU, PageUrl.MAIN_PAGE);
    }

    @FindBy(xpath = ".//*[@id='frontend']/div[1]/header/div[1]/div[1]/div[4]/div[1]/div[2]/form/div[1]/input")
    WebElement fieldEmailLogin;

    @FindBy(xpath = ".//*[@id='frontend']/div[1]/header/div[1]/div[1]/div[4]/div[1]/div[2]/form/div[2]/input")
    WebElement fieldPasswordLogin;

    @FindBy(xpath = ".//*[@id='frontend']/div[1]/header/div[1]/div[1]/div[4]/div[1]/div[2]/form/button")
    WebElement btnLogin;

    public void loginAs(UserData user) throws InterruptedException {

        getForm().set(fieldPasswordLogin, user.getPassword());
        Thread.sleep(2000);
        getForm().set(fieldEmailLogin, user.getEmail());
        Thread.sleep(2000);
        getForm().submit();
        btnLogin.click();
    }



}
