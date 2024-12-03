package com_TheInternet_Tests;

import com_TheInternet_Pages.HomePage;
import com_TheInternet_Pages.MultipleWindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getMultipleWindow();
    }

    @Test
    public void multiWindow() {
        new MultipleWindowPage(driver).switchToNewWindow(1)
                .verifyWindowTitle("New Window");
    }
}
