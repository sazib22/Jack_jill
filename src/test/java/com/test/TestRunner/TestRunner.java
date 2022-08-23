package com.test.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.test.util.testbase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/features"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue = "stepdep",
tags= {"@Signin"})



public class TestRunner extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void setUP() {
		
		testbase test=new testbase();
		test.init();
	}

	//@AfterTest
	//public void close() {
		
		//testbase test=new testbase();
		//test.driver.quit();
	}
//}
