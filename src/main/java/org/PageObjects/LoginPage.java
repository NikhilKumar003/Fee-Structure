package org.PageObjects;

import dev.failsafe.internal.util.Assert;
import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class LoginPage extends AbstractComponents {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Dashboard DP;

    @FindBy(xpath = "//input[contains(@type,'Email')]")
    WebElement username;

    @FindBy(xpath = "//input[contains(@type,'password')]")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginBtn;

    @FindBy(css = "div[style='height:12px;font-size:14px;margin:4px 0px 12px;color:red']")
    WebElement errorMsg;
    @FindBy(xpath = "//span[text()='Forgot password?']")
    WebElement forgetBtn;
    @FindBy(xpath = "//div[contains(text(),'email_id does not exist')]")
    WebElement ErrorMsgForInvalidLoginCredentials;
    @FindBy(xpath = "//h2[contains(text(),'Welcome')]")
    WebElement DashboardHeader;

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public Dashboard setLoginBtn(String email, String passwordem) throws InterruptedException {
        username.sendKeys(email);
        password.sendKeys(passwordem);
        loginBtn.click();
        String beforeUrl = getCurrentUrl();
        Thread.sleep(2000);

//            System.out.println("after -->"+getCurrentUrl();
        if (beforeUrl.equals(getCurrentUrl())) {
            System.out.println(getCurrentUrl());
            DP = new Dashboard(driver);
            return DP;


        } else {
            waitForWEbElementToAppear(DashboardHeader);
            System.out.println(getCurrentUrl());
            DP = new Dashboard(driver);
            return DP;
        }
    }

    public String errorMessageValidation() {
        waitForWEbElementToAppear(errorMsg);
        return errorMsg.getText();
    }

    public ForgetPassWordPage checkForgotPassword() {
        forgetBtn.click();
        ForgetPassWordPage fp = new ForgetPassWordPage(driver);
        return fp;
    }
}
