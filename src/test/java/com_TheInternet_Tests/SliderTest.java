package com_TheInternet_Tests;

import com_TheInternet_Pages.HomePage;
import com_TheInternet_Pages.SliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getHorizontalSlider();
    }

    @Test
    public void sliderTest(){
        new SliderPage(driver).moveSlider().verifySliderValue("5");
    }
}
