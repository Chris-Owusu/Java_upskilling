package org.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.week3.base.Pages.FormField;
import org.week3.utilities.utility;

public class FormFieldTest extends BaseTest {

    @Test
    public void formFieldTest() throws InterruptedException {
        FormField formField = new FormField(driver);

        utility utility = new utility(driver);


        formField.clickFormFieldButton();
        formField.enterName("Chris");
        formField.selectWater();
        formField.selectWine();
        WebElement colorElement = driver.findElement(By.id("color4"));
        utility.justWait(colorElement);
        formField.selectGreenColor();
        formField.enterSibling();
        WebElement emailElement = driver.findElement(By.id("email"));
        utility.justWait(emailElement);
        formField.enterEmail("something@aol.com");
        utility.waitForElement(driver, By.id("message"));
        formField.enterMessage("Lorem Ipsum ");
        WebElement btnElement = driver.findElement(By.id("submit-btn"));
        utility.justWait(btnElement);
        formField.clickSubmitButton();
    }

}
