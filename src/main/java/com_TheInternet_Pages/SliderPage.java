package com_TheInternet_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='range']")
    WebElement slider;

    public SliderPage moveSlider() {

        new Actions(driver).dragAndDropBy(slider, 200, 0).perform();
        pause(1000);
        return this;

    }

    @FindBy(id = "range")
    WebElement range;

    public void verifySliderValue(String text) {
        Assert.assertTrue(shouldHaveText(range, text, 5));

    }
}
