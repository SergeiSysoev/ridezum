package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class RequstTest extends BaseTest{

    private HomePage homePage;
    private ApplyToDrivePage applyToDrivePage;

    @Test
    public void testRequest()  {
        homePage = new HomePage(driver);
        applyToDrivePage = homePage.clickApplyToDriveButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
        applyToDrivePage.clickSubmitButton();

//        applyToDrivePage.clickFirstName();
//        applyToDrivePage.clickLastName();
//        applyToDrivePage.clickEmailField();
//        applyToDrivePage.clickPhoneField();
//        applyToDrivePage.clickSelectAreaField();
//        applyToDrivePage.clickReferalField();


        System.out.println(applyToDrivePage.getRequest0());
        System.out.println(applyToDrivePage.getRequest2());
        System.out.println(applyToDrivePage.getRequest5());
        System.out.println(applyToDrivePage.getRequest7());
        System.out.println(applyToDrivePage.getRequest9());
        System.out.println(applyToDrivePage.getRequest11());


        Assert.assertEquals("Please enter a value", applyToDrivePage.getRequest0());
        Assert.assertEquals("Please enter a value", applyToDrivePage.getRequest2());
        Assert.assertEquals("Please enter a value", applyToDrivePage.getRequest5());
        Assert.assertEquals("Please enter a value", applyToDrivePage.getRequest7());
        Assert.assertEquals("Please enter a value", applyToDrivePage.getRequest9());
        Assert.assertEquals("Please enter a value", applyToDrivePage.getRequest11());





    }
}