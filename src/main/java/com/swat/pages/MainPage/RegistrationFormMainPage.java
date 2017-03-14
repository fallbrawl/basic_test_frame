package com.swat.pages.MainPage;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 14.03.17.
 */
public class RegistrationFormMainPage extends BasePage {

    //Credentials

    @FindBy (name = "first_name")
    WebElement fieldFirstName;

    @FindBy (name = "last_name")
    WebElement fieldLastName;

    @FindBy (name = "email")
    WebElement fieldEmail;

    @FindBy (name = "password")
    WebElement fieldPassword;

    @FindBy (name = "phone")
    WebElement fieldPhone;

    //Birthday

    @FindBy (xpath =  ".//*[@id='birth_day']/div[1]/div/a/span")
    WebElement dropdownDayOfBirth;

    @FindBy (xpath = ".//*[@id='birth_day']/div[2]/div/a/span")
    WebElement dropdownMonthOfBirth;

    @FindBy (xpath = ".//*[@id='birth_day']/div[3]/div/a/span")
    WebElement dropdownYearOfBirth;

    //Sex

    @FindBy (id = "check1")
    WebElement checkBoxMaleSex;

    @FindBy (id = "check2")
    WebElement checkBoxFemaleSex;

    //Confirmation

    @FindBy (xpath = ".//*[@id='frontend']/div[1]/header/div[1]/div[1]/div[3]/div[1]/div[2]/form/button")
    WebElement buttonConfirmRegistration;

    public RegistrationFormMainPage(WebDriver driver) {
        super(driver, PageTitle.MAIN_PAGE_RU, PageUrl.MAIN_PAGE);

    }

    public void registerAs(UserData user) throws InterruptedException {

        getForm().set(fieldFirstName, user.getFirstName());
        Thread.sleep(1000);
        getForm().set(fieldLastName, user.getLastName());
        Thread.sleep(1000);
        getForm().set(fieldEmail, user.getEmail());
        Thread.sleep(1000);
        getForm().set(fieldPassword, user.getPassword());
        Thread.sleep(1000);

        getForm().submit();

        buttonConfirmRegistration.click();
    }
}
