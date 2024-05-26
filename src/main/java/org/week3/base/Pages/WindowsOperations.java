package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsOperations {

    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public WindowsOperations(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(
            xpath = "//a[text()='Window Operations']"
    )
    private WebElement windowsOpsBtn;

    @FindBy(
            css = "button[onclick='newTab()'] b"
    )
    private WebElement newTab;

    @FindBy(
            css = "button[onclick='newWindowSelf()'] b"
    )
    private WebElement replaceWindows;

    @FindBy(
            css = "button[onclick='newWindow()'] b"
    )
    private WebElement newWindow;
}
