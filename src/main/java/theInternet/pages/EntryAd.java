package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EntryAd extends BasePage{
    public EntryAd(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "restart-ad")
    WebElement restart;
    @FindBy(xpath = "//p[contains(text(),'Close')]")
    WebElement close;

    public EntryAd getClickButton() {
        click(restart);
        pause(1000);
        click(close);
        return this;

    }
    @FindBy(id = "page-footer")
    WebElement footer;

    public EntryAd verifyCloseAd() {
        Assert.assertTrue(shouldHaveText(footer,"Powered by Elemental Selenium",5));
        return this;
    }
}
