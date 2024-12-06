package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public HomePage getJavaAlerts() {
        click(javaAlerts);
        return this;
    }


    @FindBy(xpath = "//*[@id='content']/ul/li[22]/a")
    WebElement frame;

    public HomePage getFrameLink() {
        click(frame);
        return this;
    }

    @FindBy(css = "#content > ul > li:nth-child(33) > a")
    WebElement multi;

    public HomePage getMultipleWindow() {
        click(multi);
        return this;
    }

    @FindBy(xpath = "//*[@id='content']/ul/li[11]/a")
    WebElement drop;

    public HomePage getDropdown() {
        click(drop);
        return this;
    }

    @FindBy(css = "a[href='/horizontal_slider']")
    WebElement slider;

    public HomePage getHorizontalSlider() {
        click(slider);
        return this;
    }

    @FindBy(css = "a[href='/drag_and_drop']")
    WebElement dragDrop;

    public HomePage getDragDrop() {
        click(dragDrop);
        return this;
    }

    @FindBy(css = "a[href = '/hovers']")
    WebElement hovers;

    public HomePage getHover() {
        click(hovers);
        return this;
    }

    @FindBy(css = "a[href='/broken_images']")
    WebElement brokenImages;

    public HomePage getBrokenImages() {
        click(brokenImages);
        return this;
    }
    @FindBy(xpath = "//a[contains(text(),'Redirect Link')]")
    WebElement redirector;
    public HomePage getRedirectLink() {
        click(redirector);
        return this;
    }
    @FindBy(id = "redirect")
    WebElement redirect;
    public HomePage getStatusCodeLink() {
        click(redirect);
        return this;
    }

    @FindBy(css = "a[href='/upload']")
    WebElement upload;

    public HomePage getUploadLink() {
        click(upload);
        return this;
    }
    @FindBy(css = "a[href='/checkboxes']")
    WebElement checkboxes;

    public HomePage getCheckBox() {
        click(checkboxes);
        return this;
    }

    @FindBy(css = "a[href='/login']")
    WebElement login;

    public HomePage getLoginLink() {
        click(login);
        return this;
    }
}
