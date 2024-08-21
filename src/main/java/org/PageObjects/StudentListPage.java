package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentListPage extends AbstractComponents {

    WebDriver driver;

    public StudentListPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Student']")
    WebElement AddStudentBtn;
    @FindBy(css = "input#search-input.pl-2.py-2.f-13")
    WebElement SearchBtn;
    @FindBy(xpath = "//span[text()='Download All']")
    WebElement DownloadAlBtn;
    @FindBy(xpath = "//button[text()='Send Reminder']")
    WebElement SendRemainderBtn;
    @FindBy(xpath = "//button[text()='Capture Payment']")
    WebElement CapturePayBtn;
    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement CancelBtn;
    @FindBy(xpath = "//span[text()='View/Modify']")
    WebElement viewFeeDetails;
    @FindBy(xpath = "//div[text()='Student ID']")
    WebElement StudentIdText;
    @FindBy(xpath = "//img[@alt='close']")
    WebElement CloseBtn;


    public void SearchStudentDetails(String Detail) throws InterruptedException  {
        waitForWEbElementToAppear(StudentIdText);
        SearchBtn.sendKeys(Detail);
//        waitForWEbElementToAppear(StudentIdText);
        Thread.sleep(2000);
//        waitForWEbElementToAppear(viewFeeDetails);


    }
    public StudentDetailsPage setViewFeeDetails(){
        viewFeeDetails.click();
        return new StudentDetailsPage(driver);
    }

    public void SendRemainderKaro(){
        SendRemainderBtn.click();
        waitForWEbElementToAppear(CancelBtn);
        CancelBtn.click();
    }
    public void CapturePaymentKaro(){
        CapturePayBtn.click();
        CloseBtn.click();

    }
    public void SetDownloadStudentList() throws InterruptedException {
        waitForWEbElementToAppear(DownloadAlBtn);
        Thread.sleep(2000);
        DownloadAlBtn.click();
    }
}
