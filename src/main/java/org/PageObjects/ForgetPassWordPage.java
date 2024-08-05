package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassWordPage extends AbstractComponents {

    WebDriver driver;

    public ForgetPassWordPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Enter your email']")
    WebElement emailText;
    @FindBy(css = "button.btn.ripple.btn-main-primary")
    WebElement resetBtn;
   @FindBy(css = "span.forgetPassword")
    WebElement backTOLoginPage;
    @FindBy(css="h5.text-start")
    WebElement forgetText;
    @FindBy(css="button.btn.btn-primary")
    WebElement DoneBtn;


    public void resetPage(String email) {
        waitForWEbElementToAppear(forgetText);

        emailText.sendKeys(email);
        resetBtn.click();
        waitForWEbElementToAppear(DoneBtn);
        DoneBtn.click();

    }

    public void BackToLogin() {
        backTOLoginPage.click();

    }
}
