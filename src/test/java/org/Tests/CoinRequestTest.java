package org.Tests;

import org.PageObjects.CoinRequestPage;
import org.PageObjects.Dashboard;
import org.TestComponents.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class CoinRequestTest extends BaseTests {
    public Dashboard DP;
    public CoinRequestPage Coin;
    public CoinRequestTest() throws IOException {
        super();
    }
    @BeforeClass(alwaysRun = true)
    public void Login() throws InterruptedException {
//        String username = prop.getProperty("username");
//        String password = prop.getProperty("password");
//        DP = loginPage.setLoginBtn(username, password);
        Coin=  loginPage.setCoinsRequestBtn();
    }
//    @BeforeMethod(alwaysRun = true)
//    public void goToCoinsRequestPage(){
//        Coin=  loginPage.setCoinsRequestBtn();
//    }
    @Test(priority = 1)
    public void sampleTemplateDownload(){
      Coin.setDownloadTemplate();
    }
    @Test(priority = 0)
    public void sampleBulkTransactionUpload() throws InterruptedException {
        Coin.setUploadBulkTransaction();

    }
}
