package com.swat.pages;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by paul on 07.03.17.
 */
public class BackendLoginPage extends BasePage {
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/form/div[1]/input")
	private WebElement email;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/form/div[2]/input")
	private WebElement password;	

	
	public BackendLoginPage(WebDriver driver) {
		super(driver, PageTitle.BACKEND_LOGIN_PAGE, PageUrl.BACKEND_LOGIN_PAGE);
   	}
	
	//Set email and password in textbox and click on button
	public AdminMainPage loginAs(UserData admin) {
		getForm().set(email, admin.getName()).set(password, admin.getPassword()).submit();
		return BasePage.create(driver, AdminMainPage.class);
	}	
	
}

