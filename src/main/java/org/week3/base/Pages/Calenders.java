package org.week3.base.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calenders {
    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public Calenders(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(
            xpath = "//a[text()='Calendars']"
    )
    private WebElement CalendarBtn;

    @FindBy(
            css = "a[title='Next']"
    )
    private WebElement nextBtn;

    @FindBy(
            xpath = "//input[@id='g1065-selectorenteradate']"
    )
    private WebElement calenderTextField;

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



    // Method to click the 'Calendar Button'
    public void clickCalendarButton() {
        CalendarBtn.click();
    }

    // Method to click the 'next button'
    public void clickSubmitBtn() {
        submitBtn.click();
    }

    // Method to type the 'date'
    public void typeDate(String date) {
        calenderTextField.sendKeys(date);
    }

    // Method to click the 'particular day'
    public void clickParticularDay(int dayNumber) {
        day.findElement(By.xpath("a[text()='" + dayNumber + "']"));
        day.click();
    }

    // Method to click the 'submit button'
    public void clickNxtBtn() {
        nextBtn.click();
    }

    // Method to get the selected date text
    public String getSelectedDateText() {
        return assertDate.getText();
    }

}
