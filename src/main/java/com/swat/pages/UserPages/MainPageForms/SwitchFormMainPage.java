package com.swat.pages.UserPages.MainPageForms;

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

    //socials

    @FindBy(id = "front11")
    WebElement btnLoginGoogle;

    @FindBy(id = "front10")
    WebElement btnLoginVk;

    @FindBy(id = "front9")
    WebElement btnLoginFb;

    //email

    @FindBy(id = "front13")
    WebElement btnSignViaEmail;

    //reg

    @FindBy(id = "front12")
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
