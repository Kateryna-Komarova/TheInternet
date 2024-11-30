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
        String alertText = getAlertText();
        Assert.assertEquals(alertText, "I am a JS Alert", "Alert text does not match!");
    }

    private String getAlertText() {
        String alertText = driver.switchTo().alert().getText();
        return alertText;
    }

    @Test
    public void secondAlert() {
        new JavaAlertsPage(driver).getConfirmAlert();
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText, "I am a JS Confirm", "Alert text does not match!");

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