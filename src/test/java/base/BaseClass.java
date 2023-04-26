package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    private WebDriver driver;
    public static Properties properties;
    String browserName = "Firefox";
    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void launchApp() {
//        loadConfig();

        if (browserName.equalsIgnoreCase("Chrome")) {
            driver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("FireFox")) {
            driver=new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        }
        //Maximize the screen
        getDriver().manage().window().maximize();
        //Delete all the cookies
        getDriver().manage().deleteAllCookies();
        //Implicit TimeOuts
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //PageLoad TimeOuts
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //Launching the URL
//        getDriver().get(url);
    }
    @AfterMethod
    public void tearDown(){
        getDriver().quit();
    }

    public void loadConfig() {
        try {
            properties = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\shvet\\IdeaProjects\\TestNG_Demo\\src\\test\\resources\\config.properties"));
            properties.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
