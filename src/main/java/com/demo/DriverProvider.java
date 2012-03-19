package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * Hello world!
 */
public class DriverProvider {
    private static DriverProvider driverProvider;

    private WebDriver driver;

    private FirefoxProfile firefoxProfile = new FirefoxProfile();

    private DriverProvider() {

      // firefoxProfile.setAssumeUntrustedCertificateIssuer(false);

//        firefoxProfile.setAcceptUntrustedCertificates(true);
//        firefoxProfile.setPreference("webdriver.firefox.bin","/opt/firefox7/firefox.bin");
        driver = new FirefoxDriver();
    }

    public static WebDriver getDriver() {
        if (driverProvider == null) {
            driverProvider = new DriverProvider();
        }
        return driverProvider.driver;
    }

    public void demo() {
        System.out.println("Hello World!");
    }

}
