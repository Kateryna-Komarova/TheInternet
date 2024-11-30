package com_TheInternet_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }

    public FramePage switchToIframeByIndex(int index) {
        driver.switchTo().frame(index);
        return this;

    }

    @FindBy(xpath = "//*[@id='content']/div/ul/li[2]/a")
    WebElement iFrame;

    public FramePage getIframe() {
        click(iFrame);
        return this;
    }

    @FindBy(xpath = "//*[@id='content']/div/h3")
    WebElement title;

    public FramePage verifyIframe(String text) {
        Assert.assertTrue(title.getText().contains(text));
        return this;
    }

    @FindBy(xpath = "//*[@id='content']/div/ul/li[1]/a")
    WebElement nestedFrames;

    public FramePage getNestedFrames() {
        click(nestedFrames);
        return this;
    }

    @FindBy(xpath = "/html/frameset/frame[1]")
    WebElement topFrameSet;
    public FramePage getTopFrame() {
        driver.switchTo().frame(topFrameSet);
        driver.switchTo().frame(0);
        WebElement content = driver.findElement(By.tagName("body"));
        String actualText = content.getText();
        Assert.assertEquals(actualText,"LEFT");
        return this;
    }
    public FramePage middleFrame(){
        driver.switchTo().frame(topFrameSet);
        driver.switchTo().frame(1);
        WebElement content = driver.findElement(By.tagName("body"));
        String actualText = content.getText();
        Assert.assertEquals(actualText,"MIDDLE");
        return this;
    }

    public FramePage rightFrame() {
        driver.switchTo().frame(topFrameSet);
        driver.switchTo().frame(2);
        WebElement content = driver.findElement(By.tagName("body"));
        String actualText = content.getText();
        Assert.assertEquals(actualText,"RIGHT");
        return this;
    }

    @FindBy(xpath = "/html/frameset/frame[2]")
    WebElement bottomFrame;
    public FramePage getBottom() {
        driver.switchTo().frame(bottomFrame);
        WebElement content = driver.findElement(By.tagName("body"));
        String actualText = content.getText();
        Assert.assertEquals(actualText,"BOTTOM");
        return this;
    }
}





