package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
public class MyMethods {
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    public void sendKeysMethod(WebElement element, String keys){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) BasicDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsText(WebElement element, String value){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(value));

    }
}
