package org.Tests;


import org.PageObjects.Dashboard;
import org.PageObjects.ForgetPassWordPage;
import org.PageObjects.StudentListPage;
import org.TestComponents.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class StudentListTest extends BaseTests {

    @Test(groups = {"SanityCheck"})
    public void SendRemainderToStudent() throws IOException {
        Dashboard DP = loginPage.setLoginBtn("nikhil.kumar@leo1.in", "School@1234");
        StudentListPage studentPage = loginPage.setStudentListBtn();
        studentPage.SendRemainderKaro();
    }

    @Test
    public void searchStudentListWithRemainder() throws InterruptedException{
        loginPage.setLoginBtn("nikhil.kumar@leo1.in", "School@1234");
        StudentListPage studentPage = loginPage.setStudentListBtn();
        studentPage.SearchStudentDetails("nikhil");
        studentPage.SendRemainderKaro();
    }

    @Test
    public void searchStudentListWithCapture() throws InterruptedException {
         loginPage.setLoginBtn("nikhil.kumar@leo1.in", "School@1234");
        StudentListPage studentPage = loginPage.setStudentListBtn();
        studentPage.SearchStudentDetails("nikhil");
        studentPage.SendRemainderKaro();
        studentPage.CapturePaymentKaro();
    }
    @Test
    public void DownloadStudentList() throws InterruptedException {
        loginPage.setLoginBtn("nikhil.kumar@leo1.in","School@1234");
        StudentListPage studentPage = loginPage.setStudentListBtn();
        studentPage.SetDownloadStudentList();
    }


}



