package org.Tests;


import org.PageObjects.Dashboard;
import org.PageObjects.bulkActionPage;
import org.TestComponents.BaseTests;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class BulkActionTests extends BaseTests {

    public Dashboard DP;
    public bulkActionPage Bulk;

    @Test(groups = {"SanityCheck"})
    public void BulkSampleTemplate() throws IOException {

//    LoginPage loginPage= launchApplication();
        DP = loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
        Bulk = loginPage.setBulkActions();
        Bulk.setSampleTemplate();

    }

    @Test
    public void BulkUploadStudentInBulk() {
        DP = loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
        Bulk = loginPage.setBulkActions();
        Bulk.setUploadStudentsInBulk();
        String errMsg= Bulk.CheckErrorMsg();
        Assert.assertTrue(errMsg.equalsIgnoreCase("File not selected. Please Choose File to upload"));
    }
    @Test(groups = {"SanityCheck"})
    public void BulkCapturePayment(){
        Bulk = loginPage.setBulkActions();
        Bulk.setCapturePayment();
    }
    @Test(groups = {"SanityCheck"})
    public void BulkBulkFee(){
//        DP = loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
        Bulk = loginPage.setBulkActions();
        Bulk.setBulkFee();
    }
}
