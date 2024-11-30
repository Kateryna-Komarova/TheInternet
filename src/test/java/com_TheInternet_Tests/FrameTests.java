package com_TheInternet_Tests;

import com_TheInternet_Pages.FramePage;
import com_TheInternet_Pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFrameLink();
    }


    @Test
    public void positiveIFrame(){
        new FramePage(driver).getIframe().verifyIframe("An iFrame containing the TinyMCE WYSIWYG Editor");
    }

    @Test
    public void switchToTheFirstFrame(){
        new FramePage(driver).getNestedFrames().getFirstFrame();
    }

    @Test
    public void switchToTheSecondFrame(){
        new FramePage(driver).getNestedFrames().getSecondFrame();

    }

    @Test
    public void switchToTheThirdFrame(){
        new FramePage(driver).getNestedFrames().getThirdFrame();

    }

}
