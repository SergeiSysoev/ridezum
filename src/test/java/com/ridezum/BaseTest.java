package com.ridezum;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;
    protected static User user;



    @BeforeClass
    public static void setUp() {
        user = new User("Sam","Black","Profil23","p2533155552@gmail.com","(123) 456-7890", "123456789");

        System.setProperty("webdriver.chrome.driver", "/Users/sergeisysoev/Automation/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://ridezum.com/");
        Assert.assertEquals("Zūm", driver.getTitle());
    }

    @AfterClass
    public static void finish(){
        driver.quit();
    }
}
