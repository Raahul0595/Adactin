package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class SelectHotel_Stepdefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	SelectHotel seh = new SelectHotel(driver);

	@Given("^User selects the hotel$")
	public void user_selects_the_hotel() throws Throwable {

	}

	@When("^User chooses the selected hotel$")
	public void user_chooses_the_selected_hotel() throws Throwable {

		

	}

	@When("^User Chooses the hotel and clicks it$")
	public void user_Chooses_the_hotel_and_clicks_it() throws Throwable {

		clickOnElement(seh.getRadiobutton());

	}

	@Then("^User gives continue$")
	public void user_gives_continue() throws Throwable {

		clickOnElement(seh.getSearch());

	}
}
