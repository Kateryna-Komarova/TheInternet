package com_TheInternet_Tests;

import com_TheInternet_Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{


    @Test
    public void homePageIsPresent(){
        boolean isPresent = new HomePage(driver).isHomeComponentPresent();
        Assert.assertTrue(isPresent,"Home page is present");
    }
}
