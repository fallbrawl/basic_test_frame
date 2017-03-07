package com.swat.pages;

import com.swat.BasePage;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by paul on 07.03.17.
 */
public class BackendLoginPage extends BasePage {
    public BackendLoginPage(WebDriver driver, PageTitle title, PageUrl pageUrl) {

            super(driver, PageTitle.BACKEND_LOGIN_PAGE, PageUrl.BACKEND_LOGIN_PAGE);
        }
    }

