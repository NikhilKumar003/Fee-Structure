package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    @FindBy(css = "svg.MuiSvgIcon-root")
    WebElement getSearchBtn;
    @FindBy(css = "#react-select-4-placeholder")
    WebElement SelectInstitute;
    @FindBy(xpath = "//div[text()='Reset']")
    WebElement ResetBtn;
    @FindBy(xpath = "//button[text()='Apply']")
    WebElement ApplyBtn;
    @FindBy(xpath = "//div[text()='Select Course']")
    WebElement SelectCourse;

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
    public void selectInstituteBranchReset(){
        Actions actions =new Actions(driver);
        getSearchBtn.click();
        actions.sendKeys(SelectInstitute,"GTPL").sendKeys(Keys.ENTER).perform();

        ResetBtn.click();
    }
    public void selectInstituteBranchApply(){
        Actions actions =new Actions(driver);
        getSearchBtn.click();
        actions.sendKeys(SelectInstitute,"TEST").sendKeys(Keys.ENTER).perform();
        ApplyBtn.click();

    }

}
