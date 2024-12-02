package com_TheInternet_Tests;

import com_TheInternet_Pages.DropdownPage;
import com_TheInternet_Pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdown();
    }

    @Test
    public void selectDrop(){
        new DropdownPage(driver).selectOption("Option 2").verifyTextOption();
    }
}
