package org.TestComponents;

import org.PageObjects.Dashboard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CommonTests extends BaseTests {

    public Dashboard DP;

    @Test
    public void MyProfileBtn() throws InterruptedException {
        DP = loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
        loginPage.setMyProfileBtn();
        Thread.sleep(1000);
        loginPage.setSignOutBtn();
    }

    @Test
    public void ChangePasswordBtn() throws InterruptedException {
        DP = loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
//       loginPage.setMyProfileBtn();
        Thread.sleep(1000);
        loginPage.setChangePasswordBtn();
    }

    @Test
    public void ResetStudentPassword() throws InterruptedException {
        DP = loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
        Thread.sleep(1000);
        loginPage.setResetStudentPasswordBtn();

    }

    @Test
    public void ChangeRegisterNumber() throws InterruptedException {
        DP = loginPage.setLoginBtn("singh.ajay@financepeer.co", "School@1234");
        Thread.sleep(1000);
        loginPage.setChangeRegisteredBtn();

    }
}