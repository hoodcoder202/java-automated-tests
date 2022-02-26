package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankAppLoginPage {
	
	
	WebDriver driver;
	
	public BankAppLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h4[@class ='auth-header']")
	private WebElement loginPageHeader;
	
	@FindBy(xpath = "//input[@id ='username']")
	private WebElement BankAppUsername;

	@FindBy(xpath = "//input[@id ='password'")
	private WebElement BankAppPassword;

	@FindBy(xpath = "//input[@id= 'login-button']")
	private WebElement BankAppLoginButton;


public void getBroswer() {
	driver.get("https://demo.applitools.com/");
}

public void sendValidUserName(String username) {
	BankAppUsername.sendKeys("standard_user");
	
}

public void sendValidPassword(String password) {
   BankAppPassword.sendKeys("secret_sauce");	

}

public void clickingLoginButton() {
	BankAppLoginButton.click();
		
}


}