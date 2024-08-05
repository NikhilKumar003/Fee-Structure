package org.Tests;

import org.PageObjects.AddStudentPage;
import org.PageObjects.Dashboard;
import org.TestComponents.BaseTests;
import org.testng.annotations.Test;

public class AddStudentTest extends BaseTests {

    public Dashboard DP;
    public AddStudentPage AddStudent;

    @Test
    public void setAddStudent(){
        DP =   loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
        AddStudent =loginPage.setAddStudentBtn();
        AddStudent.setAddStudentDetails();


    }
}
