package com.swat.pages.MainPage;

import com.swat.BasePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 14.03.17.
 */
public class SwitchFormMainPage extends BasePage {

    BasePage switchVariantPage;

    @FindBy(className = "col2")
    WebElement btnSignViaEmail;

    @FindBy(className = "login_google")
    WebElement btnLoginGoogle;

    @FindBy(className = "login_vk")
    WebElement btnLoginVk;

    @FindBy(className = "login_facebook")
    WebElement btnLoginFb;

    @FindBy(xpath = ".//*[@id='frontend']/div[1]/header/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button")
    WebElement btnRegistration;

    public SwitchFormMainPage(WebDriver driver) {
        super(driver, PageTitle.MAIN_PAGE_RU, PageUrl.MAIN_PAGE);
    }

    public BasePage chooseLoginOrRegistrationVariant(String loginVariant){

        switch (loginVariant){

            case ("loginThroughEmail"):
                btnSignViaEmail.click();
                switchVariantPage = BasePage.create(driver, LoginFormMainPage.class);
                return switchVariantPage;

            case ("gmail"):
                btnLoginGoogle.click();
                break;

            case ("facebook"):
                btnLoginFb.click();
                break;

            case ("vk"):
                btnLoginVk.click();
                break;

            default:
                btnRegistration.click();
                switchVariantPage = BasePage.create(driver, RegistrationFormMainPage.class);
                return switchVariantPage;

        }

        return null;

    }
}
