package org.example.leadDetailsLeadInformation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class leadInformation {

    WebDriver driver;
    WebDriverWait wait;

    // create constructor
    public leadInformation(WebDriver driver , WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Gender
    By clickGender = By.cssSelector("app-dropdown[formcontrolname='gender'] .ng-select-container");
    By selectGender = By.xpath("//div[contains(@class,'ng-option') and contains(text(),'Male')]");

    // Education Qualification
    By clickEducQuali = By.cssSelector("app-dropdown[formcontrolname='educationQualification'] .ng-select-container");
    By selectEducaQuali = By.xpath("//div[contains(@class,'ng-option') and contains(text(),'Matriculate')]");

    // Martial Status
    By clickMartialStatus = By.cssSelector("app-dropdown[formcontrolname='martialStatus'] .ng-select-container");
    By selectMartialStaus = By.xpath("//div[contains(@class,'ng-option') and contains(text(),'Single')]");

    // Employment Details

    // Employment type
    By clickEmployTpe = By.cssSelector("app-dropdown[formcontrolname='employmentType'] .ng-select-container");
    By selectEmployTpe = By.xpath("//div[contains(@class,'ng-option') and contains(text(),'Salaried')]");

    // Industry Type
    By clickIndustryType = By.cssSelector("app-dropdown[formcontrolname='industryType'] .ng-select-container");
    By selectIndustryType = By.xpath("//div[contains(@class,'ng-option') and contains(text(),' Capital Goods & Manufacturing ')]");

    // Select the Monthly Income by css selector
    By monthlyIncomeSelect = By.cssSelector("app-input[formcontrolname='monthlyIncome'] input");

    // Select the office email by css selector
    By officeEmailSelect = By.cssSelector("app-input[formcontrolname='officialEmail'] input");


    // Name of Employee
    By clickEmployeeType = By.cssSelector("customer-app-dropdown[formcontrolname='employerName'] .ng-select-container");
    // name of employee data pass kar raha ha yaha sa
    By addDataInEmp = By.cssSelector("customer-app-dropdown[formcontrolname='employerName'] input[type='text']");
    By selectEmployeeType = By.xpath("//div[contains(@class,'ng-option') and contains(text(),' DMIA LAND (INDIA) PRIVATE LIMITED ')]");

    // Select the next button on the lead details page
    By selectNextButton = By.xpath("//button[.//span[text()='Next']]");




    public void fillLeadInformation(){

        // click the gender box
        WebElement clickGen = wait.until(ExpectedConditions.elementToBeClickable(clickGender));
        clickGen.click();

        // select the drop value in the gender drop down
        WebElement selectGen = wait.until(ExpectedConditions.elementToBeClickable(selectGender));
        selectGen.click();

        // click the Education Qualification
        WebElement clickEducatQuali = wait.until(ExpectedConditions.elementToBeClickable(clickEducQuali));
        clickEducatQuali.click();

        // select the drop value in the Education Qualification drop down
        WebElement selectEducatQualif = wait.until(ExpectedConditions.elementToBeClickable(selectEducaQuali));
        selectEducatQualif.click();

        // click the martial status
        WebElement clickMartialSta = wait.until(ExpectedConditions.elementToBeClickable(clickMartialStatus));
        clickMartialSta.click();

        // select the drop value in the Education Qualification drop down
        WebElement selectmartStat = wait.until(ExpectedConditions.elementToBeClickable(selectMartialStaus));
        selectmartStat.click();

    }

    public void employmentDetails(String Income , String Email , String empName) throws InterruptedException{

        // click the employment type
        WebElement clickEmpType = wait.until(ExpectedConditions.elementToBeClickable(clickEmployTpe));
        clickEmpType.click();

        // select the drop value in the eemployment type drop down
        WebElement selectEmploType = wait.until(ExpectedConditions.elementToBeClickable(selectEmployTpe));
        selectEmploType.click();

        // click the Industry type
        WebElement clickIndusTpye = wait.until(ExpectedConditions.elementToBeClickable(clickIndustryType));
        clickIndusTpye.click();

        // select the drop value in the Industry type drop down
        WebElement selectInduType = wait.until(ExpectedConditions.elementToBeClickable(selectIndustryType));
        selectInduType.click();

        // Add monthly Income
        WebElement monthIncome = wait.until(ExpectedConditions.visibilityOfElementLocated(monthlyIncomeSelect));
        monthIncome.sendKeys(Income);

        // Add Email Id
        WebElement emailId = wait.until(ExpectedConditions.visibilityOfElementLocated(officeEmailSelect));
        emailId.sendKeys(Email);

        // Add Name of the employee
        WebElement employeeName = wait.until(ExpectedConditions.visibilityOfElementLocated(clickEmployeeType));
        employeeName.click();
        Thread.sleep(4000);
        //data fill in the employee name
        WebElement employerInput = wait.until(ExpectedConditions.visibilityOfElementLocated(addDataInEmp));
        employerInput.sendKeys(empName);
        Thread.sleep(10000);

        // select the drop value in the Name Of the Employee drop down
        WebElement selectNameOfEmployee = wait.until(ExpectedConditions.elementToBeClickable(selectEmployeeType));
        selectNameOfEmployee.click();
        Thread.sleep(7000);

        // Click on the next  button on the lead details page
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(selectNextButton));
        nextButton.click();
        Thread.sleep(5000);


    }
}
