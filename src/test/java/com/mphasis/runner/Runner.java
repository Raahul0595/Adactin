package com.mphasis.runner;

import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mphasis.baseclass.BaseClass;
import com.mphasis.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\mphasis\\feature\\mphasis.feature",
				 glue = "com\\mphasis\\stepdefinition",
				 monochrome = true,
				 dryRun = false,
				 strict = true)
				 
				 
public class Runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void Setup() throws IOException {
		
		String browsername = FileReaderManager.getInstance().getCRInstance().getBrowser();
		driver = BaseClass.getBrowser(browsername);
		
		String url = FileReaderManager.getInstance().getCRInstance().getUrl();
		driver = BaseClass.getUrl(url);
		
		}
	
	

}
