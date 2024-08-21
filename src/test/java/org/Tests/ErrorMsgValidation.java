package org.Tests;


import org.PageObjects.Dashboard;
import org.PageObjects.ForgetPassWordPage;
import org.TestComponents.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ErrorMsgValidation extends BaseTests {

    public ErrorMsgValidation() throws IOException {
    }

    @Test
    public void checkErrorMsg() throws IOException, InterruptedException {


         loginPage.setLoginBtn("nikhil.kumvar@leo1.in", "School@1234");
//        loginPage.errorMessageValidation();

        Assert.assertEquals("email_id does not exist please enter correct username", loginPage.errorMessageValidation());
    }
    @Test(dependsOnMethods = {"checkErrorMsg"},groups = {"SanityCheck"})
    public void resetPassword(){
     ForgetPassWordPage fp=loginPage.checkForgotPassword();
     fp.resetPage("nikhil.kumar@leo1.in");


    }



}
