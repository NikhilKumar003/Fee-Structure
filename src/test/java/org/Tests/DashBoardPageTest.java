package org.Tests;

import org.PageObjects.Dashboard;
import org.TestComponents.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class DashBoardPageTest extends BaseTests {

    public Dashboard DP;

    public DashBoardPageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void goToHomePage(){
      DP =loginPage.checkLogo();
    }

    @Test
    public void createApplication(){
        DP.ApplicationCreation();
    }
}
