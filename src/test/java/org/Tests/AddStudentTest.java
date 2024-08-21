package org.Tests;

import org.PageObjects.AddStudentPage;
import org.PageObjects.Dashboard;
import org.TestComponents.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddStudentTest extends BaseTests {

    public Dashboard DP;
    public AddStudentPage AddStudent;

    public AddStudentTest() throws IOException {
    }

    @BeforeClass
    public void login() throws InterruptedException {
//        String username = prop.getProperty("username");
//        String password = prop.getProperty("password");
//        DP = loginPage.setLoginBtn(username, password);
        AddStudent = loginPage.setAddStudentBtn();
    }

//    @BeforeMethod
//    public void goToAddStudentPage() {
//        AddStudent = loginPage.setAddStudentBtn();
//    }


    @Test
    public void setAddStudent() {
        AddStudent.setAddStudentDetails();
    }

//    @Test
//    public void checkStudentDetails(){
//
//    }
}
