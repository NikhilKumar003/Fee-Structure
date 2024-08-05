package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractComponents {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        super(driver);

        this.driver=driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//input[contains(@type,'Email')]")
    WebElement username;

    @FindBy(xpath = "//input[contains(@type,'password')]")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginBtn;
//    WebElement element = driver.findElement(By.cssSelector("div[style='height:12px;font-size:14px;margin:4px 0px 12px;color:red'][contains(text(), 'email_id does not exist please enter correct username')]"));
    @FindBy(css = "div[style='height:12px;font-size:14px;margin:4px 0px 12px;color:red']")
    WebElement errorMsg;
    @FindBy(xpath = "//span[text()='Forgot password?']")
    WebElement forgetBtn;
    public Dashboard setLoginBtn(String email, String passwordem){
        username.sendKeys(email);
        password.sendKeys(passwordem);
        loginBtn.click();
        Dashboard DP= new Dashboard(driver);
        return DP;

    }
    public void goTo(){
        driver.get("https://institute.leo1.in/institute/login");

    }
    public String errorMessageValidation(){
        waitForWEbElementToAppear(errorMsg);
        return errorMsg.getText();
    }
    public ForgetPassWordPage checkForgotPassword(){
        forgetBtn.click();
        ForgetPassWordPage fp =new ForgetPassWordPage(driver);
        return fp;
    }
}
