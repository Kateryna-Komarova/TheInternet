package theInternet.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import theInternet.utils.MyListener;

import java.time.Duration;

public class ApplicationManager {
    public WebDriver driver;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public WebDriver startTest() {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser != null && !browser.equals("chrome") && !browser.equals("firefox")) {
            throw new IllegalArgumentException("Browser entered is not correct");
        } else if (browser.equals("safari")) {
            driver = new SafariDriver();
        }
        driver = new EventFiringDecorator(new MyListener()).decorate(driver);

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public void stopTest() {
        driver.quit();
    }
}
