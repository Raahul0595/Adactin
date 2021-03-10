package com.mphasis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEvent {

	public static WebDriver driver;

	public EditEvent(WebDriver edriver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEquipmentType() {
		return EquipmentType;
	}

	public WebElement getChassis() {
		return Chassis;
	}

	public WebElement getEquipmentProvider() {
		return EquipmentProvider;
	}

	public WebElement getVehColorType() {
		return VehColorType;
	}

	public WebElement getDeptTerminal() {
		return DeptTerminal;
	}

	public WebElement getPowerUnit() {
		return PowerUnit;
	}

	public WebElement getContainer() {
		return Container;
	}

	public WebElement getDriver() {
		return Driver;
	}

	public WebElement getWithUnit() {
		return WithUnit;
	}

	public WebElement getLocType() {
		return LocType;
	}

	public WebElement getCallTime() {
		return CallTime;
	}

	public WebElement getAdd() {
		return Add;
	}

	public WebElement getServices() {
		return Services;
	}

	public WebElement getSave() {
		return Save;
	}

	@FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
	private WebElement EquipmentType;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement Chassis;

	@FindBy(xpath = "(//div[@class='select2-container form-control dont-ignore'])[1]")
	private WebElement EquipmentProvider;

	@FindBy(xpath = "//input[@name='vehicle_type_color']")
	private WebElement VehColorType;

	@FindBy(xpath = "(//div[@class='select2-container form-control'])[2]")
	private WebElement DeptTerminal;

	@FindBy(xpath = "(//input[@class='form-control name_in_upcase'])[1]")
	private WebElement PowerUnit;

	@FindBy(xpath = "(//input[@class='form-control name_in_upcase'])[4]")
	private WebElement Container;

	@FindBy(xpath = "(//span[@class='select2-arrow'])[5]")
	private WebElement Driver;

	@FindBy(xpath = "(//i[@class='fa fa-check-square fa-lg'])[1]")
	private WebElement WithUnit;

	@FindBy(xpath = "(//label[@class='btn btn-blue btn-sm btn-outlined false'])[1]")
	private WebElement LocType;

	@FindBy(xpath = "(//input[@class='form-control valid'])[2]")
	private WebElement CallTime;

	@FindBy(xpath = "//input[@id='event_address']")
	private WebElement Add;

	@FindBy(xpath = "(//i[@class='fa fa-plus'])[2]")
	private WebElement Services;

	@FindBy(xpath = "//button[@id='event-submit']")
	private WebElement Save;

}
