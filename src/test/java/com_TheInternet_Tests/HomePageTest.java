package com_TheInternet_Tests;

import theInternet.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {


    @Test
    public void homePageIsPresent() {
        Assert.assertTrue(new HomePage(driver).isHomeComponentPresent(), "Home page is not present");
    }
}
