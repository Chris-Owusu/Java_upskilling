package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tables {
    private WebDriver driver;

    @FindBy(
            xpath = "//a[text()='Tables']"
    )
    private WebElement tablesBtn;


}
