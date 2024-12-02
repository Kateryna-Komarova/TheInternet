package com_TheInternet_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowPage extends BasePage{
    public MultipleWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Click Here')]")
    WebElement clickHere;

    public MultipleWindowPage switchToNewWindow(int index) {
        click(clickHere);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;

    }

    @FindBy(xpath = "/html/body/div/h3")
    WebElement title;
    public MultipleWindowPage verifyWindowTitle(String text) {
        Assert.assertTrue(shouldHaveText(title,text,5));
        return this;

    }
}
