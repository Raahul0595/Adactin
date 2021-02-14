package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.LogOut;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Logout_Stepdefinition extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	
	LogOut lo = new LogOut(driver);

	@Given("^User logs out from the site$")
	public void user_logs_out_from_the_site() throws Throwable {
	    
	    
	}

	@When("^User logs out from the hotel booking app$")
	public void user_logs_out_from_the_hotel_booking_app() throws Throwable {
	    
	    
	}

	@When("^User clicks log out button$")
	public void user_clicks_log_out_button() throws Throwable {
	    
		clickOnElement(lo.getLogout());
	    
	}

	@Then("^User comes out from the app$")
	public void user_comes_out_from_the_app() throws Throwable {
	    
	    
	}
}
