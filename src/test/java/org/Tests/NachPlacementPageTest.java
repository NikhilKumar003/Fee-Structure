package org.Tests;

import org.PageObjects.NachPlacementPage;
import org.TestComponents.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class NachPlacementPageTest extends BaseTests {

    public NachPlacementPage nachPage;
    public NachPlacementPageTest() throws IOException {
    }
    @BeforeClass
    public void login() throws InterruptedException {
        nachPage =loginPage.setNachPlacement();
    }

    @BeforeMethod
    public void goToDashBoardPage() throws InterruptedException {

    }
    @Test
    public void setNachPage(){
        nachPage.setNachPlacement();

    }
}
