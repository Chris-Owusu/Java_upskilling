package org.week3.utilities;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {
    public WebDriver driver;

    public utility(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollBySecond() {
        while (true) {
            // Scroll down a specific amount (adjust as needed)
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");

            // Wait for 1 second before scrolling again
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Scroll and wait till an element is present
    public void waitForElement(WebDriver driver, By elementLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(60, ChronoUnit.SECONDS));

        while (true) {
            try {
                // Attempt to find the element
                WebElement element = driver.findElement(elementLocator);

                // Scroll the element into view if it's not visible
                if (!element.isDisplayed()) {
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", element);
                }

                // Exit the loop if element is found and visible
                return;
            } catch (NoSuchElementException e) {
                // Element not found, continue scrolling
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0, 1000)"); // Scroll down by 250px (adjust as needed)
            }

            // Wait for some time before scrolling again
            wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
        }
    }

    public void justWait(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
