package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormField {
    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public FormField(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    @FindBy(
            xpath = "//a[text()='Form Fields']"
    )
    private WebElement formFieldBtn;

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



    // Method to click the 'Form Fields' button
    public void clickFormFieldButton() {
        formFieldBtn.click();
    }

    // Method to enter text in the 'Name' field
    public void enterName(String text) {
        name.sendKeys(text);
    }

    // Method to select 'Water' from the checkbox
    public void selectWater() {
        water.click();
    }

    // Method to select the 'Wine' checkbox
    public void selectWine() {
        wine.click();
    }

    // Method to select the 'Green' radio button
    public void selectGreenColor() {
        green.click();
    }

    // Method to enter a number in the 'Siblings' field
    public void enterSibling() {
        Select selectSiblings = new Select(siblings);
        selectSiblings.selectByVisibleText("Yes");
    }

    // Method to enter text in the 'Email' field
    public void enterEmail(String emailAddress) {
        email.sendKeys(emailAddress);
    }

    // Method to enter text in the 'Message' text area
    public void enterMessage(String messageText) {
        message.sendKeys(messageText);
    }

    // Method to click the 'Submit' button
    public void clickSubmitButton() {
        submitBtn.click();
    }

}
