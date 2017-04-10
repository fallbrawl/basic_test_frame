package com.swat.example.tests;

import com.swat.BasePage;
import com.swat.pages.UserPages.RestaurantPages.RestaurantOverviewPage;
import com.swat.pages.UserPages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by paul on 24.03.17.
 */
public class UserReviewsAndMarksTest extends BaseTestCase {

    @Test
    public void reviewsAndMarksTest() {
        SearchResultsPage searchResultsPage = BasePage.create(getDriver(), SearchResultsPage.class);

        RestaurantOverviewPage restaurantOverviewPage = searchResultsPage.openRestaurant();

        restaurantOverviewPage.addReview("Тестовый отзыв пользователя о Тестовом ресторане!");
        restaurantOverviewPage.setMark(4);
        restaurantOverviewPage.postReview();

        Assert.assertEquals(restaurantOverviewPage.getReviewName(),"First Last");
        Assert.assertEquals(restaurantOverviewPage.getReviewMark(),"4.5");
        Assert.assertEquals(restaurantOverviewPage.getReviewText(),"Тестовый отзыв пользователя о Тестовом ресторане!");
    }
}
