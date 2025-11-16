package org.example.bankStatement.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bankingJournery {
    WebDriver driver;
    WebDriverWait wait;

    // create constructor
    public bankingJournery(WebDriver driver , WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // select the send Banking link button by x.path
    By selectSendBankingButton = By.xpath("//span[contains(text(),' Send Banking Link ')]");

    // Select the next button on the bank statement page by x.path
    By selectNextButtonOnBankState = By.xpath("//button[.//span[text()=' Next ']]");

    // select tenure by element id
    By elementId = By.id("aaddf6fe8380-0");

    // Select the Submit Button on the offer details page by x.path
    By selectSumbitButton = By.xpath("//button[.//span[text()=' Submit ']]");


    public void bankingPage() throws InterruptedException{

        // click on the send Banking link button
        WebElement buttonSendBankingLink = wait.until(ExpectedConditions.elementToBeClickable(selectSendBankingButton));
        buttonSendBankingLink.click();
        Thread.sleep(100000);

        // click on the next button
        WebElement clickNextButtonBanking = wait.until(ExpectedConditions.elementToBeClickable(selectNextButtonOnBankState));
        clickNextButtonBanking.click();
        Thread.sleep(40000);
    }

    public void offerPage() throws InterruptedException{

//        // select tenure by element id
//        WebElement selectTenure = driver.findElement(elementId);
//        selectTenure.click();
//        Thread.sleep(2000);

        // click on the Submit Button on the offer details page
        WebElement clickSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(selectSumbitButton));
        clickSubmitButton.click();
        Thread.sleep(5000);

    }
}
