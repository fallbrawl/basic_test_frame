package com.swat.pages.Examples;

import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;

public class EditMemberPage extends AddMemberPage {

	public EditMemberPage(WebDriver driver) {
		super(driver, PageTitle.ADMIN_EDIT_MEMBER, PageUrl.ADMIN_EDIT_MEMBER);
	}



}
