package com_TheInternet_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversPage extends BasePage{
    public HoversPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/img")
    WebElement user1;
    public HoversPage moveToFirstElement() {
        pause(1000);
        new Actions(driver).moveToElement(user1).perform();
        pause(1000);
        return this;
    }
    public HoversPage verifyByText() {
        Assert.assertEquals(driver.findElement(By.tagName("h5")).getText(), "name: user1");
        return this;
    }
}
