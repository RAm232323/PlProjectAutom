package org.example.base.pl;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class baseClass {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setup() {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Browser Driver\\chromedriver.exe");

        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Initialize WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the login page
        driver.get("https://flopartner-uat.dmifinance.in/login");
    }
}