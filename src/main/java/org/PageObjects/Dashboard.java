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

    By BtnVisible = By.cssSelector("div[role='button']");
    @FindBy(xpath = "//span[text()='Course']")
    WebElement CourseBtn;

    @FindBy(xpath = "//input[@placeholder='Enter Course Name']")
    WebElement CourseName;

    @FindBy(xpath = "//input[@type='number']")
    WebElement ClassNoS;

    @FindBy(css = "div[role='button']")
    WebElement ClassBtn;
    @FindBy(css = "div:nth-child(5) div:nth-child(2) input:nth-child(1)")
    WebElement AddClass1;
    @FindBy(css = "div:nth-child(6) div:nth-child(2) input:nth-child(1)")
    WebElement AddClass2;
    @FindBy(css = "button.w-100.rounded-0")
    WebElement AddCourse;
    @FindBy(css = "div.text-center.text-danger.mb-2")
    WebElement ErrorMsg;

    public void AddCourse(String courseName, String NoOfClasses) {
        CourseBtn.click();
        CourseName.sendKeys(courseName);
        ClassNoS.sendKeys(NoOfClasses);
        waitForElementToAppear(BtnVisible);
        ClassBtn.click();


    }
    public void AddClassNames(String Class1, String Class2){
        AddClass1.sendKeys(Class1);
        AddClass2.sendKeys(Class2);
        AddCourse.click();

    }
    public String ValidateErrorMsg(){
        String ErrMsg= ErrorMsg.getText();
        return ErrMsg;
    }


}
