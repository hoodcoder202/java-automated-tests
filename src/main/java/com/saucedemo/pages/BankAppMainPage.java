package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankAppMainPage {
	
	
WebDriver driver;
	
	public BankAppMainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[. ='Add Account']")
	private WebElement BankAppAddAccount;
	
	@FindBy(xpath = "//*[@class ='balance-link']")
	private WebElement BankAppViewStatement;

	@FindBy(xpath = "//*[@class ='badge badge-success']")
	private WebElement BankAppRestuarantCafe;



public void getBroswer() {
	driver.get("https://demo.applitools.com/");
}

public void clickBankAddAccount() {
	BankAppAddAccount.click();
	
}

public void clickBankAppViewStatement() {
   BankAppViewStatement.click();	

}

public void clickBankAppRestuarantCafe() {
	   BankAppRestuarantCafe.click();	

	}
	
	
	
	
	

}
