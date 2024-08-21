package org.Tests;


import org.PageObjects.Dashboard;
import org.PageObjects.ForgetPassWordPage;
import org.PageObjects.StudentDetailsPage;
import org.PageObjects.StudentListPage;
import org.TestComponents.BaseTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class StudentListTest extends BaseTests {
    public Dashboard DP;
    public StudentDetailsPage DetailsPage;
    public StudentListPage studentListPage;

    public StudentListTest() throws IOException {
    }

    @BeforeClass
    public void login() throws InterruptedException {
//        String username = prop.getProperty("username");
//        String password = prop.getProperty("password");
//        DP = loginPage.setLoginBtn(username, password);
        studentListPage = loginPage.setStudentListBtn();
    }

    @BeforeMethod
    public void goToDashBoardPage() throws InterruptedException {
//        studentListPage = loginPage.setStudentListBtn();
    }

    @Test(priority = 1)
    public void SendRemainderToStudent() throws InterruptedException {
        String mobileNumber = prop.getProperty("searchMobile");
        studentListPage.SearchStudentDetails(mobileNumber);
        studentListPage.SendRemainderKaro();
    }
    @Test(priority = 2)
    public void searchStudentListWithCapture() throws InterruptedException {
        studentListPage.CapturePaymentKaro();
    }
    @Test(priority = 0)
    public void DownloadStudentList() throws InterruptedException {
        studentListPage.SetDownloadStudentList();
    }

}



