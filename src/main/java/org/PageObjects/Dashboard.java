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

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String ValidateErrorMsg(){
        String ErrMsg= ErrorMsg.getText();
        return ErrMsg;
    }


}
