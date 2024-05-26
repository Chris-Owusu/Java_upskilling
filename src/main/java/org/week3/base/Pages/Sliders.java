package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.annotation.Nullable;

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

    // Method to click the 'Sliders' button
    public void clickSliderButton() {
        sliderBtn.click();
    }

    // Method to slide the slider to a specific position (0-100)
    public void slideToPosition(@Nullable Integer position) {
        if (position == null || position < 0 || position > 100) {
            throw new IllegalArgumentException("Position must be between 0 and 100");
        }

        Actions actions = new Actions(driver);
        // Get the slider dimensions
        int width = slider.getSize().getWidth();

        // Calculate the offset for 50% position
        int offset = (int) (width * 0.5);

        actions.dragAndDropBy(slider, offset, 0).perform();
    }
}
