package org.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.SocketTimeoutException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StandAlone {

    @Test
    public static void login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://institute.leo1.in/institute/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[contains(@type,'Email')]")).sendKeys("singh.ajay@financepeer.co");
        driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("School@1234");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Fee Payment')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Fee Structure')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.f-30.tx-semibold")));
        System.out.println(ele);
        driver.findElement(By.xpath("//span[text()='Course']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.tx-semibold.one-line")));
        driver.findElement(By.xpath("//input[@placeholder='Enter Course Name']")).sendKeys("Automsddationdses");
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("2");
        WebElement ele1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role='button']")));
        ele1.click();
        driver.findElement(By.cssSelector("div:nth-child(5) div:nth-child(2) input:nth-child(1)")).sendKeys("Test-1");
        driver.findElement(By.cssSelector("div:nth-child(6) div:nth-child(2) input:nth-child(1)")).sendKeys("Test-2");
        driver.findElement(By.cssSelector("button.w-100.rounded-0")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.Toastify__toast-icon.Toastify__toast-icon.Toastify--animate-icon")));
//      Adding class details
        driver.findElement(By.xpath("//span[text()='Class/Fee Entry']")).click();
        String ClassHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.tx-semibold.one-line"))).getText();
        System.out.println(ClassHeading);
        WebElement slctCourse= driver.findElement(By.xpath("//div[text()='Select Course']"));
        slctCourse.click();
        slctCourse.findElement(By.xpath("//div[text()='Automation']")).click();
//        driver.findElement(By.cssSelector(" div.css-1jqq78o-placeholder")).sendKeys("Automation");


//div.position-relative.d-flex.flex-column -> for complete banner




    }
}
