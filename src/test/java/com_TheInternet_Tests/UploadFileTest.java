package com_TheInternet_Tests;

import theInternet.pages.HomePage;
import theInternet.pages.UploadPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFileTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getUploadLink();
    }

    @Test
    public void uploadFileTest() {
        new UploadPage(driver).uploadFile("/Users/kato/Tools/868.jpg").verifyUpload();
    }
}
