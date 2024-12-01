package com_TheInternet_Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JavaAlertsPage extends BasePage{
    public JavaAlertsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (xpath = "//button[contains(text(),'Click for JS Alert')]")
    WebElement JSAlert;

    public JavaAlertsPage getJSAlert() {
        click(JSAlert);
        String alertText = driver.switchTo().alert().getText();
        System.out.println("Text"+alertText);
        Assert.assertEquals(alertText, "I am a JS Alert", "Alert text does not match!");
        return this;

    }

    @FindBy (xpath = "//button[contains(text(),'Click for JS Confirm')]")
    WebElement Confirm;

    public JavaAlertsPage getConfirmAlert() {
        click(Confirm);
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText, "I am a JS Confirm", "Alert text does not match!");
        return this;
    }


    public JavaAlertsPage handleAlert(String action) {
        Alert alert = driver.switchTo().alert();
        if ("OK".equalsIgnoreCase(action)) {
            alert.accept();
        } else if ("Cancel".equalsIgnoreCase(action)) {
            alert.dismiss();
        }
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Click for JS Alert')]")
    WebElement alert;
    public JavaAlertsPage isSomeButtonActive() {
        click(alert);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Click for JS Prompt')]")
    WebElement prompt;

    public JavaAlertsPage sendMessage(String message) {
        click(prompt);
        if(message != null ){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement result;
    public JavaAlertsPage verifyMessage(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }
}
