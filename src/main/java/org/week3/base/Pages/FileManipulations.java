package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileManipulations {
    private WebDriver driver;

    // File Download Selectors
    @FindBy(
            xpath = "a//[text()='File Download']"
    )
    private WebElement fileDownload;

    @FindBy(
            css = ".wpdm-download-link.download-on-click.btn.btn-primary"
    )
    private WebElement downloadWithoutPassword;

    @FindBy(
            css = ".wpdm-download-link.wpdm-download-locked.btn.btn-primary"
    )
    private WebElement downloadWithPassword;


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

}
