package com_TheInternet_Tests;

import com_TheInternet_Pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

    @Test
    public void homePageIsPresent(){
        new HomePage(driver).isHomeComponentPresent();
    }
}
