package org.AbstractComponents;

import org.PageObjects.AddStudentPage;
import org.PageObjects.CoinRequestPage;
import org.PageObjects.StudentListPage;
import org.PageObjects.bulkActionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {
    WebDriver driver;

    public AbstractComponents(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath= "//span[contains(text(),'Add Student')]")
    WebElement AddStudentBtn;

    @FindBy(xpath = "//span[contains(text(),'Fee Payment')]")
    WebElement FeePaymentBtn;
    @FindBy(xpath = "//span[contains(text(),'Fee Structure')]")
    WebElement FeeStructBtn;
    @FindBy(xpath = "//span[contains(text(),'Bulk Actions')]")
    WebElement bulkActionsBtn;
    @FindBy(xpath = "//span[contains(text(),'Student List')]")
    WebElement StudentListBtn;
    @FindBy(xpath = "//span[contains(text(),'Coins Request')]")
    WebElement CoinsRequestBtn;
    @FindBy(css="img[alt='avatar']")
    WebElement AccountBtn;
    @FindBy(css="div.ml-2")
    WebElement SignOutBtn;
    @FindBy(css="span.ml-2.flex-grow-1")
    WebElement MyProfileBtn;
    @FindBy(xpath = "//span[text()='Change Password']")
    WebElement ChangePasswordBtn;
    @FindBy(xpath = "//a[.='Reset student password']")
    WebElement ResetStudentPasswordBtn;
    @FindBy(xpath = "//a[.='Change Registered Ph.']")
    WebElement ChangeRegisteredBtn;




    public void waitForElementToAppear(By findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    public void waitForWEbElementToAppear(WebElement findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }


    public void setFeeStructBtn() {
        FeePaymentBtn.click();
        FeeStructBtn.click();
    }

    public bulkActionPage setBulkActions() {
        FeePaymentBtn.click();
        bulkActionsBtn.click();
        bulkActionPage Bulk= new bulkActionPage(driver);
        return Bulk;
    }
    public StudentListPage setStudentListBtn(){
        FeePaymentBtn.click();
        StudentListBtn.click();
        StudentListPage studentPage = new StudentListPage(driver);
        return studentPage;

    }
    public CoinRequestPage setCoinsRequestBtn(){
        FeePaymentBtn.click();
        CoinsRequestBtn.click();
        CoinRequestPage coinRequestPage = new CoinRequestPage(driver);
        return coinRequestPage;

    }
    public AddStudentPage setAddStudentBtn(){
        AddStudentBtn.click();
        AddStudentPage addStudentPage = new AddStudentPage(driver);
        return addStudentPage;
    }
    public void setMyProfileBtn(){
        AccountBtn.click();
        MyProfileBtn.click();

    }
    public void setSignOutBtn(){
        AccountBtn.click();
        SignOutBtn.click();
    }
    public void setChangePasswordBtn(){
        AccountBtn.click();
        ChangePasswordBtn.click();
    }
    public void setResetStudentPasswordBtn(){
        AccountBtn.click();
        ResetStudentPasswordBtn.click();
    }
    public void setChangeRegisteredBtn(){
        AccountBtn.click();
        ChangeRegisteredBtn.click();
    }
//Absolute path
//    C:\Users\Thinkpad\FeeStructure

    public void moveToAction(){
        Actions actions =new Actions(driver);

    }
}
