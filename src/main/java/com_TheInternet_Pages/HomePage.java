package com_TheInternet_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome to the-internet')]")
    WebElement homePageComponent;

    public boolean isHomeComponentPresent() {
        return isElementPresent(homePageComponent);
    }


    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement javaAlerts;
    public void getJavaAlerts() {
        click(javaAlerts);
    }


    @FindBy(xpath = "//*[@id='content']/ul/li[22]/a")
    WebElement frame;
    public HomePage getFrameLink() {
        click(frame);
        return this;
    }

}
