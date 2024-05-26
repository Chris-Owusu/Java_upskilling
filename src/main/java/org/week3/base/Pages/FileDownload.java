package org.week3.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownload {
    private WebDriver driver;

    //Constructor, as every page needs a WebDriver to find elements
    public FileDownload(WebDriver driver) {
        this.driver = driver;
    }

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

    @FindBy(
            css = ".modal-content"
    )
    private WebElement downloadWithPasswordIframe;

    @FindBy(
            id = "password_66537b6c2492c_921"
    )
    private WebElement downloadWithPasswordIframePasswordField;

    @FindBy(
            id = "wpdm_submit_66537b6c2492c_921"
    )
    private WebElement downloadWithPasswordIframeSubmitBtn;



    // Method to click the 'File Download' button
    public void clickFileDownloadBtn() {
        fileDownload.click();
    }

    // Method to download without password
    public void downloadWithoutPassword() {
        downloadWithoutPassword.click();
    }

    // Method to download with a password
    public void downloadWithPassword(String password) {
        downloadWithPassword.click();
        // Switch to iframe containing password field
        driver.switchTo().frame(downloadWithPasswordIframe);
        downloadWithPasswordIframePasswordField.sendKeys(password);
        downloadWithPasswordIframeSubmitBtn.click();
        driver.switchTo().defaultContent();
    }


}
