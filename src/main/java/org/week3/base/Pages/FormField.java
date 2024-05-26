package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormField {
    private WebDriver driver;

    @FindBy(
            xpath = "//a[text()='Form Fields']"
    )
    private WebElement FormFieldBtn;

    @FindBy(
            id = "name"
    )
    private WebElement name;

    @FindBy(
            id = "drink1"
    )
    private WebElement water;

    @FindBy(
            id = "drink4"
    )
    private WebElement wine;

    @FindBy(
            id = "color4"
    )
    private WebElement green;

    @FindBy(
            id = "siblings"
    )
    private WebElement siblings;

    @FindBy(
            id = "email"
    )
    private WebElement email;

    @FindBy(
            id = "message"
    )
    private WebElement message;

    @FindBy(
            id = "submit-btn"
    )
    private WebElement submitBtn;

}
