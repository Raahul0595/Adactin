package com.mphasis.helper;

import org.openqa.selenium.WebDriver;

import com.mphasis.pom.EditEvent;
import com.mphasis.pom.LogIn;

public class PageObjectManager {

	public static WebDriver driver;

	private EditEvent Sh;
	private LogIn li;

	public PageObjectManager(WebDriver edriver) {
		this.driver = edriver;
	}

	public EditEvent getSh() {
		Sh = new EditEvent(driver);
		return Sh;
	}

	public LogIn getLi() {
		li = new LogIn(driver);
		return li;
	}
}
