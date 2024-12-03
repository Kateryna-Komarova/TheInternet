package com_TheInternet_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownPage extends BasePage {
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropDown;

    public DropdownPage selectOption(String text) {
        Select select = new Select(dropDown);//new Select(dropDown).selectByVisibleText(text);
        select.selectByVisibleText(text);
        return this;
    }

    public DropdownPage verifyTextOption() {
        String firstSelectedOption = new Select(dropDown).getFirstSelectedOption().getText();
        Assert.assertTrue(shouldHaveText(dropDown, firstSelectedOption, 4),
                "Expected text '" + firstSelectedOption + "' was not found in the dropdown element.");
        return this;
    }
}
