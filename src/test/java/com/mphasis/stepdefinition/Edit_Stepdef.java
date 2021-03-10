package com.mphasis.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.mphasis.baseclass.BaseClass;
import com.mphasis.helper.PageObjectManager;
import com.mphasis.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Edit_Stepdef extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User selects the equipment type$")
	public void User_selects_the_equipment_type() throws Throwable {

		selectByOption(pom.getSh().getEquipmentType(), "Chassis", "VisibleText");
	}
		
		@When("^User enters Chasis number as \"([^\"]*)\"$")
		public void User_enters_Chasis_number_as(String arg1) throws Throwable {

			selectByOption(pom.getSh().getChassis(),"BEST561255", "VisibleText");

		}
		
		@When("^User enters Equipment provider as \"([^\"]*)\"$")
		public void User_enters_Equipment_provider_as(String arg1) throws Throwable {

			selectByOption(pom.getSh().getEquipmentProvider(), "1066480 BC LTD", "VisibleText");

		}
		

		@When("^User enters Vehicle type and color as \"([^\"]*)\"$")
		public void User_enters_Vehicle_type_and_color_as(String arg1) throws Throwable {

			selectByOption(pom.getSh().getVehColorType(), "Blue", "VisibleText");

		}
		
		@When("^User selects the departed terminals$")
		public void User_selects_the_departed_terminals(String arg1) throws Throwable {

			

		}
		
		@When("^User enters the departed date as \"([^\"]*)\"$")
		public void User_enters_the_departed_date_as(String arg1) throws Throwable {

			

		}
		
		@When("^User enters the associated power unit as \"([^\"]*)\"$")
		public void User_enters_the_associated_power_unit_as(String arg1) throws Throwable {

			selectByOption(pom.getSh().getPowerUnit(), "Tractor", "VisibleText");

		}
		
		@When("^User enters the associated container as \"([^\"]*)\"$")
		public void User_enters_the_associated_container_as(String arg1) throws Throwable {

			selectByOption(pom.getSh().getContainer(), "Container", "VisibleText");

		}
		
		@When("^User enters the Unit available as \"([^\"]*)\"$")
		public void User_enters_the_Unit_available_as(String arg1) throws Throwable {

			selectByOption(pom.getSh().getWithUnit(), "3/10/2021 7:00 PM", "VisibleText");

		}
		
		@When("^User selects the Driver$")
		public void user_selects_the_number_of_rooms_as(String arg1) throws Throwable {
		

		}
		
		@When("^User selects the Unit$")
		public void User_selects_the_Unit(String arg1) throws Throwable {

			

		}
		
		@When("^User selects the location type as \"([^\"]*)\"$")
		public void User_selects_the_location_type_as(String arg1) throws Throwable {

			selectByOption(pom.getSh().getLocType(), "Roadside", "VisibleText");

		}
		
		@When("^User enters the repair time as \"([^\"]*)\"$")
		public void User_enters_the_repair_time_as(String arg1) throws Throwable {

			

		}
		
		@When("^User ticks the loaded field$")
		public void User_ticks_the_loaded_field(String arg1) throws Throwable {

			

		}
		
		@When("^User enters the address as \"([^\"]*)\"$")
		public void User_enters_the_address_as(String arg1) throws Throwable {

			selectByOption(pom.getSh().getAdd(), "Velachery, Chennai, Tamil Nadu, India", "VisibleText");

		}
		
		

		
		@When("^User enters the breakdown location notes as \"([^\"]*)\"$")
		public void User_enters_the_breakdown_location_notes_as(String arg1) throws Throwable {

			selectByOption(pom.getSh().getLocType(), "AAAA", "VisibleText");

		}
		
		@When("^User enters the Reported by \"([^\"]*)\"$")
		public void User_enters_the_Reported_by(String arg1) throws Throwable {

			

		}
		
		@When("^User enters the phone number as \"([^\"]*)\"$")
		public void User_enters_the_phone_number_as(String arg1) throws Throwable {

		

		}
		
		@Then("^User verifies all the details and clicks save$")
		public void User_verifies_all_the_details_and_clicks_save () throws Throwable {
			clickOnElement(pom.getSh().getSave());

		}
		
		
		
	}


