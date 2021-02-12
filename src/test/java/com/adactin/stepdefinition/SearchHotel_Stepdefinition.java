package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.SearchHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class SearchHotel_Stepdefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	SearchHotel sh = new SearchHotel(driver);

	@Given("^User searches the hotel$")
	public void user_searches_the_hotel() throws Throwable {

		// selectByOption(sh.getLocation(), "New York", "VisibleText");

	}

	@When("^User selects the location as \"([^\"]*)\"$")
	public void user_selects_the_location_as(String arg1) throws Throwable {

		selectByOption(sh.getLocation(), "New York", "VisibleText");

	}

	@When("^User selects the hotel as \"([^\"]*)\"$")
	public void user_selects_the_hotel_as(String arg1) throws Throwable {

		selectByOption(sh.getHotels(), "Hotel Sunshine", "VisibleText");

	}

	@When("^User selects the room type as \"([^\"]*)\"$")
	public void user_selects_the_room_type_as(String arg1) throws Throwable {

		selectByOption(sh.getRoomtype(), "Deluxe", "VisibleText");

	}

	@When("^User selects the number of rooms as \"([^\"]*)\"$")
	public void user_selects_the_number_of_rooms_as(String arg1) throws Throwable {
		selectByOption(sh.getRoomnos(), "2 - Two", "VisibleText");

	}

	@When("^User enters the check in date as \"([^\"]*)\"$")
	public void user_enters_the_check_in_date_as(String arg1) throws Throwable {
		InputToElement(sh.getCheckindate(), arg1);

	}

	@When("^User enters the check out date as \"([^\"]*)\"$")
	public void user_enters_the_check_out_date_as(String arg1) throws Throwable {

		InputToElement(sh.getCheckoutdate(), arg1);

	}

	@When("^User selects the adults per room$")
	public void user_selects_the_adults_per_room() throws Throwable {
		selectByOption(sh.getAdultroom(), "2 - Two", "VisibileText");
	}

	@When("^User selects the children per room$")
	public void user_selects_the_children_per_room() throws Throwable {

		selectByOption(sh.getChildroom(), "1 - One", "VisibleText");
	}

	@Then("^User finalizes everything and gives search$")
	public void user_finalizes_everything_and_gives_search() throws Throwable {
		clickOnElement(sh.getSearch());

	}

	}
