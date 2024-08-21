package org.TestComponents;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.PageObjects.CoinRequestPage;
import org.PageObjects.Dashboard;
import org.PageObjects.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    WebDriver driver;
    public LoginPage loginPage ;

    public Dashboard DP;
    public CoinRequestPage Coin;

    public Properties prop;

    public BaseTests() throws IOException {
//        Properties prop = new Properties();
        prop = new Properties();
        String userDir = System.getProperty("user.dir");
        String filePath = userDir + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "org" + File.separator + "Resourses" + File.separator + "GlobalProperties.properties";
        FileInputStream fis = new FileInputStream(filePath);
        prop.load(fis);
    }

    public WebDriver InitializeDriver() throws IOException {
   String BrowserName = System.getProperty("browser")!=null ? System.getProperty("browser"): prop.getProperty("browser");
//        String BrowserName = prop.getProperty("browser");
        if (BrowserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (BrowserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();


        } else if (BrowserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();


        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    @BeforeClass(alwaysRun = true)
    public void launchApplication() throws IOException, InterruptedException {
        driver = InitializeDriver();
         loginPage = new LoginPage(driver);
        String Url = prop.getProperty("dashboardUrl");
        driver.get(Url);
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        DP = loginPage.setLoginBtn(username, password);


    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){

//        driver.close();
    }


}
