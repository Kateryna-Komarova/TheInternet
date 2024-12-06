package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id='checkboxes']/input[1]")
    WebElement checkboxFirst;
    @FindBy(xpath = "//*[@id='checkboxes']/input[2]")
    WebElement checkboxSecond;

    public CheckBoxPage chooseCheckBox(String[] checkBox) {
        for (int i = 0; i < checkBox.length; i++) {
            if (checkBox[i].equals("checkbox 1")) {
                click(checkboxFirst);
            }
            if (checkBox[i].equals("checkbox 2")) {
                click(checkboxSecond);
            }
        }

        return this;
    }

    public CheckBoxPage verifyCheckBox() {
        Assert.assertNotNull(checkboxFirst.getAttribute("checked"), "Checkbox is not checked!");
        return this;
    }
}
