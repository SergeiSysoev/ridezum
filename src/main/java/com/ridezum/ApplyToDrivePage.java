package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyToDrivePage extends BasePage {
    public ApplyToDrivePage(WebDriver driver){super(driver);}

    @FindBy(css = "#application_form_first_name")
    private WebElement firsNameField;
    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;
    @FindBy(css = "#application_form_email")
    private WebElement emailField;
    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneField;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement selectAreaField;

    @FindBy(css = "#application_form_refcode")
    private WebElement referralField;

    @FindBy(css = ".main-menu__link")
    private List<WebElement>careersButton;

    @FindBy(css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButton;

    @FindBy(css = ".help-block")
    private List<WebElement>request;


    public void inputFirsName(String firsName){ wait.until(ExpectedConditions.elementToBeClickable(firsNameField)); firsNameField.sendKeys(firsName); }

    public void inputLastName(String lastName){ wait.until(ExpectedConditions.elementToBeClickable(lastNameField)); lastNameField.sendKeys(lastName); }

    public void inputEmail(String email){ emailField.sendKeys(email); }

    public void inputPhone(String phone){ phoneField.sendKeys(phone); }

    public void selectArea(int i){ Select select = new Select(selectAreaField);select.selectByIndex(i); }
    public void selectAreaName(String city){ Select select = new Select(selectAreaField);select.deselectByVisibleText(city); }

    public void inputReferral(String referral){ referralField.sendKeys(referral); }

    public void clickCareersButton(){wait.until(ExpectedConditions.elementToBeClickable(careersButton.get(4)));careersButton.get(4).click();}

    public String getRequest0() { wait.until(ExpectedConditions.visibilityOf(request.get(0)));return request.get(0).getText(); }
    public String getRequest1() { wait.until(ExpectedConditions.visibilityOf(request.get(1)));return request.get(1).getText(); }
    public String getRequest2() { wait.until(ExpectedConditions.visibilityOf(request.get(2)));return request.get(2).getText(); }
    public String getRequest3() { wait.until(ExpectedConditions.visibilityOf(request.get(3)));return request.get(3).getText(); }
    public String getRequest4() { wait.until(ExpectedConditions.visibilityOf(request.get(4)));return request.get(4).getText(); }
    public String getRequest5() { wait.until(ExpectedConditions.visibilityOf(request.get(5)));return request.get(5).getText(); }
    public String getRequest6() { wait.until(ExpectedConditions.visibilityOf(request.get(6)));return request.get(6).getText(); }
    public String getRequest7() { wait.until(ExpectedConditions.visibilityOf(request.get(7)));return request.get(7).getText(); }
    public String getRequest8() { wait.until(ExpectedConditions.visibilityOf(request.get(8)));return request.get(8).getText(); }
    public String getRequest9() { wait.until(ExpectedConditions.visibilityOf(request.get(9)));return request.get(9).getText(); }
    public String getRequest10() { wait.until(ExpectedConditions.visibilityOf(request.get(10)));return request.get(10).getText(); }
    public String getRequest11() { wait.until(ExpectedConditions.visibilityOf(request.get(11)));return request.get(11).getText(); }
    public String getRequest12() { wait.until(ExpectedConditions.visibilityOf(request.get(12)));return request.get(12).getText(); }
    public String getRequest13() { wait.until(ExpectedConditions.visibilityOf(request.get(13)));return request.get(13).getText(); }


    public void clickFirstName(){firsNameField.click();}
    public void clickLastName(){lastNameField.click();}
    public void clickEmailField(){emailField.click();}
    public void clickPhoneField(){phoneField.click();}
    public void clickSelectAreaField(){selectAreaField.click();}
    public void clickReferalField(){referralField.click();}
    public void clickSubmitButton(){submitButton.click();}











}


