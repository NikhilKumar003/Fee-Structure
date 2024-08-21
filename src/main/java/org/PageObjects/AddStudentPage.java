package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddStudentPage  extends AbstractComponents {
    WebDriver driver;
    JavascriptExecutor js ;
    public AddStudentPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[text()='Mandatory Fields']")
    WebElement textHeader;
    @FindBy(css = "input[placeholder='Student Name']")
    WebElement studentName;
    @FindBy(css = "input[placeholder='Student Mobile Number']")
    WebElement studentMobile;
    @FindBy(css = "input[placeholder='Student Id']")
    WebElement studentId;
    @FindBy(xpath= "//div[contains(@class, ' css-yi2ntm-control')]")
    WebElement selectCourseDropDwn;
    @FindBy(xpath = "//div[text()='Operations']")
    WebElement selectCourse;
    @FindBy(xpath= "//div[contains(@class, ' css-yi2ntm-control')]")
    WebElement selectClassDropDwn;
    @FindBy(xpath= "//div[text()='Operations - Leo Card']")
    WebElement selectClass;
    @FindBy(css= "input[placeholder='Email Id']")
    WebElement emailId;
    @FindBy(css= "input[placeholder='Parent Name']")
    WebElement parentName;
    @FindBy(css= "input[placeholder='Parent Mobile Number']")
    WebElement parentMobile;
    @FindBy(xpath= "(//button[text()='Next'])")
    WebElement NextBtn;
    @FindBy(xpath= "//input[@placeholder='Min Kyc Id']")
    WebElement minKycId;
    @FindBy(xpath= "//button[text()='Submit']")
    WebElement SubmitBtn;
    @FindBy(xpath= "//h3[text()='Optional Fields']")
    WebElement OptionalText;

    public void setAddStudentDetails(){
        waitForWEbElementToAppear(textHeader);
        Actions actions =new Actions(driver);
        actions.moveToElement(NextBtn).perform();
        studentName.sendKeys("Test Nikhil");
        studentMobile.sendKeys("7841233549");
        studentId.sendKeys("GT103Q79");

        selectCourseDropDwn.click();
        selectCourse.click();
        selectClassDropDwn.click();
        selectClass.click();
        emailId.sendKeys("nikhil.kumar@leo1.in");
        parentName.sendKeys("Kishan");
        parentMobile.sendKeys("7842290542");
        NextBtn.click();
        waitForWEbElementToAppear(OptionalText);
        minKycId.sendKeys("AEDER4563W");
        SubmitBtn.click();




    }
}
