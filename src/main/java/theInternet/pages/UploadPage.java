package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UploadPage extends BasePage {
    public UploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement upload;
    @FindBy(id = "file-submit")
    WebElement submit;

    public UploadPage uploadFile(String path) {
        upload.sendKeys(path);
        pause(1000);
        click(submit);
        return this;
    }

    @FindBy(tagName = "h3")
    WebElement verifyText;

    public UploadPage verifyUpload() {
        Assert.assertEquals(verifyText.getText(), "File Uploaded!");
        return this;
    }
}
