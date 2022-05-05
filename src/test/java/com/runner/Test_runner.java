package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project_cucumber.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com.stepdefinition", monochrome = true, dryRun = false, strict = true, plugin = {
		"html:Report", "json:Report/cucumber.json" , "pretty" , "com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"})

public class Test_runner {

	public static WebDriver driver;// null

	@BeforeClass
	public static void setUp() {

		driver = BaseClass.browserLaunch("chrome");

	}

	@AfterClass
	public static void tear_down() {

		// driver.close();

		BaseClass.closeBrowser();
	}

}
