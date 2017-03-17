package com.swat.pages.UserPages;

import com.swat.BasePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 16.03.17.
 */
public class UserProfilePage extends BasePage {

    @FindBy (id = "front48")
    WebElement fieldFirstNameProfile;

    @FindBy (id = "front49")
    WebElement fieldLastNameProfile;

    @FindBy (id = "front50")
    WebElement fieldCityProfile;

    @FindBy (id = "front51")
    WebElement fieldEmailProfile;

    @FindBy (id = "front52")
    WebElement fieldPhoneProfile;

    @FindBy (id = "front53")
    WebElement fieldLanguageProfile;

    @FindBy (id = "front54")
    WebElement fieldDayProfile;

    @FindBy (id = "front55")
    WebElement fieldWeekProfile;

    @FindBy (id = "front56")
    WebElement fieldMonthProfile;

    @FindBy (id = "check1")
    WebElement btnSexMale;

    @FindBy (id = "check2")
    WebElement btnSexFemale;

    @FindBy (id = "front57")
    WebElement btnDoneProfile;

    @FindBy (id ="front47")
    WebElement btnLogout;


    public UserProfilePage(WebDriver driver) {
        super(driver, PageTitle.MAIN_PAGE_RU, PageUrl.DYNAMIC_PAGE);
        //Dynamic page содержит пустую строку. Добавил в метод getPageFullUrl() проверку на пустую строку для подсасывания урла из текущего драйвера
    }

    public String getFieldLastNameProfile() {
        return fieldLastNameProfile.getAttribute("value");
    }

    public String getFieldEmailProfile() {
        return fieldEmailProfile.getAttribute("value");
    }

    public String getFieldFirstNameProfile() throws InterruptedException {
        return fieldFirstNameProfile.getAttribute("value");
    }

    public String getFieldPhoneProfile() {
        return fieldPhoneProfile.getAttribute("value");
    }

    public String getSex(){
        if (btnSexFemale.isSelected()){
            return "female";
        }
        return "male";
    }

    public void logout() {
        btnLogout.click();
    }
}
