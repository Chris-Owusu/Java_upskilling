package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iframes {
    private WebDriver driver;

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
}


