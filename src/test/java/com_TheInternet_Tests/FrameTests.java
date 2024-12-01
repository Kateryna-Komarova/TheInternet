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
        new FramePage(driver).getIframe()
                .returnListOfframe()
                .switchToIframeByIndex(0)
                .verifyIframeByText("Your content goes here.");
    }

    @Test
    public  void nestedFrameTestLeft(){
        new FramePage(driver).getNestedFrames().getTopFrame();
    }

    @Test
    public  void nestedFrameTestMiddle(){
        new FramePage(driver).getNestedFrames().middleFrame();
    }

    @Test
    public void nestedFrameTestRight(){
        new FramePage(driver).getNestedFrames().rightFrame();

    }

    @Test
    public void nestedFrameTestBottom(){
        new FramePage(driver).getNestedFrames().getBottom();
    }
}
