package com.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: karthikm
 * Date: 16/03/12
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseClassTest {


@DataProvider(name = "test1")
public Object[][] createData1() {
 return new Object[][] {
   { "Cedric", new Integer(36) },
   { "Anne", new Integer(37)},
         {"Karthik" , new Integer(25)}
 };
}

//This test method declares that its data should be supplied by the Data Provider
//named "test1"

@Test(dataProvider = "test1")
public void verifyData1(String n1, Integer n2) {
 System.out.println(n1 + " " + n2);
}

}
