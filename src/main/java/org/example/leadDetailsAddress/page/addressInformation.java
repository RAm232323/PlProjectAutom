package org.example.leadDetailsAddress.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addressInformation {

    WebDriver driver;
    WebDriverWait wait;

    // create constructor
    public addressInformation(WebDriver driver , WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    //CURRENT RESIDENCE ADDRESS

    // Residence Type
    By clickResidenceType = By.cssSelector("app-dropdown[formcontrolname='currentResidenceType'] .ng-select-container");
    By selectResidenceType = By.xpath("//div[contains(@class,'ng-option') and contains(text(),'Owned')]");

    // Duration in Months
    By selectValueDurationInMonths = By.cssSelector("app-input[formcontrolname='currentDurationMonths'] input");

    // Select the Address line 1 of Current Address by css selector
    By selectAddressLine1 = By.cssSelector("app-input[formcontrolname='currentAddressLine1'] input");

    // Select the Address line 2 of Current Address by css selector
    By selectAddressLine2 = By.cssSelector("app-input[formcontrolname='currentAddressLine2'] input");

    // Select the Landmark of Current Address by css selector
    By selectLandmark = By.cssSelector("app-input[formcontrolname='currentLandmark'] input");

    // Select checkbox of the permanent address
    By checkBoxPerAddress = By.cssSelector("input[type='checkbox']");

    // Select the Address line 1 of office address by css selector
    By selectAddressLineOffice1 = By.cssSelector("app-input[formcontrolname='officeAddressLine1'] input");

    // Select the Address line 2 of office address by css selector
    By selectAddressLineOffice2 = By.cssSelector("app-input[formcontrolname='officeAddressLine2'] input");

    // Select the Landmark of office address by css selector
    By selectLandmarkOffice = By.cssSelector("app-input[formcontrolname='officeLandmark'] input");

    // Select the Pincode of office address by css selector
    By selectPincodeOffice = By.cssSelector("app-input[formcontrolname='officePinCode'] input");

    // Select the next button on the Address details page
    By selectNextButton = By.xpath("//button[.//span[text()='Next']]");

    // Select the next button on the loan details page
    By selectNextButtonOnLoanDetails = By.xpath("//button[.//span[text()=' Next ']]");

    // Select the back button on the banking journery page
    By selectBackButton = By.xpath("//button[.//span[text()='Back ']]");

    // Select the  back button on the lead details page
    By selectBackButtonOnLeadPage = By.xpath("//button[.//span[text()='Back']]");





    public void fillCurrentAddress(String DurationInMonths , String addressLine1 , String addressLine2 , String currentLandmark) throws InterruptedException{

        // click the Residence Type box
        WebElement clickGen = wait.until(ExpectedConditions.elementToBeClickable(clickResidenceType));
        clickGen.click();

        // select the drop value in the Residence Type in drop down
        WebElement selectGen = wait.until(ExpectedConditions.elementToBeClickable(selectResidenceType));
        selectGen.click();

        // Add Duration In Months
        WebElement addDurationInMonths = wait.until(ExpectedConditions.visibilityOfElementLocated(selectValueDurationInMonths));
        addDurationInMonths.sendKeys(DurationInMonths);

        // Add Address Line 1
        WebElement addAddressLine1 = wait.until(ExpectedConditions.visibilityOfElementLocated(selectAddressLine1));
        addAddressLine1.sendKeys(addressLine1);

        // Add Address Line 2
        WebElement addAddressLine2 = wait.until(ExpectedConditions.visibilityOfElementLocated(selectAddressLine2));
        addAddressLine2.sendKeys(addressLine2);

        // Add Landmark on Current Residence Address
        WebElement addCurrentLandmark = wait.until(ExpectedConditions.visibilityOfElementLocated(selectLandmark));
        addCurrentLandmark.sendKeys(currentLandmark);
        Thread.sleep(7000);
    }



    public void fillPermanentAddress() throws InterruptedException{

        // select the check box under the permanent address
        WebElement selectcheckBoxPerAddress = wait.until(ExpectedConditions.elementToBeClickable(checkBoxPerAddress));
        selectcheckBoxPerAddress.click();
        Thread.sleep(5000);

    }



    public void fillOfficeAddress(String officeAddressLine1 , String officeAddressLine2 , String officeLandmark , String officePincode )throws  InterruptedException{

        // Add Address Line 1 of office
        WebElement addAddressLine1 = wait.until(ExpectedConditions.visibilityOfElementLocated(selectAddressLineOffice1));
        addAddressLine1.sendKeys(officeAddressLine1);

        // Add Address Line 2 of office
        WebElement addAddressLine2 = wait.until(ExpectedConditions.visibilityOfElementLocated(selectAddressLineOffice2));
        addAddressLine2.sendKeys(officeAddressLine2);

        // Add Landmark on office address
        WebElement addCurrentLandmark = wait.until(ExpectedConditions.visibilityOfElementLocated(selectLandmarkOffice));
        addCurrentLandmark.sendKeys(officeLandmark);

        // Add Pincode on office address
        WebElement addPincode = wait.until(ExpectedConditions.visibilityOfElementLocated(selectPincodeOffice));
        addPincode.sendKeys(officePincode);
        Thread.sleep(3000);

        // Click on the next  button on the Address details page
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(selectNextButton));
        nextButton.click();
        Thread.sleep(20000);

    }

    public void checkPreviousData() throws InterruptedException{

        // Check previous data clicking on next and back button

        // Click on the back button on the bank statement page to check previous data
        WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(selectBackButton));
        backButton.click();
        Thread.sleep(3000);

        // Click on the back button on the lead details page to check previous data
        WebElement backButtononLead = wait.until(ExpectedConditions.elementToBeClickable(selectBackButtonOnLeadPage));
        backButtononLead.click();
        Thread.sleep(3000);

        // Click on the Next button on the loan details page to check previous data
        WebElement NextButtononLoan = wait.until(ExpectedConditions.elementToBeClickable(selectNextButtonOnLoanDetails));
        NextButtononLoan.click();
        Thread.sleep(3000);


        // Click on the next button
        for(int i = 1; i<4;i++){
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(selectNextButton));
            nextButton.click();
            Thread.sleep(3000);
        }

    }
}
