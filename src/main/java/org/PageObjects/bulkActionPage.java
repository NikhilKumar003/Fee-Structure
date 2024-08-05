package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bulkActionPage extends AbstractComponents {

    WebDriver driver;

    public bulkActionPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[text()='Sample Template']")
    WebElement sampleTemplate;

    @FindBy(xpath = "//span[text()='Upload Students in Bulk']")
    WebElement uploadStudentsInBulk;
    @FindBy(xpath = "//span[text()='Capture Payments']")
    WebElement capturePayment;
    @FindBy(xpath = "//span[text()='Bulk Fee']")
    WebElement BulkFee;
    @FindBy(css = "button.PrimaryButton_button__tfJh7.px-4")
    WebElement uploadFile;
    @FindBy(css = "span.w-100.tx-semibold.f-24")
    WebElement studentBulkText;
    @FindBy(css = "div.text-center.text-danger.mb-2")
    WebElement errorMsgInBulkStudentFile;
    @FindBy(css = "span.f-14")
    WebElement BulkCaptureTemplate;
    @FindBy(xpath = "//button[text()='Upload File']")
    WebElement CaptureUploadFile;


    public void setSampleTemplate() {
        sampleTemplate.click();
        waitForWEbElementToAppear(sampleTemplate);
    }

    public void setUploadStudentsInBulk() {
        uploadStudentsInBulk.click();
        waitForWEbElementToAppear(studentBulkText);
        uploadFile.click();
        waitForWEbElementToAppear(errorMsgInBulkStudentFile);

    }

    public void setCapturePayment() {
        capturePayment.click();
        waitForWEbElementToAppear(BulkCaptureTemplate);
        BulkCaptureTemplate.click();
        waitForWEbElementToAppear(CaptureUploadFile);
        CaptureUploadFile.click();
    }

    public void setBulkFee() {
        BulkFee.click();
        waitForWEbElementToAppear(BulkCaptureTemplate);
        BulkCaptureTemplate.click();
        waitForWEbElementToAppear(CaptureUploadFile);
        CaptureUploadFile.click();
    }

    public String CheckErrorMsg() {
        return errorMsgInBulkStudentFile.getText();

    }


}
