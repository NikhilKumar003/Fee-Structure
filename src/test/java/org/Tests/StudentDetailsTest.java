package org.Tests;

import net.bytebuddy.implementation.bytecode.Throw;
import org.PageObjects.Dashboard;
import org.PageObjects.StudentDetailsPage;
import org.PageObjects.StudentListPage;
import org.TestComponents.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentDetailsTest extends BaseTests {

    public Dashboard DP;
    public StudentDetailsPage DetailsPage;
    public StudentListPage studentListPage;

    @BeforeClass
    public void login() throws InterruptedException {
        DP = loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");

    }

    @BeforeMethod
    public void goToStudentListPage() throws InterruptedException {
        studentListPage = DP.setStudentListBtn();
        studentListPage.SearchStudentDetails("7801233458");
    }

    @Test(priority = 0)
    public void setFeeDetails() throws InterruptedException {
//    DP =   loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
//    studentListPage = loginPage.setStudentListBtn();
//        studentListPage.SearchStudentDetails("7801233458");
        DetailsPage = studentListPage.setViewFeeDetails();
        DetailsPage.ViewFeeBtn();
    }

    @Test(priority = 1)
    public void setTransactionDetails() throws InterruptedException {
//      DP =   loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
//      studentListPage = loginPage.setStudentListBtn();
//      studentListPage.SearchStudentDetails("7842290549");
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
