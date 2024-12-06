package com_TheInternet_Tests;

import theInternet.pages.DragAndDropPage;
import theInternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDropTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDragDrop();
    }

    @Test
    public void dragDropTest() {
        new DragAndDropPage(driver).dragAction().verifyDropText("A");
    }
}
