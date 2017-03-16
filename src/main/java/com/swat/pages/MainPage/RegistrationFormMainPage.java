package com.swat.pages.MainPage;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 14.03.17.
 */
public class RegistrationFormMainPage extends BasePage {

    //Credentials

    @FindBy (id = "front14")
    WebElement fieldFirstName;

    @FindBy (id = "front15")
    WebElement fieldLastName;

    @FindBy (id = "front16")
    WebElement fieldEmail;

    @FindBy (id = "front17")
    WebElement fieldPassword;

    @FindBy (id = "front18")
    WebElement fieldPhone;

    //Birthday

    @FindBy (id = "front19_chosen")
    WebElement dropdownDayOfBirth;

    @FindBy (id = "front20_chosen")
    WebElement dropdownMonthOfBirth;

    @FindBy (id = "front22_chosen")
    WebElement dropdownYearOfBirth;

    @FindBy(xpath = ".//*[@id='front20_chosen']/div/div/input")
    WebElement textFieldMonthOfBirth;

    @FindBy(xpath = ".//*[@id='front22_chosen']/div/div/input")
    WebElement textFieldYearOfBirth;

    @FindBy(xpath = ".//*[@id='front19_chosen']/div/div/input")
    WebElement textFieldDayOfBirth;

    //Sex

    @FindBy (id = "check1")
    WebElement checkBoxMaleSex;

    @FindBy (id = "check2")
    WebElement checkBoxFemaleSex;

    //Confirmation

    @FindBy (id = "front23")
    WebElement buttonConfirmRegistration;

    public RegistrationFormMainPage(WebDriver driver) {
        super(driver, PageTitle.MAIN_PAGE_RU, PageUrl.MAIN_PAGE);

    }

    public void registerAs(UserData user) throws InterruptedException {

        getForm().set(fieldFirstName, user.getFirstName());
        Thread.sleep(500);
        getForm().set(fieldLastName, user.getLastName());
        Thread.sleep(500);
        getForm().set(fieldEmail, user.getEmail());
        Thread.sleep(500);
        getForm().set(fieldPassword, user.getPassword());
        Thread.sleep(500);
        getForm().set(fieldPhone, user.getTelephoneNumber());
        Thread.sleep(500);

        if (user.getSex().equals("female")) checkBoxFemaleSex.click();

        dropdownDayOfBirth.click();
        getForm().set(textFieldDayOfBirth, user.getDayOfBirth());
		textFieldDayOfBirth.sendKeys(Keys.ENTER);
        Thread.sleep(500);

        dropdownMonthOfBirth.click();
        getForm().set(textFieldMonthOfBirth, user.getMonthOfBirth());
        textFieldMonthOfBirth.sendKeys(Keys.ENTER);
        Thread.sleep(500);

        dropdownYearOfBirth.click();
        getForm().set(textFieldYearOfBirth, user.getYearOfBirth());
        textFieldYearOfBirth.sendKeys(Keys.ENTER);        
        Thread.sleep(500);

        getForm().submit();

    }
}
