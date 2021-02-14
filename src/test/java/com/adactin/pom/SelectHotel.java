package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radiobutton;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement Search;

	public SelectHotel(WebDriver rdriver) {

		this.driver = rdriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getSearch() {
		return Search;
	}

}
