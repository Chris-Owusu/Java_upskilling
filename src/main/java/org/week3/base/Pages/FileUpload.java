package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUpload {
    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public FileUpload(WebDriver driver) {
        this.driver = driver;
    }

    // File Upload Selectors
    @FindBy(
            xpath = "a//[text()='File Upload']"
    )
    private WebElement fileUpload;

    @FindBy(
            id = "file-upload"
    )
    private WebElement chooseFile;

    @FindBy(
            css = ".wpcf7-response-output"
    )
    private WebElement successUploadMessage;


    // Method to click the 'File Upload' button
    public void clickFileUploadBtn() {
        fileUpload.click();
    }

    // Method to upload a file
    public void uploadFile(String filePath) {
        chooseFile.sendKeys(filePath);
    }

    // Method to verify successful upload message
    public boolean verifySuccessfulUpload() {
        String messageText = successUploadMessage.getText();
        return messageText.contains("Thank you for your message. It has been sent.");
    }

}
