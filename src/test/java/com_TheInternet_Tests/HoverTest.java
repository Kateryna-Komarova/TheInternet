package com_TheInternet_Tests;

import com_TheInternet_Pages.HomePage;
import com_TheInternet_Pages.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getHover();
    }
    @Test
    public void hoverTest(){
        new HoversPage(driver).moveToFirstElement().verifyByText();
    }
}
