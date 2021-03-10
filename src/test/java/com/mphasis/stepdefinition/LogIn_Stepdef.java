package com.mphasis.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.mphasis.baseclass.BaseClass;
import com.mphasis.helper.PageObjectManager;
import com.mphasis.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogIn_Stepdef extends BaseClass{

	
public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User launches the application$")
	public void User_launches_the_application() throws Throwable {

		getUrl("https://autotrucktd.testing.reach24.net/users/sign_in");
		
	}
	
	@When("^User enters User name as \"([^\"]*)\"$")
	public void User_enters_User_name_as(String arg1) throws Throwable {

		InputToElement(pom.getLi().getUsername(), arg1);
		
		}
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void User_enters_password_as(String arg1) throws Throwable {

		InputToElement(pom.getLi().getPassword(), arg1);
		
		}
	
	@Then("^User verfies the valid username and password$")
	public void User_verfies_the_valid_username_and_password() throws Throwable {

		clickOnElement(pom.getLi().getLogin());
		
		}
}
	
	
