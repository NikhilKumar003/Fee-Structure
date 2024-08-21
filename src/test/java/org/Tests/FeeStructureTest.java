package org.Tests;

import org.PageObjects.Dashboard;
import org.PageObjects.FeeStructurePage;
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

public class FeeStructureTest extends BaseTests {

    public Dashboard DP;
    public StudentListPage studentListPage;
    public FeeStructurePage feeStructurePage;
    public FeeStructureTest() throws IOException {
        super();
    }
    @BeforeClass(alwaysRun = true)
    public void login() throws InterruptedException, IOException {
//        String username = prop.getProperty("username");
//        String password = prop.getProperty("password");
//        DP = loginPage.setLoginBtn(username,password);
        feeStructurePage= loginPage.setFeeStructBtn();
    }

//    @BeforeMethod(alwaysRun = true)
//    public void goToFeeStructure(){
//        feeStructurePage= DP.setFeeStructBtn();
//    }

    @Test(priority = 0)
    public void setAddCourse() throws InterruptedException, IOException {
        String courseName = prop.getProperty("courseName");
        String courseDescription = prop.getProperty("courseDescription");
        String courseDuration = prop.getProperty("courseDuration");
        String courseField1 = prop.getProperty("courseField1");
        String courseField2 = prop.getProperty("courseField2");
        feeStructurePage.AddCourse(courseName,courseDescription,courseDuration,
                courseField1,courseField2);
    }
    @Test(priority = 1)
    public void setAddClassDetails()  {
        feeStructurePage.AddClass();
    }
}
