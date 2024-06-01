package org.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.week3.base.Pages.FileUpload;
import org.week3.utilities.Utility;

public class FileUploadTest extends  BaseTest {

    @Test
    public void fileUploadTest() {
        FileUpload fileUpload = new FileUpload(driver);
        Utility utility = new Utility(driver);

//        WebElement fileUploadBtn = driver.findElement(By.xpath("a//[text()='File Upload']"));
        utility.waitForElement(driver, By.xpath("a//[text()='File Upload']"));

        fileUpload.clickFileUploadBtn();
        fileUpload.uploadFile("C://Users//ChristopherOwusuAhen//Downloads//evans.png");
        fileUpload.verifySuccessfulUpload();
    }
}