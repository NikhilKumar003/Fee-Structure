package org.PageObjects;

import org.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NachPlacementPage extends AbstractComponents {
    WebDriver driver;
    public NachPlacementPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//span[text()='Fee Reimbursement Students']")
    WebElement FeeReiumbursementHeading;
}

//public void