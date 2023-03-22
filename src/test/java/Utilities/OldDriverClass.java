package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class OldDriverClass {
    private static WebDriver driver;
    public static WebDriver getDriver() {

        ChromeOptions options = null;
        if (driver == null) {
            options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");  // to solve the error with chrome v111

            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

            driver = new ChromeDriver(options);
        }

        return driver;

    }

    public static void quitDriver()  {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
        driver = null;

    }
}
