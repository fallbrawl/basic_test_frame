package com.swat.pages.Examples;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddMemberPage extends BasePage {

	@FindBy(name = "saveChanges")
	private WebElement buttonSaveChanges;

	public AddMemberPage(WebDriver driver) {
		super(driver, PageTitle.ADMIN_ADD_MEMBER, PageUrl.ADMIN_ADD_MEMBER);
	}

	public AddMemberPage(WebDriver driver, PageTitle pageTitle,
			PageUrl pageUrl) {
		super(driver, pageTitle, pageUrl);
	}

	public AddMemberPage fillmemberForAs(UserData newMember) {
		getForm().set("memberID", newMember.getEmail())
		.set("password", newMember.getPassword())
		.set("confirmPassword", newMember.getPassword());
		return this;
	}
	
	public void submit() {
		buttonSaveChanges.click();
	}

}
