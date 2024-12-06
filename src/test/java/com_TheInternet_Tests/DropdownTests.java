package com_TheInternet_Tests;

import theInternet.pages.DropdownPage;
import theInternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropdown();
    }

    @Test
    public void selectDrop() {
        new DropdownPage(driver).selectOption("Option 2").verifyTextOption();
    }
}
