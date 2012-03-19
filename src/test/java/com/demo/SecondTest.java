package com.demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SecondTest {

    private WebDriver driver;

    @Test
    public void three() {
        driver = DriverProvider.getDriver();
        driver.navigate().to("http://testng.org");
        Assert.assertEquals(driver.getTitle(),"sdfsd");
    }


    @AfterSuite
    public void Killme() {

        System.out.println("Kill from SecondTest");

    }

}
