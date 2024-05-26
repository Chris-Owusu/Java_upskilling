package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Modals {

    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public Modals(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(
            xpath = "//a[text()='Modals']"
    )
    private WebElement modalsBtn;

    @FindBy(
            id = "simpleModal"
    )
    private WebElement simpleModal;

    @FindBy(
            id = "formModal"
    )
    private WebElement formModal;

    @FindBy(
            id = "g1051-name"
    )
    private WebElement formModalNameField;

    @FindBy(
            id = "#g1051-email"
    )
    private WebElement formModalEmailField;

    @FindBy(
            id = "#contact-form-comment-g1051-message"
    )
    private WebElement formModalMessageField;

    @FindBy(
            css = "#contact-form-comment-g1051-message"
    )
    private WebElement formModalSubmitBtn;
}
