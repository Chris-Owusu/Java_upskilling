package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sliders {

    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public Sliders(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(
            xpath = "//a[text()='Sliders']"
    )
    private WebElement sliderBtn;

    @FindBy(
            id = "slideMe"
    )
    private WebElement slider;
}
