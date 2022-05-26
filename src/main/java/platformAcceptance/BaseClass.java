package platformAcceptance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void setChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "C://browser-drivers//chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void setFireFoxDriver(){
        System.setProperty("webdriver.gecko.driver", "C://browser-drivers//geckodriver//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public static void closeDriver(){
        driver.close();
        driver.quit();
    }

}
