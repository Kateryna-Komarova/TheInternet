package com_TheInternet_Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternet.pages.CheckBoxPage;
import theInternet.pages.HomePage;

public class CheckBoxTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getCheckBox();
    }

    @Test
    public void checkBoxTest(){
        new CheckBoxPage(driver).chooseCheckBox(new String[]{"checkbox 1"}).verifyCheckBox();
    }
}
