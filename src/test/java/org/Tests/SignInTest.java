package org.Tests;


import org.PageObjects.Dashboard;
import org.TestComponents.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignInTest extends BaseTests {

    public Dashboard DP;

    public SignInTest() throws IOException {
    }

    @Test
    public void SignInPage() throws IOException, InterruptedException {
//    LoginPage loginPage= launchApplication();
//        Dashboard DP = loginPage.setLoginBtn(email,password);
        String currentUrl = loginPage.getCurrentUrl();
        String expectedUrl = prop.getProperty("DashboardUrl"); // replace with the actual expected URL
        Assert.assertEquals(currentUrl, expectedUrl, "Dashboard URL does not match the expected URL.");
    }
    @DataProvider
    public Object[][] getData(){

        return new Object[][] {{"singh.ajay@financepeer.co","School@1234"}};
    }
}



//{"nikhil.kumar@leo1.in","School@1234"},{"superadmin@iihmr.com","5sgJIAw%9)TIwJcS"}