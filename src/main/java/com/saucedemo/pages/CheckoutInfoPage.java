package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPage {
	
	public WebDriver driver;
	
	public CheckoutInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstNameField;
	
	@FindBy(xpath ="//input[@id='last-name']")
	private WebElement lastNameField;
	
	@FindBy(xpath ="//input[@id='postal-code']")
	private WebElement postalCodeField;
	
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement infoPageContinueButton;
	
	
	public void enteringFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}
	
	public void enteringLastName(String lastname) {
		lastNameField.sendKeys(lastname);
	}

	public void enteringPostalCodeField(String zipcode) {
		postalCodeField.sendKeys("123456");
	}
	
	public void clickingContinue() {
		infoPageContinueButton.click();
	}

	
	
	
	
	
	
}
