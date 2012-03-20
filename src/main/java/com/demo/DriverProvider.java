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

    /*
    The constructor below is made private to avoid other classes instantiating the DriverProvider class
     */

    private DriverProvider() {

        /*
        to enable firefox to accept in-valid digital certificates,
         */
      // firefoxProfile.setAssumeUntrustedCertificateIssuer(false);

//        firefoxProfile.setAcceptUntrustedCertificates(true);
        /*
        to start firefox from a custom location, uncomment the below code
         */
//        firefoxProfile.setPreference("webdriver.firefox.bin","/opt/firefox7/firefox.bin");

        /*
        if you have to start firefox with the above settings mentioned for profile object pass it as an argument to the
        FirefoxDriver() below

         */
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
