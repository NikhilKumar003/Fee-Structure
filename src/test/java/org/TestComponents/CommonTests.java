package org.TestComponents;

import org.PageObjects.Dashboard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class CommonTests extends BaseTests {

    public Dashboard DP;

    public CommonTests() throws IOException {
    }

    @BeforeMethod
    public void goToMyAccountList(){
        loginPage.setAccountBtn();
    }

    @Test(priority = 0)
    public void MyProfileBtn() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.setMyProfileBtn();

    }

    @Test(priority = 1)
    public void ChangePasswordBtn()  {
        loginPage.setChangePasswordBtn();
    }
    @Test(priority = 4)
    public void signOutBtn(){
      loginPage.setSignOutBtn();
    }

    @Test(priority = 2)
    public void ResetStudentPassword()  {
        loginPage.setResetStudentPasswordBtn();

    }

    @Test(priority = 3)
    public void ChangeRegisterNumber() {
        loginPage.setChangeRegisteredBtn();

    }
}