package org.example.All.test.run;

import org.example.lead.details.page.leadDetails;
import org.example.leadDetailsAddress.page.addressInformation;
import org.example.leadDetailsLeadInformation.page.leadInformation;
import org.example.loanDetails.page.loanDetails;
import org.example.page.pl.loginPage;
import org.example.base.pl.baseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class allTestRun extends baseClass {

    String userName = "PLTestUser";
    String password = "Hello@123";
    loginPage lp;
    loanDetails LDP;
    leadDetails LeaDe;
    leadInformation leadInfo;
    addressInformation leadAddress;

    @BeforeMethod
    public void initPage() {
        // create object of all pages
        lp = new loginPage(driver , wait);
        LDP = new loanDetails(driver , wait);
        LeaDe = new leadDetails(driver , wait);
        leadInfo = new leadInformation(driver , wait);
        leadAddress = new addressInformation(driver , wait);

    }

    @Test
    public void testLoginPage() {
        // Call login method
        lp.login(userName, password);
    }

    @Test(dependsOnMethods = {"testLoginPage"})
    public void clickDashboardButton(){
        // Call clickDashboard method
        lp.clickDashboard();
    }

    @Test(dependsOnMethods = {"clickDashboardButton"})
    public void clickNewLeadButton(){

        // call clickCreateNewLead Method
        lp.clickCreateNewLead();
    }

    @Test(dependsOnMethods = {"clickNewLeadButton"})
    public void loanDetailsData() throws InterruptedException{

        // Call loanDetailsData method
        LDP.fillLoanDetailsData("100000");
    }

    @Test(dependsOnMethods = {"loanDetailsData"})
    public void leaadDetails() throws InterruptedException{
        LeaDe.fillLeadDetailsData("brwpy3540b" , "yashk.yad@sequencetechno.com" , "8168585040" , "123001" , "YASH" , "KUMAR" , "YADAV");
        LeaDe.leadDetailsButton();
    }

    @Test(dependsOnMethods = {"leaadDetails"})
    public void leadInformation() throws InterruptedException{
        leadInfo.fillLeadInformation();
        leadInfo.employmentDetails("100000" , "yashk.yad@sequencetechno.com" , "DMI");
    }
    @Test(dependsOnMethods = {"leadInformation"})
    public void leadAddressInfo() throws InterruptedException{
        leadAddress.fillCurrentAddress("121" , "Narnaul" , "Huda Sector 1" , "test address");
        leadAddress.fillPermanentAddress();
        leadAddress.fillOfficeAddress("test office address" , " test office 2 near by" ,  "hahaha" ,  "123001");
    }
}
