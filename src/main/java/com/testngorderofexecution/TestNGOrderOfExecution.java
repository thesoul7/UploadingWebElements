package com.testngorderofexecution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGOrderOfExecution {

@BeforeSuite
public void beforeSuite() {
System.out.println("Before Suite");
}

@BeforeClass
public void beforeClass() {
System.out.println("Before Class");
}

@BeforeTest
public void beforeTest() {
System.out.println("Before Test");
}

@BeforeMethod
public void beforeMethod1() {
System.out.println("Before Method");
}


@Test
public void testMethod1() {
System.out.println("Test1");
}

@Test
public void testMethod2() {
System.out.println("Test2");
}

@AfterTest
public void afterTest() {
System.out.println("After Test");
}

@AfterMethod
public void afterMethod1() {
System.out.println("After Method");
}

@AfterClass
public void afterClass() {
System.out.println("After Class");
}

@AfterSuite
public void afterSuite() {
System.out.println("After Suite");
}

}