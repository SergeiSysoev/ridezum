package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){super(driver);}

    @FindBy(css = ".m-btn.front-banner__btn")
    private List<WebElement> applyToDriveButton;


    public ApplyToDrivePage clickApplyToDriveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(applyToDriveButton.get(1)));
        applyToDriveButton.get(1).click();
        return new ApplyToDrivePage(driver);
    }




}
