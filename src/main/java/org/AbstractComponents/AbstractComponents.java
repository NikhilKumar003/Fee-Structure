package org.AbstractComponents;

import org.PageObjects.*;
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
    @FindBy(xpath = "//p[@class='Profile_mainNotificationText__Z3BJy']")
    WebElement AccountText;
    @FindBy(xpath = "//div[text()='My Profile']")
    WebElement MyProfileTextInAccountPage;
    @FindBy(xpath = "//span[text()='Back to dashboard']")
    WebElement BackToDashboardBtn;
    @FindBy(xpath = "//div[text()=' Change Password']")
    WebElement changePasswordText;
    @FindBy(xpath = "//button[text()='Reset']")
    WebElement ResetBtnInChangePassword;

    public void waitForElementToAppear(By findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }
    public void waitForWEbElementToAppear(WebElement findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }
    public FeeStructurePage setFeeStructBtn() {
        FeePaymentBtn.click();
        FeeStructBtn.click();
        FeeStructurePage FS =new FeeStructurePage(driver);
        return FS;
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
        waitForWEbElementToAppear(FeePaymentBtn);
        FeePaymentBtn.click();
        waitForWEbElementToAppear(CoinsRequestBtn);
        CoinsRequestBtn.click();
        CoinRequestPage coinRequestPage = new CoinRequestPage(driver);
        return coinRequestPage;

    }
    public AddStudentPage setAddStudentBtn(){
        AddStudentBtn.click();
        AddStudentPage addStudentPage = new AddStudentPage(driver);
        return addStudentPage;
    }
    public void setAccountBtn(){
        AccountBtn.click();
        waitForWEbElementToAppear(AccountText);
    }
    public void setMyProfileBtn(){
        MyProfileBtn.click();
        waitForWEbElementToAppear(MyProfileTextInAccountPage);
        BackToDashboardBtn.click();
    }
    public void setSignOutBtn(){
//        AccountBtn.click();
        SignOutBtn.click();
    }
    public void setChangePasswordBtn(){
        ChangePasswordBtn.click();
        waitForWEbElementToAppear(changePasswordText);
        ResetBtnInChangePassword.click();
    }
    public void setResetStudentPasswordBtn(){
        waitForWEbElementToAppear(ResetStudentPasswordBtn);
        ResetStudentPasswordBtn.click();
    }
    public void setChangeRegisteredBtn(){
        waitForWEbElementToAppear(ChangeRegisteredBtn);
        ChangeRegisteredBtn.click();
    }
    public void moveToAction(){
        Actions actions =new Actions(driver);
    }
    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }
}
