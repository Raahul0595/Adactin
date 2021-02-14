package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.BookHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class BookHotel_Stepdefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	BookHotel bh = new BookHotel(driver);

	@Given("^User books the hotel$")
	public void user_books_the_hotel() throws Throwable {

	}

	@When("^User enters \"([^\"]*)\" as first name$")
	public void user_enters_as_first_name(String arg1) throws Throwable {

		InputToElement(bh.getFirstname(), arg1);

	}

	@When("^User enters \"([^\"]*)\" as last name$")
	public void user_enters_as_last_name(String arg1) throws Throwable {

		InputToElement(bh.getLastname(), arg1);
	}

	@When("^User enters Billing address as \"([^\"]*)\"$")
	public void user_enters_Billing_address_as(String arg1) throws Throwable {

		InputToElement(bh.getBilling(), arg1);

	}

	@When("^User enters Credit card number as \"([^\"]*)\"$")
	public void user_enters_Credit_card_number_as(String arg1) throws Throwable {

		InputToElement(bh.getCreditNo(), arg1);

	}

	@When("^User selects the credit card type$")
	public void user_selects_the_credit_card_type() throws Throwable {

		selectByOption(bh.getCreditType(), "Master Card", "VisibleText");
	}

	@When("^User selects the expiry month of the credit card$")
	public void user_selects_the_expiry_month_of_the_credit_card() throws Throwable {

		selectByOption(bh.getExpiryMonth(), "May", "VisibleText");
	}

	@When("^User selects the expiry year of the credit card$")
	public void user_selects_the_expiry_year_of_the_credit_card() throws Throwable {

		selectByOption(bh.getExpiryYear(), "2022", "VisibleText");

	}

	@When("^User enters the CVV number as \"([^\"]*)\"$")
	public void user_enters_the_CVV_number_as(String arg1) throws Throwable {

		InputToElement(bh.getCVV(), arg1);
	}

	@Then("^User finalizes everything and gives book now$")
	public void user_finalizes_everything_and_gives_book_now() throws Throwable {

		clickOnElement(bh.getBooknow());

	}
}
