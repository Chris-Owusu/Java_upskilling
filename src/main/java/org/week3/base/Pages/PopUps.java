package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopUps {
    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public PopUps(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(
            xpath = "//a[text()='Popups']"
    )
    private WebElement PopUpsBtn;

    @FindBy(
            id = "alert"
    )
    private WebElement alert;

    @FindBy(
            id = "confirm"
    )
    private WebElement confirm;

    @FindBy(
            id = "prompt"
    )
    private WebElement prompt;


}
