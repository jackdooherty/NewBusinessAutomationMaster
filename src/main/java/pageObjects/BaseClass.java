package pageObjects;

import com.paulhammant.ngwebdriver.NgWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.jsoup.Connection;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    public static WebDriver driver;
    public static NgWebDriver ngWebDriver;
    public static JavascriptExecutor jsDriver;

    public static void setChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //jsDriver = (JavascriptExecutor)driver;
        //ngWebDriver = new NgWebDriver(jsDriver);
        //ngWebDriver.waitForAngularRequestsToFinish();
    }

    public static void setFireFoxDriver(){
        System.setProperty("webdriver.gecko.driver", "C://driver//geckodriver//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        jsDriver = (JavascriptExecutor)driver;
        ngWebDriver = new NgWebDriver(jsDriver);
        ngWebDriver.waitForAngularRequestsToFinish();
    }

    public static void closeDriver(){
        driver.close();
        driver.quit();
    }

}
