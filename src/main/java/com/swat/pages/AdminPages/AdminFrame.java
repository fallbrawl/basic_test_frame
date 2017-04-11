package com.swat.pages.AdminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swat.BasePage;
import com.swat.pages.AdminPages.Restaurants.AdminListPage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

/**
 * Created by Alex on 17.03.17.
 */

public class AdminFrame extends BasePage {

	@FindBy(id = "admin13")
	private WebElement btnAdminMenuLogout;

	@FindBy(id = "admin14")
	private WebElement btnAdminMenuRestaurants;

	@FindBy(id = "admin15")
	private WebElement btnAdminMenuDictionaries;

	@FindBy(id = "admin16")
	private WebElement btnAdminMenuSettings;

	@FindBy(id = "admin17")
	private WebElement btnAdminMenuGeolocation;

	@FindBy(id = "admin28")
	private WebElement btnAdminMenuDropdownList;


	public AdminFrame(WebDriver driver) {
		super(driver, PageTitle.DYNAMIC_PAGE, PageUrl.DYNAMIC_PAGE);
	}

	public void adminMenuLogout() throws InterruptedException {
		btnAdminMenuLogout.click();
	}

	public void adminMenuRestaurants() {
		btnAdminMenuRestaurants.click();
	}

	public AdminListPage adminMenuDropdownList() {
		btnAdminMenuDropdownList.click();
		return BasePage.create(driver, AdminListPage.class);
	}



}