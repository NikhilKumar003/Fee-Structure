package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoinRequestPage extends AbstractComponents {

    WebDriver driver;

    public CoinRequestPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Download Sample Excel Template']")
    WebElement DownloadTemplate;

    @FindBy(xpath = "//span[text()='Upload Bulk Transaction']")
    WebElement uploadBulkTransaction;
    @FindBy(xpath = "//span[text()='Download All Pending Requests (.xlsx)']")
    WebElement DownloadAllPendingRequest;
    @FindBy(css="span.tx-semibold.one-line")
    WebElement CapturePayText;
    @FindBy(xpath = "//span[text()='Sample Download']")
    WebElement DownloadCaptureForm;
    @FindBy(xpath = "//button[text()='Upload File']")
    WebElement uploadFileBtn;
    @FindBy(css = "div.text-center.text-danger")
    WebElement errorMsgInBulkCaptureFile;
    @FindBy(css="img[alt='close']")
    WebElement CloseBtn;


    public void setDownloadTemplate() {
        DownloadTemplate.click();
    }

    public void setUploadBulkTransaction() throws InterruptedException {
        uploadBulkTransaction.click();
        waitForWEbElementToAppear(CapturePayText);
        DownloadCaptureForm.click();
        waitForWEbElementToAppear(uploadFileBtn);
        uploadFileBtn.click();
        waitForWEbElementToAppear(errorMsgInBulkCaptureFile);
        Thread.sleep(1000);
        CloseBtn.click();
    }

}