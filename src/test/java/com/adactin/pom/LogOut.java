package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='logout']")
	public WebElement Logout;

	public LogOut(WebDriver wdriver) {
		
		this.driver = wdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return Logout;
	}
}
