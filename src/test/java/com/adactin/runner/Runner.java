package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
				 glue = "com\\adactin\\stepdefinition",
				 monochrome = true,
				 dryRun = false,
				 strict = true)
				 
public class Runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void Setup() {
		
		driver = BaseClass.getBrowser("chrome");

	}
	
/*	@AfterClass
	
	private void tearDown() {
		
		driver.quit();
	}*/
}
