package com_TheInternet_Tests;

import com_TheInternet_Pages.HomePage;
import com_TheInternet_Pages.JavaAlertsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaAlertsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getJavaAlerts();
    }

    @Test
    public void firstAlert() {
        new JavaAlertsPage(driver).getJSAlert();
    }

    @Test
    public void secondAlert() {
        new JavaAlertsPage(driver).getConfirmAlert();
    }

    @Test
    public void secondAlertTest() {
        new JavaAlertsPage(driver).getConfirmAlert().
                handleAlert("OK").isSomeButtonActive();
    }

    @Test
    public void thirdAlertTest(){
        new JavaAlertsPage(driver).sendMessage("I am a JS prompt").verifyMessage("I am a JS prompt");
    }
}