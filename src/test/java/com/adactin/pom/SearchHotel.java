package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement Location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement Hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement Roomtype;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement Roomnos;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement Checkindate;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement Checkoutdate;
	
	@FindBy(xpath= "//select[@id='adult_room']")
	private WebElement Adultroom;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement Childroom;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement Search;

	public SearchHotel(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomnos() {
		return Roomnos;
	}

	public WebElement getCheckindate() {
		return Checkindate;
	}

	public WebElement getCheckoutdate() {
		return Checkoutdate;
	}

	public WebElement getAdultroom() {
		return Adultroom;
	}

	public WebElement getChildroom() {
		return Childroom;
	}

	public WebElement getSearch() {
		return Search;
	}

		
}
