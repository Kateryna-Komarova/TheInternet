package com_TheInternet_Tests;

import com_TheInternet_Pages.BrokenImagesPage;
import com_TheInternet_Pages.HomePage;
import com_TheInternet_Pages.HoversPage;
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
