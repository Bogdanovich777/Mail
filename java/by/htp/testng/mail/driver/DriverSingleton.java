package by.htp.testng.mail.driver;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton {
	
	private static WebDriver driver;
    private static final String WEBDRIVER_GECKO_DRIVER = "webdriver.gecko.driver";
    private static final String GECKODRIVER_GECKODRIVER_EXE_PATH = "C:\\\\driver\\geckodriver.exe";

    private DriverSingleton(){};


    public static WebDriver getDriver(){
        if (null == driver){
            System.setProperty(WEBDRIVER_GECKO_DRIVER, GECKODRIVER_GECKODRIVER_EXE_PATH);
            driver = new FirefoxDriver();
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
}
}