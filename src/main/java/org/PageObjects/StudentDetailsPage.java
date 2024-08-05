package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Watchable;

public class StudentDetailsPage extends AbstractComponents {

    WebDriver driver;

    public StudentDetailsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()='Fee & Terms']")
    WebElement FeeLinkText;
    @FindBy(xpath = "//button[text()='View/Update']")
    WebElement viewFeeBtn;

    @FindBy(xpath = "//button[text()='Send Reminder']")
    WebElement remainderBtn;
    @FindBy(xpath = "//button[text()='Capture Payment']")
    WebElement captureBtn;
    @FindBy(xpath = "//button[text()='View']")
    WebElement TransactionBtn;
    @FindBy(xpath = "//button[text()='Refund']")
    WebElement RefundBtn;
    @FindBy(xpath = "//button[text()='Waiver']")
    WebElement WavierBtn;
    @FindBy(xpath = "//span[text()='Capture payment']")
    WebElement capturePayText;
    @FindBy(xpath = "//input[@type='number']")
    WebElement AmountField;
    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    WebElement payModeDropDown;
    @FindBy(xpath = "//div[text()='UPI']")
    WebElement selectPayType;
    @FindBy(xpath = "//*[@id=\"container\"]/div[4]/div[2]")
    WebElement AmountText;
    @FindBy(xpath = "//span[text()='Fees View/Update']")
    WebElement FeeModelHeader;
    @FindBy(xpath = "//img[@alt='close']")
    WebElement CloseBtn;
    @FindBy(xpath = "//span[text()='Capture payment']")
    WebElement CaptureModelHeader;
    @FindBy(xpath = "//span[text()='Transactions']")
    WebElement TransactionModelHeader;
    @FindBy(xpath = "//span[text()='Student Refund']")
    WebElement RefundModelHeader;
    @FindBy(xpath = "//span[text()='Student Waiver']")
    WebElement WaiverModelHeader;

    public void ViewFeeBtn() {
        waitForWEbElementToAppear(FeeLinkText);
        viewFeeBtn.click();
        waitForWEbElementToAppear(FeeModelHeader);
        String amount = AmountText.getText();
        System.out.println(amount);
        waitForWEbElementToAppear(FeeModelHeader);
        CloseBtn.click();

    }

    public void CaptureBtn() {
        captureBtn.click();
        waitForWEbElementToAppear(capturePayText);
        AmountField.sendKeys("500");
        payModeDropDown.click();
        selectPayType.click();
        waitForWEbElementToAppear(CaptureModelHeader);
        CloseBtn.click();
    }

    public void TransactionBtn() {
        TransactionBtn.click();
        waitForWEbElementToAppear(TransactionModelHeader);
        CloseBtn.click();

    }

    public void RemainderBtn() {
        remainderBtn.click();
    }

    public void RefundBtn() {
        RefundBtn.click();
        waitForWEbElementToAppear(RefundModelHeader);

        CloseBtn.click();
    }

    public void WavierBtn() {
        WavierBtn.click();
        waitForWEbElementToAppear(WaiverModelHeader);
        CloseBtn.click();
    }
}
