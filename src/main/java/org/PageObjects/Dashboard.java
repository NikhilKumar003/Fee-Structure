package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends AbstractComponents {

    WebDriver driver;

    public Dashboard(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.text-center.text-danger.mb-2")
    WebElement ErrorMsg;
    @FindBy(xpath = "//span[text()='Create application']")
    WebElement createApplicationBtn;
    @FindBy(css = "input#formEmail.form-control.form-control-md")
    WebElement enterMobileNumber;
    @FindBy(css = "label.mb-3.form-label")
    WebElement popupText;
    @FindBy(css = "button.btn.btn-primary")
    WebElement submitBtn;

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String ValidateErrorMsg(){
        String ErrMsg= ErrorMsg.getText();
        return ErrMsg;
    }
    public void ApplicationCreation(){
    createApplicationBtn.click();
    waitForWEbElementToAppear(popupText);
    enterMobileNumber.sendKeys("7842290549");
    submitBtn.click();


    }

}
