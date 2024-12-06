package com_TheInternet_Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternet.pages.HomePage;
import theInternet.pages.HoversPage;

public class HoverTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHover();
    }

    @Test
    public void hoverTest() {
        new HoversPage(driver).moveToFirstElement().verifyByText();
    }
}
