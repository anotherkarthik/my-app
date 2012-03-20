package com.demo;

import com.sun.tools.internal.xjc.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class FirstTest {

    private WebDriver driver;

    @BeforeSuite
    public void getBrowserHandle() {
    driver = DriverProvider.getDriver();
        }

    @Test
    public void one() {

//        driver = new FirefoxDriver();      -- we don't have to do this inside the test as we have the driver
        // instance available in @BeforeSuite method - which will ensure that the driver is initialized before
        // any of the tests start to run

        driver.navigate().to("http://www.google.co.in");
        ((JavascriptExecutor) driver).executeScript("document.body.innerHTML = '<br>'");

    }

    @Test  (groups = { "regression"} )

    public void two() {
        driver.navigate().to("http://yahoomail.com");
        System.out.print("hello from two in FirstTest");
    }

    @AfterSuite
    public void KillAll() {
    driver.quit();
        System.out.println("Kill form FirstTest");
    }
}
