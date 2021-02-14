package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement Firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement Lastname;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement Billing;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement CreditNo;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement CreditType;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement ExpiryMonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement ExpiryYear;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement CVV;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement Booknow;

	public BookHotel(WebDriver bdriver) {
		this.driver = bdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getBilling() {
		return Billing;
	}

	public WebElement getCreditNo() {
		return CreditNo;
	}

	public WebElement getCreditType() {
		return CreditType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBooknow() {
		return Booknow;
	}

}
