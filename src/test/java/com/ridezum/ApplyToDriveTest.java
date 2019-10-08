package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ApplyToDriveTest extends BaseTest {
    private HomePage homePage;
    private ApplyToDrivePage applyToDrivePage;

    @Test
    public void testApplyToDrive() throws InterruptedException {
        homePage = new HomePage(driver);
        applyToDrivePage = homePage.clickApplyToDriveButton();
        Assert.assertEquals("Zumer, Become a Driver, Drivers for Kids | Zum", applyToDrivePage.driver.getTitle());

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyToDrivePage.inputFirsName(user.getFirstName());
        applyToDrivePage.inputLastName(user.getLastName());
        applyToDrivePage.inputEmail(user.getEmail());
        applyToDrivePage.inputPhone(user.getPhone());
        applyToDrivePage.selectArea(3);
//        applyToDrivePage.selectAreaName("California");
        Thread.sleep(3000);
        applyToDrivePage.inputReferral(user.getReferal());
        driver.switchTo().defaultContent();
        applyToDrivePage.clickCareersButton();


    }








}
