package com.swat.pages.UserPages;

import com.swat.BasePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by paul on 17.03.17.
 */
public class UserTopPaneFrame extends BasePage{

    public UserTopPaneFrame(WebDriver driver) {
        super(driver, PageTitle.DYNAMIC_PAGE, PageUrl.DYNAMIC_PAGE);
    }
}
