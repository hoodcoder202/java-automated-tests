package com.saucedemo.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tevin\\Chrome driver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement userNameField;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@id= 'login-button']")
	private WebElement loginButton;
	
	
	
	
	
	public void getBroswer() {
		driver.get("https://www.saucedemo.com/");
	}
	
	public void sendValidUserName(String username) {
		userNameField.sendKeys("standard_user");
		
	}
	
	public void sendValidPassword(String password) {
	   passwordField.sendKeys("secret_sauce");	
	
	}
		
	public void clickingLoginButton() {
		loginButton.click();
			
	}

	public void validateLoginPageTitle() {
		
		String title = driver.getTitle().toString();
		
		Assert.assertEquals("Swag Lab", title);
		
	}
	

	
	
	
	
	

}
