package com_TheInternet_Tests;

import com_TheInternet_Pages.HomePage;
import com_TheInternet_Pages.RedirectLinksPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectLinkTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getRedirectLink().getStatusCodeLink();
    }

    @Test
    public void checkBrokenLinks() {
        new RedirectLinksPage(driver).checkBrokenLinks();
    }
}
