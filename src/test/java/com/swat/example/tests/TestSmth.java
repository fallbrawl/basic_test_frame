package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.MainPage;
import org.testng.annotations.Test;

/**
 * Created by paul on 30.01.17.
 */
public class TestSmth extends BaseTestCase {

    MainPage mainPage = BasePage.create(getDriver(), MainPage.class);

    @Test
    public void doSmth(){
        mainPage.open();
        System.out.print(getDriver().getCurrentUrl());

        mainPage.showMe();
    }
}
