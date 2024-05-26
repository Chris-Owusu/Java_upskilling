package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calenders {
    private WebDriver driver;

    @FindBy(
            xpath = "//a[text()='Calenders']"
    )
    private WebElement CalenderBtn;

    @FindBy(
            xpath = "//input[@id='g1065-selectorenteradate']"
    )
    private WebElement calenderTextField;

    @FindBy(
            css = "a[title='Next']"
    )
    private WebElement nextBtn;

    @FindBy(
            xpath = "a//[text()='12']"
    )
    private WebElement day;

    @FindBy(
            css = "div[class='entry-content'] button[type='submit']"
    )
    private WebElement submitBtn;

    @FindBy(
            css = ".field-value"
    )
    private WebElement assertDate;


}
