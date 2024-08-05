package org.Tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.PageObjects.Dashboard;
import org.PageObjects.LoginPage;
import org.TestComponents.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SignIn extends BaseTests {

    @Test(dataProvider = "getData",groups = {"SuperAdmin"})
    public void SignInPage(String email, String password) throws IOException {

//    LoginPage loginPage= launchApplication();
        Dashboard DP = loginPage.setLoginBtn(email,password);

    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][] {{"singh.ajay@financepeer.co","School@1234"},{"nikhil.kumar@leo1.in","School@1234"},{"superadmin@iihmr.com","5sgJIAw%9)TIwJcS"}};
    }
}

