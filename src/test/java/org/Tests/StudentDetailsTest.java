package org.Tests;

import net.bytebuddy.implementation.bytecode.Throw;
import org.PageObjects.Dashboard;
import org.PageObjects.StudentDetailsPage;
import org.PageObjects.StudentListPage;
import org.TestComponents.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StudentDetailsTest extends BaseTests {

    public Dashboard DP;
    public StudentDetailsPage DetailsPage;
    public StudentListPage studentListPage;

    public StudentDetailsTest() throws IOException {
    }

    @BeforeClass
    public void login() throws InterruptedException, IOException {
    }


    @BeforeMethod
    public void goToStudentListPage() throws InterruptedException {
        studentListPage = loginPage.setStudentListBtn();
        String mobileNumber = prop.getProperty("mobileNumber");
        studentListPage.SearchStudentDetails(mobileNumber);
    }

    @Test(priority = 0)
    public void setFeeDetails() throws InterruptedException {

        DetailsPage = studentListPage.setViewFeeDetails();
        DetailsPage.ViewFeeBtn();
    }

    @Test(priority = 1)
    public void setTransactionDetails() throws InterruptedException {
        DetailsPage = studentListPage.setViewFeeDetails();
        DetailsPage.TransactionBtn();
    }

    @Test(priority = 2, enabled = true)
    public void setCapturePayment() {
        DetailsPage = studentListPage.setViewFeeDetails();
        DetailsPage.CaptureBtn();
    }

    @Test(priority = 3)
    public void setRefundDetails() {
        DetailsPage = studentListPage.setViewFeeDetails();
        DetailsPage.RefundBtn();

    }

    @Test(priority = 4)
    public void setWavierDetails() {
        DetailsPage = studentListPage.setViewFeeDetails();
        DetailsPage.WavierBtn();

    }
}
