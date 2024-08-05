package org.Tests;

import org.PageObjects.CoinRequestPage;
import org.PageObjects.Dashboard;
import org.TestComponents.BaseTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CoinRequestTest extends BaseTests {

    public Dashboard DP;

    public CoinRequestPage Coin;
//    @BeforeTest
//    public void commonLogin(){
//        DP =   loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
//    }

    @Test
    public void sampleTemplateDownload(){
     DP =   loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
      Coin=  loginPage.setCoinsRequestBtn();
      Coin.setDownloadTemplate();
    }

    @Test
    public void sampleBulkTransactionUpload() throws InterruptedException {
        DP =   loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
        Coin=  loginPage.setCoinsRequestBtn();
        Coin.setUploadBulkTransaction();

    }
}
