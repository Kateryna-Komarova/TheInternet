package com_TheInternet_Tests;

import theInternet.pages.BrokenImagesPage;
import theInternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBrokenImages();
    }

    @Test
    public void brokenImageTest() {
        new BrokenImagesPage(driver).checkBrokenImages();
    }
}
