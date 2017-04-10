package com.swat.pages.UserPages.RestaurantPages;

import com.swat.pages.UserPages.RestaurantSwitchPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by paul on 24.03.17.
 */
public class RestaurantOverviewPage extends RestaurantSwitchPane {

    @FindBy(className = "red-text")
    WebElement textPhone;

    @FindBy(className = "list_check")
    WebElement textTrait;

    @FindBy(xpath = "//*[@id=\"frontend\"]/div[1]/div[2]/div/div[1]/div[3]/div/div/div[1]/p[2]/a")
    WebElement textCuisine;

    @FindBy(css = "p[itemprop='description']")
    WebElement textDescription;

    @FindBy(className = "ellipses")
    WebElement textWebsite;

    @FindBy(className = "word_wrap")
    WebElement textEmail;

    @FindBy(id = "trigger_restaurant_5")
    WebElement btnAddReview;

    @FindBy(xpath = "//*[@id=\"add_review\"]/div/div[2]/div[2]/div[2]/form/div[2]/textarea")
    WebElement textareaReview;

    @FindBy(xpath = "//*[@id=\"add_review\"]/div/div[2]/div[2]/div[2]/form/button")
    WebElement btnPostReview;

    @FindBy(xpath = "(//*[@class='review_block text_content'])[1]/div[@class='review_block_text']")
    WebElement reviewsText;

    @FindBy(xpath = "(//*[@class='review_block text_content'])[1]/div/div/div/div")
    WebElement reviewsMark;

    //Xpath to first block of reviews (//*[@class='review_block text_content'])[1]

    @FindBy(xpath = "(//*[@class='review_block text_content'])[1]/div/div/span")
    WebElement reviews;

    @FindAll(
            @FindBy(css = "span[itemprop='author']"))
    List<WebElement> textReviewName;

    @FindBy (id = "trigger_restaurant_4")
    WebElement btnAddToBookmarks;

    public RestaurantOverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getTrait() throws InterruptedException {

        Thread.sleep(500);
        System.out.println(textPhone.getText());
        System.out.println(textTrait.getText());
        System.out.println(textCuisine.getText());
        System.out.println(textDescription.getText());
        System.out.println(textWebsite.getText());
        System.out.println(textEmail.getText());

        return textTrait.getText();
    }
    public String getPhone() {
        return textPhone.getText();
    }

    public String getCuisine() {
        return textCuisine.getText();
    }

    public String getDescription() {
        return textDescription.getText();
    }

    public String getWebsite() {
        return textWebsite.getText();
    }

    public String getEmail() {
        return textEmail.getText();
    }

    public String getReviewName(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return textReviewName.get(0).getText();
    }

    public void addReview(String text){

        btnAddReview.click();
        textareaReview.sendKeys(text);

    }

    public void setMark(int mark){

        String wow = "//*[@class=\"raiting\"]/ul/li[" + mark + "]";
        driver.findElement(By.xpath(wow)).click();
    }

    public String getReviewMark(){
        return reviewsMark.getText();
    }

    public void postReview() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        btnPostReview.click();
    }

    public void addToBookmarks(){
        btnAddToBookmarks.click();
    }

    public boolean isAddedToBookmarks(){
        System.out.print("Lol " + btnAddToBookmarks.getAttribute("class"));
        return btnAddToBookmarks.getAttribute("class").contains("active");
    }

    public String getReviewText() {
        return reviewsText.getText();
    }
}
