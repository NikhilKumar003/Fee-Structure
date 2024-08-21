package org.Tests;


import org.PageObjects.Dashboard;
import org.PageObjects.bulkActionPage;
import org.TestComponents.BaseTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class BulkActionTests extends BaseTests {
    public Dashboard DP;
    public bulkActionPage Bulk;
    public BulkActionTests() throws IOException {
    }
    @BeforeClass
    public void login() throws InterruptedException {
//        String username = prop.getProperty("username");
//        String password = prop.getProperty("password");
//        DP = loginPage.setLoginBtn(username, password);
        Bulk = loginPage.setBulkActions();
    }
    @Test(priority = 0)
    public void BulkCapturePayment(){
        Bulk.setCapturePayment();
    }
    @Test(priority = 1)
    public void BulkBulkFee(){
        Bulk.setBulkFee();
    }
}
