package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tables {
    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public Tables(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(
            xpath = "//a[text()='Tables']"
    )
    private WebElement tablesBtn;


}
