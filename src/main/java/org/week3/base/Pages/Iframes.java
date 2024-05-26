package org.week3.base.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Iframes {
    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public Iframes(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(
            xpath = "//a[text()='Iframes']"
    )
    private WebElement iframes;

    @FindBy(
            id = "frame1"
    )
    private WebElement frameOne;

    @FindBy(
            id = "frame2"
    )
    private WebElement frameTwo;


    // Method to click the 'First Iframes' button
    public void clickIframesButton() {
        iframes.click();
    }

    // Method to switch to frame 1
    public void switchToFrameOne() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.presenceOfElementLocated((By) frameOne));
        driver.switchTo().frame(frameOne);
    }

    // Method to switch back to the default content (parent frame)
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    // Method to switch to frame 2
    public void switchToFrameTwo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.presenceOfElementLocated((By) frameTwo));
        driver.switchTo().frame(frameTwo);
    }
}


