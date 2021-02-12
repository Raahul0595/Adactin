package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.LogInPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class LoginStepdefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	LogInPage lp = new LogInPage(driver);

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {

		getUrl("http://adactinhotelapp.com/");

	}

	@When("^User enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {

		InputToElement(lp.getUsername(), arg1);

	}

	@When("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {

		InputToElement(lp.getPassword(), arg1);

	}

	@Then("^User verifies the valid username and password$")
	public void user_verifies_the_valid_username_and_password() throws Throwable {

		clickOnElement(lp.getLogin());

	}

}
