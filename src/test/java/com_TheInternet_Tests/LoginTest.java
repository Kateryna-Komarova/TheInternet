package com_TheInternet_Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternet.pages.HomePage;
import theInternet.pages.LoginPage;

public class LoginTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getLoginLink();
    }
    @Test
    public void loginTest(){
        new LoginPage(driver).enterUserData("tomsmith","SuperSecretPassword!").verifyLogin();
    }

    @AfterMethod
    public void logOutUser(){
        new LoginPage(driver).logOutUser().verifyLogOut();
    }
}
