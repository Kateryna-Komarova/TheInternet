package com_TheInternet_Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternet.pages.EntryAd;
import theInternet.pages.HomePage;

public class EntryAdTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getEntryAd();
    }

    @Test
    public void entryAdTest(){
        new EntryAd(driver).getClickButton().verifyCloseAd();
    }
}
