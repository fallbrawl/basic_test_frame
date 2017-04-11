package com.swat.pages.AdminPages.Restaurants.RestaurantPages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.swat.data.RestaurantData;
import com.swat.pages.AdminPages.Restaurants.AdminRestaurantPage;

/**
 * Created by Alex on 24.03.17.
 */

public class AdminGeneralPage extends AdminRestaurantPage {
    /*Title*/
    @FindBy(name = "uri")
    private WebElement fieldUri;
    @FindBy(name = "name_ru")
    private WebElement fieldNameRu;
    @FindBy(name = "name_en")
    private WebElement fieldNameEn;
    @FindBy(name = "name_ua")
    private WebElement fieldNameUa;
    /*Address*/
    @FindBy(className = "select2-arrow")
    private WebElement dropdownCity;
    @FindBy(className = "select2-result-label")
    private WebElement dropdownElement;
    @FindBy(name = "address_ru")
    private WebElement fieldAddressRu;
    @FindBy(name = "address_en")
    private WebElement fieldAddressEn;
    @FindBy(name = "address_ua")
    private WebElement fieldAddressUa;
    /*Working hours*/
	/*Mon*/
    @FindBy(name = "work_time.0.is_active")
    private WebElement checkboxWorkingHoursMon;
    @FindBy(name = "work_time.0.is_full")
    private WebElement checkboxWorkingHoursMonFull;
    /*Tue*/
    @FindBy(name = "work_time.1.is_active")
    private WebElement checkboxWorkingHoursTue;
    @FindBy(name = "work_time.1.is_full")
    private WebElement checkboxWorkingHoursTueFull;
    /*Wed*/
    @FindBy(name = "work_time.2.is_active")
    private WebElement checkboxWorkingHoursWed;
    @FindBy(name = "work_time.2.is_full")
    private WebElement checkboxWorkingHoursWedFull;
    /*Thu*/
    @FindBy(name = "work_time.3.is_active")
    private WebElement checkboxWorkingHoursThu;
    @FindBy(name = "work_time.3.is_full")
    private WebElement checkboxWorkingHoursThuFull;
    /*Friday*/
    @FindBy(name = "work_time.4.is_active")
    private WebElement checkboxWorkingHoursFriday;
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div[1]/form/div[4]/div[1]/table/tbody/tr[5]/td[2]/div/a/span[2]/b")
    private WebElement workingHoursFridayOpen;
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div[1]/form/div[4]/div[1]/table/tbody/tr[5]/td[3]/div/a/span[2]/b")
    private WebElement workingHoursFridayClose;
    /*Description*/
    @FindBy(name = "description_ru")
    private WebElement textDescriptionRu;
    @FindBy(name = "description_en")
    private WebElement textDescriptionEn;
    @FindBy(name = "description_ua")
    private WebElement textDescriptionUa;
    /*Phone*/
    @FindBy(name = "phone")
    private WebElement restaurantPhone;
    /*Email*/
    @FindBy(name = "email")
    private WebElement restaurantEmail;
    /*Site*/
    @FindBy(name = "site_url")
    private WebElement restaurantSite;


    public AdminGeneralPage(WebDriver driver) {
        super(driver);
    }

    public void createRestaurantGeneral(RestaurantData restaurant) throws InterruptedException {
		/*Title*/
        getForm().set(fieldUri, restaurant.getUri());
        getForm().set(fieldNameRu, restaurant.getNameRu());
        Thread.sleep(500);
        fieldNameEn.clear();
        getForm().set(fieldNameEn, restaurant.getNameEn());
        getForm().set(fieldNameUa, restaurant.getNameUa());

	    /*Address*/
        dropdownCity.click();
        ArrayList<WebElement> dropdownListOfCity = new ArrayList<WebElement>(driver.findElements(By.className("select2-result-label")));
        for (WebElement dropdownElement : dropdownListOfCity) {
            if (dropdownElement.getText().equals(restaurant.getCity())){
                dropdownElement.click();
                break;
            }
        }
        Thread.sleep(500);
        getForm().set(fieldAddressRu, restaurant.getAddressRu());
        Thread.sleep(500);
        fieldAddressEn.clear();
        getForm().set(fieldAddressEn, restaurant.getAddressEn());
        getForm().set(fieldAddressUa, restaurant.getAddressUa());

	    /*Working hours*/
	    /*Mon*/
        checkboxWorkingHoursMon.sendKeys(Keys.SPACE);
        checkboxWorkingHoursMonFull.click();
	    /*Tue*/
        checkboxWorkingHoursTue.sendKeys(Keys.SPACE);
        checkboxWorkingHoursTueFull.click();
	    /*Wed*/
        checkboxWorkingHoursWed.sendKeys(Keys.SPACE);
        checkboxWorkingHoursWedFull.click();
	    /*Thu*/
        checkboxWorkingHoursThu.sendKeys(Keys.SPACE);
        checkboxWorkingHoursThuFull.click();
	    /*Friday*/
        checkboxWorkingHoursFriday.sendKeys(Keys.SPACE);
        Thread.sleep(500);
        workingHoursFridayOpen.click();
        ArrayList<WebElement> dropdownListOfTimeOpen = new ArrayList<WebElement>(driver.findElements(By.className("select2-result-label")));
        for (WebElement dropdownTimeOpen : dropdownListOfTimeOpen) {
            if (dropdownTimeOpen.getText().equals(restaurant.getFridayOpen())){

/*        		System.out.println(dropdownTime.getText());
 * 				Actions builder = new Actions(driver);
        		builder.moveToElement(dropdownTime).build().perform();
        		builder.moveToElement(dropdownTime).click();
*/

/* Scrolling the page
        	    Thread.sleep(1000);
        		JavascriptExecutor jse = (JavascriptExecutor)driver;
        		jse.executeScript("window.scrollBy(0, 500)", "");
        	    Thread.sleep(1000);
*/
                dropdownTimeOpen.click();
                break;
            }
        }
        workingHoursFridayClose.click();
        ArrayList<WebElement> dropdownListOfTimeClose = new ArrayList<WebElement>(driver.findElements(By.className("select2-result-label")));
        for (WebElement dropdownTimeClose : dropdownListOfTimeClose) {
            if (dropdownTimeClose.getText().equals(restaurant.getFridayClose())){
                dropdownTimeClose.click();
                break;
            }
        }
        /*Description*/
        Thread.sleep(500);
        getForm().set(textDescriptionRu, restaurant.getTextDescriptionRu());
        getForm().set(textDescriptionEn, restaurant.getTextDescriptionEn());
        getForm().set(textDescriptionUa, restaurant.getTextDescriptionUa());
        getForm().set(restaurantPhone, restaurant.getRestaurantPhone());
        getForm().set(restaurantEmail, restaurant.getRestaurantEmail());
        getForm().set(restaurantSite, restaurant.getRestaurantSite());
    }
}