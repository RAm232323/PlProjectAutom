package org.example.lead.details.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class leadDetails {

    WebDriver driver;
    WebDriverWait wait;

    // create constrecter
    public leadDetails(WebDriver driver , WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Select the First name by css Selector
    By firstName = By.cssSelector("app-input[formcontrolname='firstName'] input");

    // Select the middle name by css selector
    By middleName = By.cssSelector("app-input[formcontrolname='middleName'] input");

    // Select the last name by css selector
    By lastName = By.cssSelector("app-input[formcontrolname='lastName'] input");

    //  select the PAN Number by css selector
    By selectPan = By.cssSelector("app-input[formcontrolname='pan'] input");

    // Select the Date Of Birth by css selector
    //By dobInput = By.cssSelector("input[formcontrolname='dateOfBirth']");

    // Select the email by css selector
    By selectEmail = By.cssSelector("app-input[formcontrolname='email'] input");

    // Select the phone Number by css selector
    By selectMobileNumber = By.cssSelector("app-input[formcontrolname='mobilePhone'] input");

    // Select the pincode by css selector
    By selectPinCode = By.cssSelector("app-input[formcontrolname='pinCode'] input");

    // select the send consent button by x.path
    By selectSendConsentButton = By.xpath("//span[contains(text(),'Send Consent')]");

    // select the okay button after click on the send  consent button by x.path
    // reliable XPath that finds the button with span text "Okay"
    By okayButton = By.xpath("//button[.//span[normalize-space(text())='Okay']]");



    // Select the next button on the lead details page by x.path
    By selectNextButton = By.xpath("//span[contains(text(),'Next')]");


    public void fillLeadDetailsData(String pan , String email , String mobile , String pincode , String fName , String mName , String lName) throws InterruptedException {

        // Enter the First Name
        WebElement enterFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        enterFirstName.sendKeys(fName);

        // Enter the Middle Name
        WebElement enterMiddleName = wait.until(ExpectedConditions.visibilityOfElementLocated(middleName));
        enterMiddleName.sendKeys(mName);

        // Enter the lastname
        WebElement enterLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(lastName));
        enterLastName.sendKeys(lName);

        // Enter the Pan Number
        WebElement panNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(selectPan));
        panNumber.sendKeys(pan);
        Thread.sleep(20000);

        // enter the email id
        WebElement emailId = wait.until(ExpectedConditions.visibilityOfElementLocated(selectEmail));
        emailId.sendKeys(email);

        // Enter the mobile Number
        WebElement mobileNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(selectMobileNumber));
        mobileNumber.sendKeys(mobile);

        // Enter the Pincode
        WebElement pinCode = wait.until(ExpectedConditions.visibilityOfElementLocated(selectPinCode));
        pinCode.sendKeys(pincode);

    }

    public void leadDetailsButton() throws InterruptedException{

        // click on the send concent button
        WebElement buttonSendConcent = wait.until(ExpectedConditions.elementToBeClickable(selectSendConsentButton));
        buttonSendConcent.click();
        Thread.sleep(1000);

        // click on the okay button after click on the send consent page
        WebElement buttonOkay = wait.until(ExpectedConditions.visibilityOfElementLocated(okayButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", buttonOkay);
        Thread.sleep(10000);


        // click on the next button the lead details page
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(selectNextButton));
        nextButton.click();
        Thread.sleep(20000);

        // click on the okay button after click on the next Button
        WebElement buttonOkay2 = wait.until(ExpectedConditions.visibilityOfElementLocated(okayButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", buttonOkay2);
        Thread.sleep(20000);

        // click on the next button again the lead details page
        WebElement nextButton2 = wait.until(ExpectedConditions.elementToBeClickable(selectNextButton));
        nextButton2.click();
        Thread.sleep(10000);

    }
}
