package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeeStructurePage extends AbstractComponents {

    WebDriver driver;

    public FeeStructurePage(WebDriver driver) {
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
    WebElement ClassExtendBtn;
    @FindBy(css = "div:nth-child(5) div:nth-child(2) input:nth-child(1)")
    WebElement AddClass1;
    @FindBy(css = "div:nth-child(6) div:nth-child(2) input:nth-child(1)")
    WebElement AddClass2;
    @FindBy(css = "button.w-100.rounded-0")
    WebElement AddCourse;
    @FindBy(xpath = "//input[@placeholder='Enter Alias Course Name']")
    WebElement AddAliasCourse;
    @FindBy(xpath = "//div[text()='Class/Year ']")
    WebElement ClassNoText;
    @FindBy(css = "#container > div:nth-child(6) > div.col-md-7 > input")
    WebElement ClassNo1Field;
    @FindBy(css = "#container > div:nth-child(7) > div.col-md-7 > input")
    WebElement ClassNo2Field;
    @FindBy(xpath = "//button[text()='Add New Course']")
    WebElement AddClassBtnInCourseModel;
    @FindBy(xpath = "//img[@alt='close']")
    WebElement CloseBtn;
    @FindBy(xpath = "//span[text()='Class/Fee Entry']")
    WebElement AddClassBtn;
    @FindBy(xpath = "(//div[contains(text(),'Select Course')])")
    WebElement selectCourseDropDown;
    @FindBy(xpath = "//div[text()='Test AutoScirpt']")
    WebElement getSelectCourse;
    @FindBy(xpath = "//span[text()='Add New Class/Year/Fee Entry']")
    WebElement AddClassHeader;
    @FindBy(xpath = "//div[text()='Fee Structure']")
    WebElement FeeStructureHeader;

    public void AddCourse(String courseName, String Alias, String NoOfClasses, String class1, String class2) throws InterruptedException {
        CourseBtn.click();
        CourseName.sendKeys(courseName);
        AddAliasCourse.sendKeys(Alias);
        ClassNoS.sendKeys(NoOfClasses);
        waitForWEbElementToAppear(ClassExtendBtn);
        ClassExtendBtn.click();
        waitForWEbElementToAppear(ClassNoText);
        ClassNo1Field.sendKeys(class1);
        ClassNo2Field.sendKeys(class2);
        waitForWEbElementToAppear(AddClassBtnInCourseModel);
        AddClassBtnInCourseModel.click();
        Thread.sleep(2000);
        CloseBtn.click();
    }

    public void AddClass() {
        waitForWEbElementToAppear(FeeStructureHeader);
        AddClassBtn.click();
        waitForWEbElementToAppear(AddClassHeader);
        CloseBtn.click();
    }


}