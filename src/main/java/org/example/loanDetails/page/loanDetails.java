package org.example.loanDetails.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loanDetails {
    WebDriver driver;
    WebDriverWait wait;

    // Select the Loan Amount by css selector
    By loanAmountSelect = By.cssSelector("app-input[formcontrolname='loanAmount'] input");

    //Select the loan Purpose from the drop Down By Css selector
    By loanpurposeSelect = By.cssSelector("app-dropdown[formcontrolname='loanPurpose'] .ng-select");

    //Select the loan purpose from the drop down
    By selectLoanpurpose = By.xpath("//div[@class='ng-option' and contains(text(),'Business expenses')]");

    // Select the next button on the loan details page
    By selectNextButton = By.xpath("//span[contains(text(),' Next ')]");

    public loanDetails(WebDriver driver , WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void fillLoanDetailsData(String a) throws InterruptedException{
        //Add Loan Amount
        WebElement loanAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(loanAmountSelect));
        loanAmount.sendKeys(a);

        //Click on loan purpose drop down
        WebElement loanPurpose = wait.until(ExpectedConditions.elementToBeClickable(loanpurposeSelect));
        loanPurpose.click();
        Thread.sleep(10000);

        // Select the value from the drop down
        WebElement selectDropDown = wait.until(ExpectedConditions.elementToBeClickable(selectLoanpurpose));
        selectDropDown.click();
        Thread.sleep(2000);

        // Click on the next  button on the loan details page
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(selectNextButton));
        nextButton.click();
    }

}