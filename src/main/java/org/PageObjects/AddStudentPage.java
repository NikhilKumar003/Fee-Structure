package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddStudentPage  extends AbstractComponents {
    WebDriver driver;
    JavascriptExecutor js ;
    public AddStudentPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class, ' css-13cymwt-control')]")
    WebElement selectInstituteDropDown;
    @FindBy(xpath = "//div[text()='JAIPUR SCHOOL OF BUSINESS, JECRC UNIVERSITY']")
    WebElement selectInstitute;
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
    @FindBy(xpath = "//div[text()='FEE SLAB JECRC']")
    WebElement selectCourse;
    @FindBy(xpath= "//div[contains(@class, ' css-yi2ntm-control')]")
    WebElement selectClassDropDwn;
    @FindBy(xpath= "//div[text()='2nd class']")
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



   public void selectCourseFromList(String text){

       By courseList= By.xpath("//div[text()='"+text+"']");
       waitForElementToAppear(courseList);
       getElement(courseList).click();

   }

    public void setAddStudentDetails() throws IOException {
        waitForWEbElementToAppear(textHeader);
        Actions actions =new Actions(driver);
        actions.moveToElement(NextBtn).perform();
        selectInstituteDropDown.click();
        selectInstitute.click();
        studentName.sendKeys("Test Nikhil fee slab");
        studentMobile.sendKeys("3176698449");
            studentId.sendKeys("GT4643H0645fdkf ");

        selectCourseDropDwn.click();
        selectCourse.click();
//        getCourseName();
        selectClassDropDwn.click();
        selectClass.click();
        emailId.sendKeys("nikhil.kumar@leo1.in");
        parentName.sendKeys("Kishan");
        parentMobile.sendKeys("3342290542");
        NextBtn.click();
        waitForWEbElementToAppear(OptionalText);
        minKycId.sendKeys("AEDER4563W");
        SubmitBtn.click();
}
    public WebElement getCourseName(String selectCourse) throws IOException {
//        String selectCourse = prop.getProperty("selectCourse");
        String xpath1 = "//div[text()='" + selectCourse + "']";
        return driver.findElement(By.xpath(xpath1));
    }

}
