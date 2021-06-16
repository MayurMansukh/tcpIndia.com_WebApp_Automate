package bridgelabz.base;

import bridgelabz.utils.ExtentReport;
import bridgelabz.utils.checkInternerConnection;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    checkInternerConnection connection = new checkInternerConnection();
    ExtentReport extentReport = new ExtentReport();

    @BeforeTest
    public void setup () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://tpcindia.com/");
        connection.check_internet_connectivity(); // check internet connection
        extentReport.startTest();
    }

    @AfterTest
    public void teardown() throws Exception {
        extentReport.endTest(); // create extent report
        driver.close();
    }
}
