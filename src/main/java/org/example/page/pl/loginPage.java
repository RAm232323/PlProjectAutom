package org.example.page.pl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginPage {
    WebDriver driver;
    WebDriverWait wait;

    // Select the username and  password by css selector
    By usernameField = By.cssSelector("input[formcontrolname='username']");
    By passwordField = By.cssSelector("input[formcontrolname='password']");

    // Select the login button by xpath
    By loginButton = By.xpath("//button[contains(text(),'Login')]");

    // Select the Dashboard button by xpath
    By plDashboardXpath = By.xpath("//button[contains(text(),'Dashboard') and not(@disabled)]");

    //  Select the create new lead by xpath
    By createNewLeadButton = By.xpath("//span[contains(text(),'New Lead')]");





    public loginPage(WebDriver driver , WebDriverWait wait) {
       this.driver = driver;
       this.wait = wait;
    }


    // Login in page using the username and password
    public void login(String userName, String password) {
        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        user.sendKeys(userName);
        pass.sendKeys(password);
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        el.click();
    }

    //  Click on the dashboard to  ender the dashboard
    public void clickDashboard(){
        System.out.println("Trying to click Dashboard...");
        System.out.println("Element text: " + plDashboardXpath.toString());
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(plDashboardXpath));
//        System.out.println("Full Element Info:");
//        System.out.println("Tag: " + el.getTagName());
//        System.out.println("Text: " + el.getText());
//        System.out.println("Class: " + el.getAttribute("class"));
//        System.out.println("ID: " + el.getAttribute("id"));
//        System.out.println("HTML: " + el.getAttribute("outerHTML"));
        el.click();
    }

    public void clickCreateNewLead(){

        WebElement newLead = wait.until(ExpectedConditions.visibilityOfElementLocated(createNewLeadButton));
        newLead.click();

    }



}
