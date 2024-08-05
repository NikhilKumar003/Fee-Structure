package org.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AddStudentStandAlone {
    @Test
    public static void login() throws InterruptedException {
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
        driver.findElement(By.xpath("//span[contains(text(),'Student List')]")).click();
        ///new code on add student
        driver.findElement(By.xpath("//span[text()='Student']")).click();
        WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-content")));
         WebElement StudentPopup= driver.findElement(By.cssSelector("div.modal-content"));
         String HeaderText =  StudentPopup.findElement(By.xpath("//span[text()='Add New Student']")).getText();
         System.out.println(HeaderText);
         WebElement dropDwn = StudentPopup.findElement(By.cssSelector("div.css-b62m3t-container"));
         dropDwn.click();
         Thread.sleep(1000);
        dropDwn.findElement(By.xpath("//div[contains(text(),'GTPL')]")).click();
        Thread.sleep(1000);
        WebElement course =driver.findElement(By.xpath("//div[contains(@class, 'css-1jqq78o-placeholder') and @id='react-select-7-placeholder']"));
            course.click();
        course.findElement(By.xpath("//div[contains(text(),'Product')]")).click();





    }}
