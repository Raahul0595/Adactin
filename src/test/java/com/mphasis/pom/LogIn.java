package com.mphasis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

	public static WebDriver driver;
	
	public LogIn(WebDriver edriver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement username;

	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	private WebElement password;

	@FindBy(xpath = "//button[@name='button']")
	private WebElement Login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}

}
