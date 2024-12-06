package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//*[@id='login']/button")
    WebElement login;

    public LoginPage enterUserData(String Name, String UserPassword) {
        type(username, Name);
        type(password, UserPassword);
        click(login);
        return this;
    }

    @FindBy(tagName = "h4")
    WebElement flash;

    public LoginPage verifyLogin() {
        Assert.assertTrue(shouldHaveText(flash, "Welcome to the Secure Area. When you are done click logout below.", 5));
        return this;
    }

    @FindBy(xpath = "//*[@id='content']/div/a/i")
    WebElement logOut;

    public LoginPage logOutUser() {
        click(logOut);
        return this;
    }

    @FindBy(tagName = "h2")
    WebElement loginPage;

    public LoginPage verifyLogOut() {
        Assert.assertTrue(shouldHaveText(loginPage, "Login Page", 5));
        return this;
    }
}
